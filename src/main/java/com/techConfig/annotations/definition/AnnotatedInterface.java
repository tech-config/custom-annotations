package com.techConfig.annotations.definition;

import java.lang.annotation.*;
import java.util.function.Function;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface AnnotatedInterface {
    String name() default "Utkarsh";

    String id() default "8624487";

    Class<? extends Function<Object, String>> nameExtractor() default DefaultExtractor.class;
    Class<? extends Function<Object, String>> idExtractor() default DefaultExtractor.class;

    public static class DefaultExtractor implements Function<Object, String>{
        public DefaultExtractor() {
        }

        @Override
        public String apply(Object o) {
            return null;
        }
    }
}

