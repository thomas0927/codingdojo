package com.coding.dojo.args;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Schemas {

    private Map<Character, Schema> schemaMap;

    public static Schemas reload(List<Schema> schemaList) {
        Schemas schemas = new Schemas();
        schemas.schemaMap = schemaList.stream().collect( Collectors.toMap( schema -> schema.getFlag(), schema -> schema ) );
        return schemas;
    }

    public <T> T getArgValue(Character flag, Object value) {
        return (T) schemaMap.get( flag ).getValue( value );
    }

}
