package com.coding.dojo.args;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ArgsTest {
  @Test
  public void should_return_correct_value_by_args() {
    String argsAsText = "-l -p 8080 -x 1234 -d /usr/log";
    String schemasAsText =
        "l:boolean p:integer d:string e:string:/usr/data f:boolean:true w:integer:10";
    Schemas schemas = new Schemas(schemasAsText);
    Args args = new Args(schemas, argsAsText);
    Assert.assertEquals(args.getValue('l'), Boolean.TRUE);
    Assert.assertEquals(args.getValue('p'), 8080);
    Assert.assertEquals(args.getValue('e'), "/usr/data");
    Assert.assertEquals(args.getValue('w'), 10);
    Assert.assertEquals(args.getValue('f'), Boolean.TRUE);
  }
}
