package com.coding.dojo.args;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ValueParserTest {
  @Test
  public void should_parser_value_from_input_text() {
    Assert.assertEquals(ValueParser.parser("", Boolean.class), Boolean.TRUE);
  }
}
