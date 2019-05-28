package com.coding.dojo.args;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SchemaParserTest {
  @Test
  public void should_parser_value_by_schems() {
    Schema schema = SchemaParser.parser("l:boolean");
    Assert.assertEquals(schema.getValue(), Boolean.FALSE);
  }
}
