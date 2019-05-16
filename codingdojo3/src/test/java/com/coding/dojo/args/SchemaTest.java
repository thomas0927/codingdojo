package com.coding.dojo.args;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SchemaTest {
  @Test(dataProvider = "schema_check_default")
  public void should_return_default_value_by_schema(Schema schema, Object defaultValue) {
    Assert.assertEquals(schema.getValue(), defaultValue);
    Assert.assertEquals(schema.getValue(null), defaultValue);
  }

  @Test(dataProvider = "schema_check_value")
  public void should_return_value_as_schema_type(Schema schema, String value, Object actualValue) {
    Assert.assertEquals(schema.getValue(value), actualValue);
  }

  @DataProvider
  public Object[][] schema_check_value() {
    return new Object[][] {
      {new Schema<>(Boolean.class, Boolean.FALSE), "", Boolean.TRUE},
      {new Schema<>(Integer.class, 0), "10", 10},
      {new Schema<>(String.class, ""), "/usr", "/usr"}
    };
  }

  @DataProvider
  public Object[][] schema_check_default() {
    return new Object[][] {
      {new Schema(Boolean.class, Boolean.FALSE), Boolean.FALSE},
      {new Schema(Boolean.class, Boolean.FALSE), Boolean.FALSE},
      {new Schema(Integer.class, 0), 0}
    };
  }
}
