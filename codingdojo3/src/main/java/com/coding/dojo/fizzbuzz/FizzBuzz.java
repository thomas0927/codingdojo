package com.coding.dojo.fizzbuzz;

public class FizzBuzz {
  public String say(Integer number) {
    String result1 = (number % 3 == 0) ? "Fizz" : "";
    if (!result1.isEmpty()) {
        return result1;
    }
    return String.valueOf(number);
  }
}
