package com.coding.dojo.anagrams;

import java.util.Arrays;

public class Word {
  private String word;
  private int hashNum;

  public Word(String word) {

    this.word = word;
    calcHashCode();
  }

  @Override
  public int hashCode() {
    return this.hashNum;
  }

  private void calcHashCode() {
    byte[] bytes = this.word.getBytes();
    Arrays.sort(bytes);
    this.hashNum = Arrays.hashCode(bytes);
  }
}
