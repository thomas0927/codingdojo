package com.coding.dojo.args;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SchemaTest {
  @Test(dataProvider = "default_value")
  public void should_return_schema_default_value(Schema schema, Object expected) {
    Assert.assertEquals(schema.getValue(), expected);
  }

  @DataProvider
  public Object[][] default_value() {
    return new Object[][] {{new Schema<>(Boolean.class, Boolean.FALSE), Boolean.FALSE}};
  }
}
