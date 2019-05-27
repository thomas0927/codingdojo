package com.coding.dojo.fizzbuzz;

public class FizzBuzz {
  public String say(Integer number) {
    String result1 = getFizzRuleResult(number);
    if (!result1.isEmpty()) {
      return result1;
    }
    return String.valueOf(number);
  }

  private String getFizzRuleResult(Integer number) {
    return (number % 3 == 0 || isContains(number)) ? "Fizz" : "";
  }

  private boolean isContains(Integer number) {
    return String.valueOf(number).contains("3");
  }
}
