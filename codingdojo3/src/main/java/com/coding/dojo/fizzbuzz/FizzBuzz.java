package com.coding.dojo.fizzbuzz;

public class FizzBuzz {
  public String say(Integer number) {
    if (number % 3 == 0 && number % 5 == 0) {
        return "FizzBuzz";
    }
    if (isDivisible(number, 3)) {
      return "Fizz";
    }
    if (isDivisible(number, 5)) {
      return "Buzz";
    }
    return String.valueOf(number);
  }

  private boolean isDivisible(Integer number, int i) {
    return number % i == 0;
  }
}
