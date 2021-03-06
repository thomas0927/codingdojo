package com.coding.dojo.fizzbuzz;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FizzBuzzTest {
  @Test(dataProvider = "fizz_buzz_answer")
  public void should_answer_fizz_buzz_number(int number, String expected) {
    Assert.assertEquals(new FizzBuzz().say(number), expected);
  }

  @DataProvider
  public Object[][] fizz_buzz_answer() {
    return new Object[][] {{1, "1"}, {5, "Buzz"}, {51, "FizzBuzz"}, {35, "FizzBuzz"}, {8, "8"}};
  }

  @Test
  public void should_print_100_fizz_buzz() {
    Assert.assertEquals(new FizzBuzz().print(100).split(",").length, 100);
  }
}
