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
    if (number % this.in == 0) {
      return this.answer;
    }
    return "";
  }
}
