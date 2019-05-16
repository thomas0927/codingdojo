package com.coding.dojo.args;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SchemasTest {
  private Schemas schemas;

  @BeforeTest
  public void beforeTest() {
    this.schemas = new Schemas("l:boolean p:integer");
  }

  @Test(dataProvider = "schemas_list")
  public void can_return_correct_type_of_value_by_schemas(
      Character flag, String value, Object expected) {
    Assert.assertEquals(schemas.getArgsValue(flag, value), expected);
  }

  @DataProvider
  public Object[][] schemas_list() {
    return new Object[][] {
      {'l', null, Boolean.FALSE},
      //      {'p', "1000", 1000},
    };
  }
}
