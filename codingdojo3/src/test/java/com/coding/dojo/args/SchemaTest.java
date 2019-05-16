package com.coding.dojo.args;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SchemaTest {

  @Test(dataProvider = "default_schema")
  public void can_return_default_value(Schema schema, Object expected) {
    Assert.assertEquals(schema.getValue(), expected);
  }

  @DataProvider
  public Object[][] default_schema() {
    return new Object[][] {
      {new Schema(Boolean.class, Boolean.FALSE), Boolean.FALSE},
      {new Schema(Integer.class, 0), 0},
    };
  }
}
