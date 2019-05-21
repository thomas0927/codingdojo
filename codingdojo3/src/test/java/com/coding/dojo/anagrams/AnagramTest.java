package com.coding.dojo.anagrams;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class AnagramTest {

  @Test(dataProvider = "anagram_new_word_length")
  public void should_return_new_length_after_guess_a_new_word(List<Word> words, Integer expected) {
    Anagram anagram = new Anagram(words);
    Assert.assertEquals(anagram.length(), expected);
  }

  @Test(dataProvider = "anagram_new_number_words")
  public void should_return_new_number_words(List<Word> words, Integer expected) {
    Anagram anagram = new Anagram(words);
    Assert.assertEquals(anagram.numberOfWords(), expected);
  }

  @Test(dataProvider = "anagram_word_list")
  public void can_return_words_text(List<Word> words, String expected) {
    Anagram anagram = new Anagram(words);
    Assert.assertEquals(anagram.toString(), expected);
  }

  @DataProvider
  public Object[][] anagram_word_list() {
    return new Object[][] {{Arrays.asList(new Word("abc"), new Word("cba")), "abc cba"}};
  }

  @DataProvider
  public Object[][] anagram_new_word_length() {
    return new Object[][] {{Arrays.asList(new Word("abc"), new Word("cba")), 6}};
  }

  @DataProvider
  public Object[][] anagram_new_number_words() {
    return new Object[][] {{Arrays.asList(new Word("abc"), new Word("cba")), 2}};
  }
}
