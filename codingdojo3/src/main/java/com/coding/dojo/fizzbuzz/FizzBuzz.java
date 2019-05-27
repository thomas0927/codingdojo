package com.coding.dojo.fizzbuzz;

public class FizzBuzz {
  public String say(Integer number) {
    String result1 = getFizzRuleResult(number);
    String result2 = getBuzzRuleResult(number);
    String result = result1 + result2;
    if (!result.isEmpty()) {
      return result;
    }
    return String.valueOf(number);
  }

  private String getFizzRuleResult(Integer number) {
    return (number % 3 == 0 || isContains(number, "3")) ? "Fizz" : "";
  }

  private String getBuzzRuleResult(Integer number) {
    return (number % 5 == 0 || isContains(number, "5")) ? "Buzz" : "";
  }

  private boolean isContains(Integer number, String s) {
    return String.valueOf(number).contains(s);
  }
}
