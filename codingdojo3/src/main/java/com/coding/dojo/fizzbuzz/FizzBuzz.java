package com.coding.dojo.fizzbuzz;

public class FizzBuzz {
  public String say(Integer number) {
    String[] result = new String[] {getFizz(number), getBuzz(number)};
    String result1 = String.join("", result);
    if (!result1.isEmpty()) {
      return result1;
    }
    return String.valueOf(number);
  }

  private String getBuzz(Integer number) {
    if (number % 5 == 0) {
      return "Buzz";
    }
    return "";
  }

  private String getFizz(Integer number) {
    if (number % 3 == 0) {
      return "Fizz";
    }
    return "";
  }
}
