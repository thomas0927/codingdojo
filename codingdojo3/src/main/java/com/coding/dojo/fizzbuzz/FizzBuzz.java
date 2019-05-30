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

  private String getString(Integer number, int i, String fizz) {
    String result1 = "";
    if (number % i == 0) {
      result1 = fizz;
    }
    return result1;
  }
}
