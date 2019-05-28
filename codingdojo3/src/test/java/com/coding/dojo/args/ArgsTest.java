package com.coding.dojo.args;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ArgsTest {
  @Test(dataProvider = "get_value_by_schemas")
  public void should_get_value_by_schemas(
      String argsAsText, String schemasAsText, Character flag, Object expected) {
    Args args = new Args(argsAsText, schemasAsText);
    Assert.assertEquals(args.getValue(flag), expected);
  }

  @DataProvider
  public Object[][] get_value_by_schemas() {
    return new Object[][] {
      {"-l", "l:boolean", 'l', Boolean.TRUE},
      {"-l -p 8080", "l:boolean p:integer", 'p', 8080},
      {"-p 8080", "l:boolean p:integer", 'l', Boolean.FALSE},
    };
  }
}
