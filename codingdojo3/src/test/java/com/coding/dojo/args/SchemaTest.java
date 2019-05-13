package com.coding.dojo.args;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SchemaTest {

    @Test(dataProvider = "boolean_schema")
    public void can_parser_boolean_schema(Character flag, Class type, Boolean defaultValue, Boolean expected) {
        Schema schema = Schema.parser( flag, type, defaultValue );
        Assert.assertEquals( schema.getValue(), expected );
    }

    @Test(dataProvider = "integer_schema")
    public void can_parser_integer_schema(Character flag, Class type, Integer defaultValue, Integer expected) {
        Schema schema = Schema.parser( flag, type, defaultValue );
        Assert.assertEquals( schema.getValue( defaultValue.toString() ), expected );
    }

    @Test(dataProvider = "string_schema")
    public void can_parser_string_schema(Character flag, Class type, String defaultValue, String expected) {
        Schema schema = Schema.parser( flag, type, defaultValue );
        Assert.assertEquals( schema.getValue( defaultValue ), expected );
    }

    @Test(dataProvider = "bool_schemas")
    public void can_return_bool_schemas_value(List<Schema> schemaList, Character flag, Boolean expected) {
        Map<Character, Schema> schemas = schemaList.stream().collect( Collectors.toMap( Schema::getFlag, schema -> schema ) );
        Assert.assertEquals( schemas.get( flag ).getValue(), expected );
        Assert.assertEquals( schemas.get( flag ).getValue(null), expected );
    }

    @DataProvider
    public static Object[][] bool_schemas() {
        return new Object[][]{
                {Arrays.asList(
                        Schema.parser( 'l', Boolean.class, Boolean.FALSE ),
                        Schema.parser( 'k', Boolean.class, Boolean.TRUE ) ),'k',Boolean.TRUE}};
    }

    @DataProvider
    public static Object[][] string_schema() {
        return new Object[][]{{'d', String.class, "", ""}, {'d', String.class, "/usr/logs", "/usr/logs"}, {'b', String.class, ".", "."}};
    }

    @DataProvider
    public static Object[][] boolean_schema() {
        return new Object[][]{{'l', Boolean.class, Boolean.FALSE, Boolean.FALSE}, {'b', Boolean.class, Boolean.TRUE, Boolean.TRUE}};
    }

    @DataProvider
    public static Object[][] integer_schema() {
        return new Object[][]{{'p', Integer.class, 8080, 8080}, {'r', Integer.class, 0, 0}};
    }
}
