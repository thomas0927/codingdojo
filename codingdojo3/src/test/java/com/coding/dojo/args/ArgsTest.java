package com.coding.dojo.args;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ArgsTest {
  @Test
  public void should_return_correct_value_by_args() {
    String argsAsText = "-l -p 8080";
    String schemasAsText = "l:boolean p:integer";
    Schemas schemas = new Schemas(schemasAsText);
    Args args = new Args(schemas, argsAsText);
    Assert.assertEquals(args.getValue('l'), Boolean.TRUE);
  }
}
