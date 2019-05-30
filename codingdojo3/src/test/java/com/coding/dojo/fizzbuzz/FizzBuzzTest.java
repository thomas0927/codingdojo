package com.coding.dojo.fizzbuzz;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FizzBuzzTest {
  @Test(dataProvider = "fizz_buzz_answer")
  public void should_return_fizz_buzz_answer(int number, String expected) {
    FizzBuzz fizzBuzz = new FizzBuzz();
    Assert.assertEquals(fizzBuzz.say(number), expected);
  }

  @DataProvider
  public Object[][] fizz_buzz_answer() {
    return new Object[][] {
      {1, "1"},
      {3, "Fizz"},
    };
  }
}
