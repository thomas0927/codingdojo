package com.coding.dojo.args;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ArgsTest {
  @Test
  public void return_correct_value_from_args() {
    String argsText = "-l -p 8080 -d /usr/log";
    String schemasAsText = "l:boolean p:integer d:string";
    Schemas schemas = new Schemas(schemasAsText);
    Args args = new Args(schemas, argsText);
    Assert.assertEquals(args.getValue('l'), Boolean.TRUE);
  }
}
