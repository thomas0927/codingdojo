package com.coding.dojo.anagrams;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class AnagramsTest {

  @Test(dataProvider = "find_longest_words")
  public void should_return_longest_words_from_anagrams(List<Word> words, String expected) {
    Anagrams anagrams = new Anagrams();
    anagrams.guessWords(words);
    Assert.assertEquals(anagrams.longestWords(), expected);
  }

  @Test(dataProvider = "find_most_words")
  public void should_return_most_words_from_anagrams(List<Word> words, String expected) {
    Anagrams anagrams = new Anagrams();
    anagrams.guessWords(words);
    Assert.assertEquals(anagrams.mostWords(), expected);
  }

  @Test(dataProvider = "longest_anagram_from_file_mini")
  public void can_get_longest_anagram_from_file(String fileName, String expected) {

    Anagrams anagrams = new Anagrams();
    anagrams.guessWords(fileName);
    Assert.assertEquals(anagrams.longestWords(), expected);
  }

  @Test(dataProvider = "most_words_anagram_from_file_mini")
  public void can_get_most_words_anagram_from_file(String fileName, String expected) {

    Anagrams anagrams = new Anagrams();
    anagrams.guessWords(fileName);
    Assert.assertEquals(anagrams.mostWords(), expected);
  }

  @Test(dataProvider = "word_list_from_file")
  public void find_longest_from_word_list(String fileName) {
    Anagrams anagrams = new Anagrams();
    anagrams.guessWords(fileName);
    System.out.println(anagrams.mostWords());
    System.out.println(anagrams.longestWords());
  }

  @DataProvider
  public Object[][] word_list_from_file() {
    return new Object[][] {{"/wordlist.txt"}};
  }

  @DataProvider
  public Object[][] longest_anagram_from_file_mini() {
    return new Object[][] {{"/wordlist-mini.txt", "ACTH's"}};
  }

  @DataProvider
  public Object[][] most_words_anagram_from_file_mini() {
    return new Object[][] {{"/wordlist-mini.txt", "AA's s'AA As'A"}};
  }

  @DataProvider
  public Object[][] find_most_words() {
    return new Object[][] {
      {
        Arrays.asList(
            new Word("abc"),
            new Word("bca"),
            new Word("cab"),
            new Word("ba"),
            new Word("asdfasdrropeutxpoiuqqrcbc"),
            new Word("cb")),
        "abc bca cab"
      }
    };
  }

  @DataProvider
  public Object[][] find_longest_words() {
    return new Object[][] {
      {
        Arrays.asList(
            new Word("acb"),
            new Word("cab"),
            new Word("cx"),
            new Word("ba"),
            new Word("abc"),
            new Word("cb")),
        "acb cab abc"
      }
    };
  }
}
