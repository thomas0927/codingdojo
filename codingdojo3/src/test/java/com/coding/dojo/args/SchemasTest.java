package com.coding.dojo.args;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class SchemasTest {

    @Test(dataProvider = "schema_list")
    public void can_return_correct_schema_value(List<Schema> schemaList, Object[] expected) {
        Schemas schemas = Schemas.reload( schemaList );
        Assert.assertEquals( schemas.getArgValue( (Character) expected[0], expected[1] ), expected[2] );
    }

    @DataProvider
    public static Object[][] schema_list() {
        return new Object[][]{
                {Arrays.asList(
                        Schema.parser( 'l', Boolean.class, Boolean.FALSE ),
                        Schema.parser( 'p', Integer.class, 0 ) ),
                        new Object[]{'l', null, Boolean.FALSE}},
                {Arrays.asList(
                        Schema.parser( 'l', Boolean.class, Boolean.FALSE ),
                        Schema.parser( 'p', Integer.class, 0 ) ),
                        new Object[]{'l', Boolean.TRUE, Boolean.TRUE}},
                {Arrays.asList(
                        Schema.parser( 'l', Boolean.class, Boolean.FALSE ),
                        Schema.parser( 'p', Integer.class, 0 ) ),
                        new Object[]{'p', null, 0}},
                {Arrays.asList(
                        Schema.parser( 'l', Boolean.class, Boolean.FALSE ),
                        Schema.parser( 'p', Integer.class, 0 ) ),
                        new Object[]{'p', 8080, 8080}}};
    }

}
