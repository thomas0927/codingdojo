package com.coding.dojo.fizzbuzz;

public class FizzBuzz {
  public String say(Integer number) {
    if (isDivisibleOrCaptainsBy(number, 3) && isDivisibleOrCaptainsBy(number, 5)) {
      return "FizzBuzz";
    }
    if (isDivisibleOrCaptainsBy(number, 3)) {
      return "Fizz";
    }
    if (isDivisibleOrCaptainsBy(number, 5)) {
      return "Buzz";
    }
    return String.valueOf(number);
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
