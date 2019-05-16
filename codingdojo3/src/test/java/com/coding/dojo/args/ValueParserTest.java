package com.coding.dojo.args;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ValueParserTest {
  @Test(dataProvider = "parser_value")
  public void should_parser_correct_value(String value, Class type, Object expected) {
    Assert.assertEquals(ValueParser.parser(value, type), expected);
  }

  @DataProvider
  public Object[][] parser_value() {
    return new Object[][] {
      {"", Boolean.class, Boolean.TRUE},
      {null, Boolean.class, Boolean.FALSE},
      {"0", Integer.class, 0},
      {"/usr", String.class, "/usr"},
    };
  }
}
