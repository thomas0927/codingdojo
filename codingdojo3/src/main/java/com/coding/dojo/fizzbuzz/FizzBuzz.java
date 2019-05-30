package com.coding.dojo.fizzbuzz;

public class FizzBuzz {
  public Object say(Integer number) {
    String result1 = getString(number, 3, "Fizz");
    String result2 = getString(number, 5, "Buzz");
    String result = String.join("", result1, result2);
    if (!result.isEmpty()) {
      return result;
    }
    return String.valueOf(number);
  }

  private String getString(Integer number, int specialNumber, String answer) {
    if (isContains(number, specialNumber)) {
      return answer;
    }
    if (isDivisible(number % specialNumber, 0)) {
      return answer;
    }
    return "";
  }

  private boolean isDivisible(int i, int i2) {
    return i == i2;
  }

  private boolean isContains(Integer number, int specialNumber) {
    return isDivisible(number / 10, specialNumber) || isDivisible(number % 10, specialNumber);
  }
}
