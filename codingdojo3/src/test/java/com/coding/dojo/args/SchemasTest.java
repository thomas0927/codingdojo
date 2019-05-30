package com.coding.dojo.args;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SchemasTest {
  @Test
  public void should_get_schema_value_by_input() {
    Assert.assertEquals(new Schemas("l:&").getArgsValue('l', ""), Boolean.TRUE);
    Assert.assertEquals(new Schemas("l:& d:@").getArgsValue('d', "100"), 100);
    Assert.assertEquals(new Schemas("l:& d:@ p:#").getArgsValue('p', "100"), "100");
  }
}
