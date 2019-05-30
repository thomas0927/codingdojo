package com.coding.dojo.fizzbuzz;

public class FizzBuzz {
  public Object say(Integer number) {
    String result = "";
    if (number % 3 == 0) {
      result = "Fizz";
    }
    if (!result.isEmpty()) {
        return result;
    }
    if (number % 5 == 0) {
      result = "Buzz";
    }
    if (!result.isEmpty()) {
        return result;
    }
    return String.valueOf(number);
  }
}
