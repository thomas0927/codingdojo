package com.coding.dojo.args;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SchemaTest {
  @Test
  public void should_get_schema_default_value() {
    Schema schema = new Schema(Boolean.class, Boolean.FALSE);
    Assert.assertEquals(schema.getValue(), Boolean.FALSE);
  }
}
