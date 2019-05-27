package com.coding.dojo.fizzbuzz;

import java.util.Arrays;

public class FizzBuzz {
  public String say(Integer number) {
    String[] results = new String[] {getFizz(number, 3), getBuzz(number, 5)};

    return getComponentResult(number, results);
  }

  private String getComponentResult(Integer number, String[] results) {
    return Arrays.stream(results)
        .filter(v -> !v.isEmpty())
        .reduce(String::concat)
        .orElse(String.valueOf(number));
  }

  private String getFizz(Integer number, int i) {
    if (isDivisibleOrCaptainsBy(number, i)) {
      return "Fizz";
    }
    return "";
  }

  private String getBuzz(Integer number, int i) {
    if (isDivisibleOrCaptainsBy(number, i)) {
      return "Buzz";
    }
    return "";
  }

  private boolean isDivisibleOrCaptainsBy(Integer number, int i) {
    return isContains(number, i) || isDivisible(number, i);
  }

  private boolean isContains(Integer number, int i) {
    return number % 10 == i || number / 10 == i;
  }

  private boolean isDivisible(Integer number, int i) {
    return number % i == 0;
  }
}
