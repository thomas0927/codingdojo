package com.coding.dojo.anagrams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Anagrams {
  List<Anagram> anagrams;

  public void guessWords(List<Word> words) {
    this.anagrams =
        words.stream()
            .collect(Collectors.groupingBy(Word::hashCode))
            .values()
            .stream()
            .map(Anagram::new)
            .collect(Collectors.toList());
  }

  public String longestWords() {
    return this.anagrams.stream().max(Comparator.comparing(Anagram::length)).get().toString();
  }

  public String mostWords() {
    return anagrams.stream().max(Comparator.comparing(Anagram::numberOfWords)).get().toString();
  }

  public void guessWords(String fileName) {}
}
