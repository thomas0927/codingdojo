package com.coding.dojo.args;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SchemasTest {
  private Schemas schemas;

  @BeforeTest
  public void beforeTest() {
    this.schemas = new Schemas("l:boolean");
  }

  @Test(dataProvider = "schemas_list")
  public void should_return_correct_schemas(Character flag, String value, Object expected) {
    Assert.assertEquals(schemas.getArgsValue(flag, value), expected);
  }

  @DataProvider
  public Object[][] schemas_list() {
    return new Object[][] {{'l', "", Boolean.TRUE}};
  }
}
