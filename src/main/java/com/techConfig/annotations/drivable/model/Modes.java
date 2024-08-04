package com.techConfig.annotations.drivable.model;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public enum Modes {
    ECO(50, "Economic Mode"),
    SPORTS(100, "Sports Mode"),
    TRACK(150, "Track Mode");

    private final int speed;
    private final String description;

    Modes(int speed, String description) {
        this.speed = speed;
        this.description = description;
    }

    public int getSpeed() {
        return speed;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
