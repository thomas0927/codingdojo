package com.coding.dojo.args;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SchemaTest {
  @Test(dataProvider = "return_default_value")
  public void should_return_default_value(Schema schema, Object defaultValue) {
    Assert.assertEquals(schema.getValue(), defaultValue);
  }

  @Test(dataProvider = "return_given_value")
  public void should_return_given_value(Schema schema, String value, Object expected) {
    Assert.assertEquals(schema.getValue(value), expected);
  }

  @DataProvider
  public Object[][] return_given_value() {
    return new Object[][] {
      {new Schema(Boolean.class, Boolean.FALSE), "", Boolean.TRUE},
      {new Schema(Integer.class, 0), "1008", 1008},
    };
  }

  @DataProvider
  public Object[][] return_default_value() {
    return new Object[][] {
      {new Schema(Boolean.class, Boolean.FALSE), Boolean.FALSE},
      {new Schema(Integer.class, 0), 0},
    };
  }
}
