package com.coding.dojo.anagrams;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WordTest {
  @Test(dataProvider = "word_list")
  public void should_same_hashcode_with_same_character_in_diff_word(Word a, Word b) {
    Assert.assertEquals(a.hashCode(), b.hashCode());
  }

  @DataProvider
  public Object[][] word_list() {
    return new Object[][] {{new Word("ab"), new Word("ba")}};
  }
}
