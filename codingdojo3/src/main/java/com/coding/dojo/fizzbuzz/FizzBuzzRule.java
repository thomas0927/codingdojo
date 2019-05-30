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
    return "";
  }
}
