package com.coding.dojo.args;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ValueParserTest {
  @Test(dataProvider = "value_by_type")
  public void can_return_correct_value_by_type(String value, Class type, Object resultValue) {
    Assert.assertEquals(ValueParser.parser(value, type), resultValue);
  }

  @DataProvider
  public Object[][] value_by_type() {
    return new Object[][] {
      {"", Boolean.class, Boolean.TRUE},
      {"10", Integer.class, 10},
    };
  }
}
