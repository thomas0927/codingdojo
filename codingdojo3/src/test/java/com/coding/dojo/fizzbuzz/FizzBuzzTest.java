package com.coding.dojo.fizzbuzz;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class FizzBuzzTest {

  @DataProvider
  public Object[][] game_number() {
    return new Object[][] {
      {1, "1"},
      {2, "2"},
      {3, "Fizz"},
      {4, "4"},
      {5, "Buzz"},
      {6, "Fizz"},
      {10, "Buzz"},
      {13, "Fizz"},
      {15, "FizzBuzz"},
      {31, "Fizz"},
      {30, "FizzBuzz"},
      {35, "FizzBuzz"},
      {53, "FizzBuzz"}
    };
  }

  @DataProvider
  public static Object[] fizzbuzz_100_stage2() {
    return new Object[] {
      Arrays.asList(
          "1",
          "2",
          "Fizz",
          "4",
          "Buzz",
          "Fizz",
          "7",
          "8",
          "Fizz",
          "Buzz",
          "11",
          "Fizz",
          "Fizz",
          "14",
          "FizzBuzz",
          "16",
          "17",
          "Fizz",
          "19",
          "Buzz",
          "Fizz",
          "22",
          "Fizz",
          "Fizz",
          "Buzz",
          "26",
          "Fizz",
          "28",
          "29",
          "FizzBuzz",
          "Fizz",
          "Fizz",
          "Fizz",
          "Fizz",
          "FizzBuzz",
          "Fizz",
          "Fizz",
          "Fizz",
          "Fizz",
          "Buzz",
          "41",
          "Fizz",
          "Fizz",
          "44",
          "FizzBuzz",
          "46",
          "47",
          "Fizz",
          "49",
          "Buzz",
          "FizzBuzz",
          "Buzz",
          "FizzBuzz",
          "FizzBuzz",
          "Buzz",
          "Buzz",
          "FizzBuzz",
          "Buzz",
          "Buzz",
          "FizzBuzz",
          "61",
          "62",
          "Fizz",
          "64",
          "Buzz",
          "Fizz",
          "67",
          "68",
          "Fizz",
          "Buzz",
          "71",
          "Fizz",
          "Fizz",
          "74",
          "FizzBuzz",
          "76",
          "77",
          "Fizz",
          "79",
          "Buzz",
          "Fizz",
          "82",
          "Fizz",
          "Fizz",
          "Buzz",
          "86",
          "Fizz",
          "88",
          "89",
          "FizzBuzz",
          "91",
          "92",
          "Fizz",
          "94",
          "Buzz",
          "Fizz",
          "97",
          "98",
          "Fizz",
          "Buzz")
    };
  }

  @Test(dataProvider = "game_number")
  public void should_return_fizzbuzz_when_say_a_number(Integer number, String expected) {
    Assert.assertEquals(FizzBuzz.say(number), expected);
  }

  @Test(dataProvider = "fizzbuzz_100_stage2")
  public void should_return_fizzbuzz_100(List<String> expected) {
    Assert.assertEquals(FizzBuzz.print(100), expected);
  }
}
