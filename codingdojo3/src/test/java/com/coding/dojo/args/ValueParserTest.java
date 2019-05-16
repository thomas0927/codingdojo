package com.coding.dojo.args;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ValueParserTest {
  @Test(dataProvider = "parser_value")
  public void can_parser_value_by_class(String value, Class type, Object expected) {
    Assert.assertEquals(ValueParser.parser(value, type), expected);
  }

  @DataProvider
  public Object[][] parser_value() {
    return new Object[][] {
      {"", Boolean.class, Boolean.TRUE},
      {null, Boolean.class, Boolean.FALSE},
    };
  }
}
