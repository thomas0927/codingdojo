package com.coding.dojo.args;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ArgsTest {
  @Test(dataProvider = "schemas_args_list")
  public void should_return_correct_value_by_schemas(Character flag, Object expected) {
    String schemasAsText = "l:boolean p:integer d:string";
    String argsAsText = "-l -p 8080 -d /log";
    Schemas schemas = new Schemas(schemasAsText);
    Args args = new Args(schemas, argsAsText);
    Assert.assertEquals(args.getValue(flag), expected);
  }

  @DataProvider
  public Object[][] schemas_args_list() {
    return new Object[][] {
      {'l', Boolean.TRUE}, {'p', 8080},
    };
  }
}
