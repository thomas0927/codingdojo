package com.coding.dojo.args;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SchemasTest {
  @Test(dataProvider = "get_correct_value_of_schema")
  public void should_get_correct_value_of_schema(
      String schemasAsText, Character flag, String value, Object resultValue) {
    Schemas schemas = new Schemas(schemasAsText);
    Assert.assertEquals(schemas.getArgsValue(flag, value), resultValue);
  }

  @DataProvider
  public Object[][] get_correct_value_of_schema() {
    return new Object[][] {
      {"l:boolean", 'l', "", Boolean.TRUE},
      {"l:boolean d:string", 'd', "/logs", "/logs"},
      {"p:integer d:string", 'p', "1000", 1000},
    };
  }
}
