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
  private List<Anagram> anagrams;

  public Anagrams(List<Word> words) {
    guessWords(words);
  }

  private void guessWords(List<Word> words) {
    this.anagrams =
        words.stream()
            .collect(Collectors.groupingBy(Word::hashCode))
            .values()
            .stream()
            .map(Anagram::new)
            .collect(Collectors.toList());
  }

  public Anagrams() {}

  public String longestWord() {
    return this.anagrams.stream().max(Comparator.comparing(Anagram::length)).get().toString();
  }

  public String mostWords() {
    return this.anagrams.stream().max(Comparator.comparing(Anagram::count)).get().toString();
  }

  public void guessAnagramFromFile(String fileName) throws IOException {
    List<Word> words = getWordsFromFile(fileName);
    guessWords(words);
  }

  private List<Word> getWordsFromFile(String fileName) throws IOException {
    Path paths = Paths.get(URI.create(this.getClass().getResource(fileName).toString()));
    BufferedReader bufferedReader = Files.newBufferedReader(paths);
    return bufferedReader.lines().map(Word::new).collect(Collectors.toList());
  }
}
