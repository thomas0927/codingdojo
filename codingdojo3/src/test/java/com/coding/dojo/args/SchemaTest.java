package com.coding.dojo.args;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SchemaTest {
  @Test(dataProvider = "schema_check")
  public void should_return_default_value_by_schema(
      Schema schema, String value, Object defaultValue, Object expected) {
    Assert.assertEquals(schema.getValue(), defaultValue);
    Assert.assertEquals(schema.getValue(value), expected);
  }

  @DataProvider
  public Object[][] schema_check() {
    return new Object[][] {
      {new Schema(Boolean.class, Boolean.FALSE), "", Boolean.FALSE, Boolean.TRUE}
    };
  }
}
