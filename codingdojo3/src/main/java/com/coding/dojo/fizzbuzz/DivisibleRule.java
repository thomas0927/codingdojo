package com.coding.dojo.fizzbuzz;

public class DivisibleRule implements Executable {
  private int in;
  private String answer;

  public DivisibleRule(int number, String answer) {

    this.in = number;
    this.answer = answer;
  }

  public static Executable create(int i, String answer) {
    return new DivisibleRule(i, answer);
  }

  @Override
  public String exec(int number) {
    if (isContains(number)) {
      return this.answer;
    }
    if (isDivisible(number)) {
      return this.answer;
    }
    return "";
  }

  private boolean isContains(int number) {
    return number / 10 == this.in || number % 10 == this.in;
  }

  private boolean isDivisible(int number) {
    return number % this.in == 0;
  }
}
