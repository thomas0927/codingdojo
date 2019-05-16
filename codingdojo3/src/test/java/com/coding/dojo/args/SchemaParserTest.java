package com.coding.dojo.args;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SchemaParserTest {
  @Test(dataProvider = "schema_string")
  public void can_parser_schema_from_string(String schemaAsText, Object expected) {
    Schema schema = SchemaParser.parser(schemaAsText);
    Assert.assertEquals(schema.getValue(), expected);
  }

  @DataProvider
  public Object[][] schema_string() {
    return new Object[][] {
      {"l:boolean", Boolean.FALSE}, {"p:integer", 0},
    };
  }
}
