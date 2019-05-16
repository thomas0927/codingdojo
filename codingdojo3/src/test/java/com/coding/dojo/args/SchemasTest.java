package com.coding.dojo.args;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SchemasTest {
  private Schemas schemas;

  @BeforeTest
  public void beforeTest() {
    this.schemas = new Schemas("l:bool");
  }

  @Test(dataProvider = "schema_value")
  public void can_return_schema_value(Character flag, String value, Object expected) {
    Assert.assertEquals(schemas.getArgsValue(flag, value), expected);
  }

  @DataProvider
  public Object[][] schema_value() {
    return new Object[][] {{'l', "", Boolean.TRUE}};
  }
}
