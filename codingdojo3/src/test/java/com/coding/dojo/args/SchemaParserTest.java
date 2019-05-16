package com.coding.dojo.args;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SchemaParserTest {

  @Test(dataProvider = "string_to_schema")
  public void can_parser_string_to_schema(String schemaAsText, Object expected) {
    Schema schema = SchemaParser.parser(schemaAsText);
    Assert.assertEquals(schema.getValue(), expected);
  }

  @DataProvider
  public Object[][] string_to_schema() {
    return new Object[][] {{"l:bool", Boolean.FALSE}};
  }
}
