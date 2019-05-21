package com.coding.dojo.anagrams;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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

  public void guessWords(String fileName) {
    try {
      List<Word> words = getWordsFromFile(fileName);
      guessWords(words);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private List<Word> getWordsFromFile(String fileName) throws IOException {
    Path file = Paths.get(URI.create(this.getClass().getResource(fileName).toString()));
    BufferedReader br = Files.newBufferedReader(file);
    return br.lines().map(Word::new).collect(Collectors.toList());
  }
}
