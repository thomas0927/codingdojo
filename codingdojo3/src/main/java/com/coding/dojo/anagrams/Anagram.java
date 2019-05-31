package com.coding.dojo.anagrams;

import java.util.List;

import static java.util.stream.Collectors.joining;

public class Anagram {
  private final List<Word> words;

  public Anagram(List<Word> words) {
    this.words = words;
  }

  public int length() {
    return words.get(0).length();
  }

  public int count() {
    return words.size();
  }

  @Override
  public String toString() {
    return words.stream().map(Word::toString).collect(joining(" "));
  }
}
