package com.coding.dojo.anagrams;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class AnagramTest {
  @Test
  public void should_return_length_after_load_words() {
    Anagram anagram = new Anagram(Arrays.asList(new Word("abc"), new Word("cba")));
    Assert.assertEquals(anagram.length(), 3);
  }

  @Test
  public void should_return_count_of_words() {
    Anagram anagram = new Anagram(Arrays.asList(new Word("ab"), new Word("ba")));
    Assert.assertEquals(anagram.count(), 2);
  }

  @Test(dataProvider = "anagram_all_word")
  public void should_return_anagram_all_word(List<Word> words, String ex) {
    Anagram anagram = new Anagram(words);
    Assert.assertEquals(anagram.toString(), ex);
  }

  @DataProvider
  public Object[][] anagram_all_word() {
    return new Object[][] {{Arrays.asList(new Word("ab"), new Word("ba")), "ab ba"}};
  }
}
