package com.coding.dojo.args;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SchemaTest {
  @Test(dataProvider = "default_value")
  public void should_return_schema_default_value(Schema schema, Object expected) {
    Assert.assertEquals(schema.getValue(), expected);
  }

  @Test(dataProvider = "given_value")
  public void should_return_schema_value_by_type(Schema schema, String value, Object expected) {
    Assert.assertEquals(schema.getValue(value), expected);
  }

  @DataProvider
  public Object[][] given_value() {
    return new Object[][] {
      {new Schema<>(Boolean.class, Boolean.FALSE), "", Boolean.TRUE},
      {new Schema<>(Integer.class, 0), "10", 10},
      {new Schema<>(String.class, ""), "10", "10"},
    };
  }

  @DataProvider
  public Object[][] default_value() {
    return new Object[][] {{new Schema<>(Boolean.class, Boolean.FALSE), Boolean.FALSE}};
  }
}
