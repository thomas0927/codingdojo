package com.coding.dojo.args;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ArgsTest {
  @Test(dataProvider = "schemas_args_list")
  public void should_return_correct_value_by_schemas(
      String argsAsText, String schemasAsText, Character flag, Object expected) {
    Schemas schemas = new Schemas(schemasAsText);
    Args args = new Args(schemas, argsAsText);
    Assert.assertEquals(args.getValue(flag), expected);
  }

  @DataProvider
  public Object[][] schemas_args_list() {
    return new Object[][] {{"-l ", "l:boolean", 'l', Boolean.TRUE}};
  }
}
