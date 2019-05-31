package com.coding.dojo.anagrams;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class AnagramsTest {
  @Test(dataProvider = "words_longest")
  public void should_find_longest_anagram_from_word(List<Word> words, String longestWord) {
    Anagrams anagrams = new Anagrams(words);
    Assert.assertEquals(anagrams.longestWord(), longestWord);
  }

  @DataProvider
  public Object[][] words_longest() {
    return new Object[][] {{Arrays.asList(new Word("abc"), new Word("ab"), new Word("ba")), "abc"}};
  }

  @DataProvider
  public Object[][] words_most() {
    return new Object[][] {
      {Arrays.asList(new Word("abc"), new Word("ab"), new Word("ba")), "ab ba"}
    };
  }

  @Test(dataProvider = "words_most")
  public void should_find_mostWords_anagram_from_word(List<Word> words, String mostWords) {
    Anagrams anagrams = new Anagrams(words);
    Assert.assertEquals(anagrams.mostWords(), mostWords);
  }

  @Test
  public void should_find_longest_word_from_file() throws IOException {
    Anagrams anagrams = new Anagrams();
    anagrams.guessAnagramFromFile("/wordlist-mini.txt");
    Assert.assertEquals(anagrams.longestWord(), "ACTH's");
  }

  @Test
  public void should_find_most_words_from_file() throws IOException {
    Anagrams anagrams = new Anagrams();
    anagrams.guessAnagramFromFile("/wordlist-mini.txt");
    Assert.assertEquals(anagrams.mostWords(), "AA's s'AA As'A");
  }

  @Test
  public void get_game_result() throws IOException {
    Anagrams anagrams = new Anagrams();
    anagrams.guessAnagramFromFile("/wordlist.txt");
    System.out.println(anagrams.longestWord());
    System.out.println(anagrams.mostWords());
  }
}
