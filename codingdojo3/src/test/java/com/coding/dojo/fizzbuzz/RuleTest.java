package com.coding.dojo.fizzbuzz;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class RuleTest {
  @Test
  public void should_get_rule_size() {
    List<Executable> executables = Rules.all();
    Assert.assertEquals(executables.size(), 2);
  }
}
