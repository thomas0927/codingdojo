package com.coding.dojo.fizzbuzz;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
  @ParameterizedTest(name = "should return {1} given {0}")
  @CsvSource({"1,1"})
  public void should_answer_correct_fizz_buzz_number(Integer number, String answer) {
    assertEquals(new FizzBuzz().say(number), answer);
  }
}
