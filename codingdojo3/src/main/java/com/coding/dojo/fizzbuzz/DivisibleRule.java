package com.coding.dojo.fizzbuzz;

public class DivisibleRule implements Executable {
  private int in;
  private String out;

  public DivisibleRule(int in, String out) {
    this.in = in;
    this.out = out;
  }

  public static Executable create(int in, String out) {
    return new DivisibleRule(in, out);
  }

  @Override
  public String exec(int number) {
    return (number % in == 0 || isContains(number)) ? this.out : "";
  }

  private boolean isContains(Integer number) {
    return String.valueOf(number).contains(String.valueOf(in));
  }
}
