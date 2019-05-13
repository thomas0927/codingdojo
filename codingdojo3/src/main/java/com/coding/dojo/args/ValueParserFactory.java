package com.coding.dojo.args;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class ValueParserFactory {

    public static Map<Class, Function<String, Object>> converters = new HashMap<>();

    static {
        converters.put( Boolean.class, str -> "true".equalsIgnoreCase( str ) );
        converters.put( Integer.class, Integer::new );
        converters.put( String.class, str -> str );
    }

    public static Object parserValue(Object value, Class type) {
        return Optional.ofNullable( converters.get( type ) ).
                map( parser -> parser.apply( String.valueOf( value ) ) ).orElse( null );

    }
}