package com.coding.dojo.args;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SchemasParserTest {
  @Test
  public void should_get_schema_by_string_input() {
    Schema schema = SchemasParser.parser("l:&");
    Assert.assertEquals(schema.getValue(), Boolean.FALSE);
  }
}
