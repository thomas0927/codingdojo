package com.coding.dojo.args;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SchemasParserTest {
  @Test(dataProvider = "schemaParser_string")
  public void should_get_schema_by_string_input(String schemaAsText, Object expected) {
    Schema schema = SchemasParser.parser(schemaAsText);
    Assert.assertEquals(schema.getValue(), expected);
  }

  @DataProvider
  public Object[][] schemaParser_string() {
    return new Object[][] {
      {"l:&", Boolean.FALSE},
      {"l:@", 0},
      {"l:#", ""},
    };
  }
}
