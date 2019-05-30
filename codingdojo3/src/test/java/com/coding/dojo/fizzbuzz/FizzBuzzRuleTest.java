package com.coding.dojo.fizzbuzz;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FizzBuzzRuleTest {
  @DataProvider
  public Object[][] fizz_buzz_rule() {
    return new Object[][] {
      {1, ""}, {3, "Fizz"}, {5, ""}, {13, "Fizz"},
    };
  }

  @Test(dataProvider = "fizz_buzz_rule")
  public void should_get_fizz_buzz_rule(int number, String expected) {
    Executable executable = FizzBuzzRule.build(3, "Fizz");
    Assert.assertEquals(executable.exec(number), expected);
  }
}
