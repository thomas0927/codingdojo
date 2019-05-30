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
    if (number / 10 == specialNumber || number % 10 == specialNumber) {
      return answer;
    }
    if (number % specialNumber == 0) {
      return answer;
    }
    return "";
  }
}
