package com.coding.dojo.args;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SchemaTest {
  @Test
  public void should_get_default_value_by_schema() {
    Assert.assertEquals(new Schema(Boolean.class, Boolean.FALSE).getValue(), Boolean.FALSE);
    Assert.assertEquals(new Schema(Integer.class, 0).getValue(), 0);
  }
}
