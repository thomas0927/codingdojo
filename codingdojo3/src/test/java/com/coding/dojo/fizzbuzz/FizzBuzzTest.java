package com.coding.dojo.fizzbuzz;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FizzBuzzTest {
  @Test(dataProvider = "fizz_buzz_answer")
  public void should_get_correct_answer_by_Rules(int number, String expected) {
    Assert.assertEquals(new FizzBuzz().say(number), expected);
  }

  @DataProvider
  public Object[][] fizz_buzz_answer() {
    return new Object[][] {
      {1, "1"}, {3, "Fizz"}, {5, "Buzz"}, {15, "FizzBuzz"}, {51, "FizzBuzz"},
    };
  }

  @Test
  public void should_print_100_fizz_buzz_number() {
    String[] numbers = new FizzBuzz().print(100);
    System.out.println(numbers);
    Assert.assertEquals(numbers.length, 100);
  }
}
