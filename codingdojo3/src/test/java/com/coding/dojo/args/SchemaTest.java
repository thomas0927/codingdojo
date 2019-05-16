package com.coding.dojo.args;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SchemaTest {
  private Schema schema;

  @BeforeTest
  public void beforeTest() {
    this.schema = new Schema(Boolean.class, Boolean.FALSE);
  }

  @Test(dataProvider = "default_schema")
  public void can_return_default_value(Object expected) {
    Assert.assertEquals(schema.getValue(), expected);
  }

  @DataProvider
  public Object[][] default_schema() {
    return new Object[][] {
      {Boolean.FALSE},
    };
  }
}
