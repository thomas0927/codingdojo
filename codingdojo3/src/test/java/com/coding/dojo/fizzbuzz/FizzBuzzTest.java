package com.coding.dojo.fizzbuzz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

  @ParameterizedTest(name = "should_return {1} given {0}")
  @CsvSource({"1,1", "3,Fizz"})
  public void should_return_fizz_buzz_list_correct(int number, String answer) {
    assertEquals(new FizzBuzz().say(number), answer);
  }

  @Test
  public void should_print_fizz_buzz_list_correctly() {
    assertEquals(100, new FizzBuzz().print().split("\n").length);
    assertEquals("1", new FizzBuzz().print().split("\n")[1 - 1]);
  }
}
