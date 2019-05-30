package com.coding.dojo.fizzbuzz;

public class FizzBuzzRule implements Executable {
  private final int in;
  private final String answer;

  public FizzBuzzRule(int in, String answer) {

    this.in = in;
    this.answer = answer;
  }

  public static Executable build(int in, String answer) {
    return new FizzBuzzRule(in, answer);
  }

  @Override
  public String exec(int number) {
    if (isContains(number) || isDivisible(number)) {
      return this.answer;
    }
    return "";
  }

  private boolean isContains(int number) {
    return number % 10 == this.in || number / 10 == this.in;
  }

  private boolean isDivisible(int number) {
    return number % this.in == 0;
  }
}
