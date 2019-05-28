package com.coding.dojo.args;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ValueParserTest {
  @Test(dataProvider = "parser_value_from_input_text")
  public void should_parser_value_from_input_text(String valueText, Class clz, Object resultValue) {
    Assert.assertEquals(ValueParser.parser(valueText, clz), resultValue);
  }

  @DataProvider
  public Object[][] parser_value_from_input_text() {
    return new Object[][] {
      {"", Boolean.class, Boolean.TRUE},
      {"808", Integer.class, 808},
    };
  }
}
