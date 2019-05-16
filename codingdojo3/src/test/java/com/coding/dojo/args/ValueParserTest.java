package com.coding.dojo.args;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ValueParserTest {

  @Test(dataProvider = "parser_value")
  public void should_parser_value_by_type(String value, EnumSchema type, Object expected) {
    Assert.assertEquals(ValueParser.parser(value, type), expected);
  }

  @DataProvider
  public Object[][] parser_value() {
    return new Object[][] {
      {"", EnumSchema.Bool, Boolean.TRUE},
      {"80", EnumSchema.Int, 80},
      {"80", EnumSchema.String, "80"},
    };
  }
}
