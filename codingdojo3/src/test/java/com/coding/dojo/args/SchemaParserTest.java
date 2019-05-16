package com.coding.dojo.args;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SchemaParserTest {
  @Test(dataProvider = "schema_string")
  public void should_parser_schema_from_string(String schemaAsText, Object defaultValue) {
    Schema schema = SchemaParser.parser(schemaAsText);
    Assert.assertEquals(schema.getValue(), defaultValue);
  }

  @DataProvider
  public Object[][] schema_string() {
    return new Object[][] {
      {"l:boolean", Boolean.FALSE},
      {"p:integer", 0},
      {"d:string", ""},
      {"w:string:/usr/data", "/usr/data"},
      {"g:integers", new Integer[] {0}},
      {"g:integers:1,2,3,4,5", new Integer[] {1, 2, 3, 4, 5}},
    };
  }
}
