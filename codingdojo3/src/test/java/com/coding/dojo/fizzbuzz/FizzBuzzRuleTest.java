package com.coding.dojo.fizzbuzz;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FizzBuzzRuleTest {
  @Test(dataProvider = "rule_number")
  public void should_return_answer_by_rule(int number, String expected) {
    Executable executable = FizzBuzzRule.build(3, "Fizz");
    Assert.assertEquals(executable.exec(number), expected);
  }

  @DataProvider
  public Object[][] rule_number() {
    return new Object[][] {
      {1, ""},
      {3, "Fizz"},
    };
  }
}
