package com.coding.dojo.anagrams;

import java.util.Arrays;

public class Word {
  private final String word;

  public Word(String word) {

    this.word = word;
  }

  @Override
  public int hashCode() {
    byte[] bytes = this.word.getBytes();
    Arrays.sort(bytes);
    return Arrays.hashCode(bytes);
  }

  public int length() {
    return word.length();
  }

  @Override
  public String toString() {
    return this.word;
  }
}
