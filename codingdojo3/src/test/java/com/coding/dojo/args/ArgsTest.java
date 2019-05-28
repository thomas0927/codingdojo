package com.coding.dojo.args;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ArgsTest {
  @Test
  public void should_get_value_by_schemas() {
    Args args = new Args("-l -p 8080", "l:boolean p:integer");
    Assert.assertEquals(args.getValue('l'), Boolean.TRUE);
  }
}
