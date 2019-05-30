package com.coding.dojo.fizzbuzz;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FizzBuzzTest {
  @Test
  public void should_get_correct_answer_by_Rules() {
    Assert.assertEquals(new FizzBuzz().say(1), "1");
  }
}
