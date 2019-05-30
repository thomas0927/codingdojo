package com.coding.dojo.fizzbuzz;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FizzBuzzRuleTest {
  @Test
  public void should_return_answer_by_rule() {
    Executable executable = FizzBuzzRule.build(3, "Fizz");
    Assert.assertEquals(executable.exec(1), "");
  }
}
