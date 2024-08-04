package com.techConfig.annotations.drivable.definition;

import com.techConfig.annotations.drivable.DrivableSpecification;

import java.lang.annotation.*;
import java.util.function.Function;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface Drivable {

    String name() default "";

    String color() default "";

    String model() default "";

    String manufacturer() default "";

    String type() default "";

    DrivableSpecification specs() default @com.techConfig.annotations.drivable.definition.DrivableSpecification;

    Class<? extends Function<Object, String>> nameExtractor() default DefaultExtractor.class;

    Class<? extends Function<Object, String>> colorExtractor() default DefaultExtractor.class;

    Class<? extends Function<Object, String>> modelExtractor() default DefaultExtractor.class;

    Class<? extends Function<Object, String>> manufacturerExtractor() default DefaultExtractor.class;

    Class<? extends Function<Object, String>> typeExtractor() default DefaultExtractor.class;
    Class<? extends Function<Object, String>> specificationExtractor() default DefaultExtractor.class;

    public static class DefaultExtractor implements Function<Object, String> {
        public DefaultExtractor() {
        }

        @Override
        public String apply(Object o) {
            return null;
        }
    }
}

