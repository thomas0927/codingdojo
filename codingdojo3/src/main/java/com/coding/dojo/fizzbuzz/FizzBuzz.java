package com.coding.dojo.fizzbuzz;

public class FizzBuzz {
  public Object say(Integer number) {
    if (number % 3 == 0) {
        return "Fizz";
    }
    return String.valueOf(number);
  }
}
