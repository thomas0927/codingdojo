package com.coding.dojo.anagrams;

import java.util.List;
import java.util.stream.Collectors;

public class Anagram {
  private List<Word> words;

  public Anagram(List<Word> words) {

    this.words = words;
  }

  public Integer length() {
    return null;
  }

  public Integer numberOfWords() {
    return words.size();
  }

  @Override
  public String toString() {
    return String.join(
        " ", this.words.stream().map(w -> w.toString()).collect(Collectors.toList()));
  }
}
