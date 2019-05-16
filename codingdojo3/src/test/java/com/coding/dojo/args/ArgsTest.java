package com.coding.dojo.args;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ArgsTest {
  @Test
  public void should_return_correct_args_value() {
    String argsAsText = "-x -f 8080 -e /logs";
    String schemasAsText = "x:bool f:int e:str a:bool";
    Schemas schemas = new Schemas(schemasAsText);
    Args args = new Args(schemas, argsAsText);
    Assert.assertEquals(args.getValue('x'), Boolean.TRUE);
    Assert.assertEquals(args.getValue('f'), 8080);
    Assert.assertEquals(args.getValue('e'), "/logs");
  }
}
