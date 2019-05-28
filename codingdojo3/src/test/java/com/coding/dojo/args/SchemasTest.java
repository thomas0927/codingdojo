package com.coding.dojo.args;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SchemasTest {
  @Test
  public void should_get_correct_value_of_schema() {
    Schemas schemas = new Schemas("l:boolean");
    Assert.assertEquals(schemas.getArgsValue('l', ""), Boolean.TRUE);
  }
}
