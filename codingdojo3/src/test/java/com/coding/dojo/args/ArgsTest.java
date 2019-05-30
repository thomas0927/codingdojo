package com.coding.dojo.args;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ArgsTest {
  @Test
  public void should_return_correct_value() {
    Assert.assertEquals(new Args("-l", "l:&").getValue('l'), Boolean.TRUE);
    Assert.assertEquals(new Args("-l -p 8080", "l:& p:@").getValue('p'), 8080);
    Assert.assertEquals(new Args("-l -p 8080 -d /log", "l:& p:@ d:#").getValue('d'), "/log");
    Assert.assertEquals(new Args("-l  -d /log", "l:& p:@ d:#").getValue('p'), 0);
  }
}
