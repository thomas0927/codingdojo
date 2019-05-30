package com.coding.dojo.fizzbuzz;

public class FizzBuzz {
  public Object say(Integer number) {
    if (number % 3 == 0) {
      return "Fizz";
    }
    if (number % 5 == 0) {
        return "Buzz";
    }
    return String.valueOf(number);
  }
}
