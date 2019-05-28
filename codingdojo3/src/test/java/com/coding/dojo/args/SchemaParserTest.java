package com.coding.dojo.args;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SchemaParserTest {
  @Test(dataProvider = "parser_schema_from_string")
  public void should_parser_schema_from_string(String schemaAsText, Object defaultValue) {
    Schema schema = SchemaParser.parser(schemaAsText);
    Assert.assertEquals(schema.getValue(), defaultValue);
  }

  @DataProvider
  public Object[][] parser_schema_from_string() {
    return new Object[][] {
      {"l:boolean", Boolean.FALSE},
      {"d:string", ""},
      {"p:integer", 0},
    };
  }
}
