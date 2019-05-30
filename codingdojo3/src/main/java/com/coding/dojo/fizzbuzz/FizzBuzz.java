package com.coding.dojo.fizzbuzz;

public class FizzBuzz {
  public Object say(Integer number) {
    String result1 = "";
    if (number % 3 == 0) {
      result1 = "Fizz";
    }

    String result2 = "";
    if (number % 5 == 0) {
      result2 = "Buzz";
    }
    String result = String.join("", result1, result2);
    if (!result.isEmpty()) {
        return result;
    }
    return String.valueOf(number);
  }
}
