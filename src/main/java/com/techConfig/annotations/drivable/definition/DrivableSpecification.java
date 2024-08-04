package com.techConfig.annotations.drivable.definition;

import com.techConfig.annotations.drivable.Modes;
import com.techConfig.annotations.drivable.model.Modes;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface DrivableSpecification {

    String horsePower() default "";

    String torque() default "";

    String length() default "";

    String width() default "";

    String groundClearance() default "";

    Modes modes() default Modes.ECO;
}
