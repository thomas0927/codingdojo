package com.coding.dojo.fizzbuzz;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RulesTest {
  @Test
  public void should_return_rules_size() {
    Assert.assertEquals(Rules.all().size(), 2);
  }
}
