package com.coding.dojo.args;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ValueParserTest {

  @Test(dataProvider = "parser_value")
  public void should_parser_value_by_type(String value, Class type, Object expected) {
    Assert.assertEquals(ValueParser.parser(value, type), expected);
  }

  @DataProvider
  public Object[][] parser_value() {
    return new Object[][] {
      {"", Boolean.class, Boolean.TRUE},
      {"80", Integer.class, 80},
      {"80", String.class, "80"},
    };
  }
}
