package com.techConfig.annotations.drivable.model;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Specification {
    private String horsePower;
    private String torque;
    private String length;
    private String width;
    private String groundClearance;
    private com.techConfig.annotations.drivable.model.Modes modes;


    public Specification() {
    }

    public Specification(String horsePower, String torque, String length, String width, String groundClearance, com.techConfig.annotations.drivable.model.Modes modes) {
        this.horsePower = horsePower;
        this.torque = torque;
        this.length = length;
        this.width = width;
        this.groundClearance = groundClearance;
        this.modes = modes;
    }

    public String getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(String horsePower) {
        this.horsePower = horsePower;
    }

    public String getTorque() {
        return torque;
    }

    public void setTorque(String torque) {
        this.torque = torque;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getGroundClearance() {
        return groundClearance;
    }

    public void setGroundClearance(String groundClearance) {
        this.groundClearance = groundClearance;
    }

    public com.techConfig.annotations.drivable.model.Modes getModes() {
        return modes;
    }

    public void setModes(com.techConfig.annotations.drivable.model.Modes modes) {
        this.modes = modes;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
