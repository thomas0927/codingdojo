package com.coding.dojo.fizzbuzz;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FizzBuzzTest {
  @Test
  public void should_answer_fizz_buzz_number() {
    Assert.assertEquals(new FizzBuzz().say(1), "1");
  }
}
