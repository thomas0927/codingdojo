package com.coding.dojo.args;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SchemaTest {
  @Test(dataProvider = "schema_default_value")
  public void should_get_schema_default_value(Class clz, Object resultValue, Object defaultValue) {
    Schema schema = new Schema(clz, defaultValue);
    Assert.assertEquals(schema.getValue(), resultValue);
  }

  @Test
  public void should_parser_schema_value() {
    Schema schema = new Schema(Boolean.class, Boolean.FALSE);
    Assert.assertEquals(schema.getValue(""), Boolean.TRUE);
  }

  @DataProvider
  public Object[][] schema_default_value() {
    return new Object[][] {
      {Boolean.class, Boolean.FALSE, Boolean.FALSE},
      {Integer.class, 0, 0},
      {String.class, "/log", "/log"}
    };
  }
}
