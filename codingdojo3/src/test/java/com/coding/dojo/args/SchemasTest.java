package com.coding.dojo.args;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SchemasTest {

  @Test(dataProvider = "correct_schemas")
  public void return_correct_schemas(Character flag, String value, Object resultValue) {
    Schemas schemas = new Schemas("l:boolean p:integer");
    Assert.assertEquals(schemas.getArgsValue(flag, value), resultValue);
  }

  @DataProvider
  public Object[][] correct_schemas() {
    return new Object[][] {
      {'l', "", Boolean.TRUE},
      {'l', null, Boolean.FALSE},
      {'p', null, 0},
      {'p', "8080", 8080},
    };
  }
}
