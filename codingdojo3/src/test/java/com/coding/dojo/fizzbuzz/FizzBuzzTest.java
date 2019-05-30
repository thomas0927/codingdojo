package com.coding.dojo.fizzbuzz;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FizzBuzzTest {
  @Test(dataProvider = "fizz_buzz_nubmer")
  public void should_answer_fizz_buzz(int number, String expected) {
    Assert.assertEquals(new FizzBuzz().say(number), expected);
  }

  @DataProvider
  public Object[][] fizz_buzz_nubmer() {
    return new Object[][] {
      {1, "1"},
      {3, "Fizz"},
      {5, "Buzz"},
    };
  }

  @Test
  public void should_print_100_fizz_buzz_number() {
    Assert.assertEquals(new FizzBuzz().print(100).split(",").length, 100);
  }
}
