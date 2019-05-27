package com.coding.dojo.fizzbuzz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

  @ParameterizedTest(name = "should_return {1} given {0}")
  @CsvSource({"1,1", "3,Fizz", "5,Buzz", "15,FizzBuzz", "13,Fizz", "31,Fizz", "52,Buzz"})
  public void should_return_fizz_buzz_list_correct(int number, String answer) {
    assertEquals(getSay(number), answer);
  }

  private String getSay(int number) {
    return new FizzBuzz().say(number);
  }

  @Test
  public void should_print_fizz_buzz_list_correctly() {
    assertEquals(100, splitOutput().length);
    assertEquals("1", getOutputLine(1));
  }

  private String getOutputLine(int number) {
    return splitOutput()[number - 1];
  }

  private String[] splitOutput() {
    return new FizzBuzz().print().split("\n");
  }
}
