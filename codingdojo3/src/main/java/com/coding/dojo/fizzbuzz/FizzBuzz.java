package com.coding.dojo.fizzbuzz;

public class FizzBuzz {
  public String say(Integer number) {
    if (isDivisibleOrCaptainsBy(number, 3) && isDivisibleOrCaptainsBy(number, 5)) {
      return "FizzBuzz";
    }
    String result1 = getFizz(number, 3);
    String result2 = getBuzz(number, 5);
    String result = String.join("", result1, result2);
    if (!result.isEmpty()) {
      return result;
    }
    return String.valueOf(number);
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
