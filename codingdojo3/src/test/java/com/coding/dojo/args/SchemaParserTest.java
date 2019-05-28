package com.coding.dojo.args;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SchemaParserTest {
  @Test(dataProvider = "parser_value_by_schemas")
  public void should_parser_value_by_schemas(String schemasAsText, Object resultValue) {
    Schema schema = SchemaParser.parser(schemasAsText);
    Assert.assertEquals(schema.getValue(), resultValue);
  }

  @DataProvider
  public Object[][] parser_value_by_schemas() {
    return new Object[][] {
      {"l:boolean", Boolean.FALSE},
      {"l:integer", 0},
      {"l:string", ""},
    };
  }
}
