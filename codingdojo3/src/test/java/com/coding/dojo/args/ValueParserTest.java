package com.coding.dojo.args;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ValueParserTest {
  @Test
  public void should_parser_value_by_type() {
    Assert.assertEquals(ValueParser.parser("", Boolean.class), Boolean.TRUE);
    Assert.assertEquals(ValueParser.parser("80", Integer.class), 80);
  }
}
