package com.coding.dojo.fizzbuzz;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@SuppressWarnings("ALL")
public class FizzBuzz {

  public static final String FIZZ_CHAR = "3";
  public static final String BUZZ_CHAR = "5";
  public static final int BUZZ_NUMBER = 5;
  public static final int FIZZ_NUMBER = 3;
  public static final String FIZZ_BUZZ_ANSWER = "FizzBuzz";
  public static final String FIZZ_ANSWER = "Fizz";
  public static final String BUZZ_ANSWER = "Buzz";

  public static String say(Integer number) {
    if (isFizzBuzz(number)) {
      return FIZZ_BUZZ_ANSWER;
    } else if (isFizz(number)) {
      return FIZZ_ANSWER;
    } else if (isBuzz(number)) {
      return BUZZ_ANSWER;
    }
    return number.toString();
  }

  private static boolean isFizzBuzz(Integer number) {
    return isFizz(number) && isBuzz(number);
  }

  private static boolean isFizz(Integer number) {
    return isDivisibleBy(number, FIZZ_NUMBER) || number.toString().contains(FIZZ_CHAR);
  }

  public static boolean isBuzz(Integer number) {
    return isDivisibleBy(number, BUZZ_NUMBER) || number.toString().contains(BUZZ_CHAR);
  }

  private static boolean isDivisibleBy(Integer number, int i) {
    return number % i == 0;
  }

  public static List<String> print(int count) {
    return IntStream.range(1, count + 1).boxed().map(FizzBuzz::say).collect(Collectors.toList());
  }
}
