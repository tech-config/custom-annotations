package com.techConfig.annotations.drivable.utils;

import com.techConfig.annotations.drivable.model.Specification;

public class DrivableExtractors {
    public static String extractName(Object name) {
        if (name instanceof String) {
            return (String) name;
        }
        return null;
    }

    public static String extractColor(Object color) {
        if (color instanceof String) {
            return (String) color;
        }
        return null;
    }

    public static String extractModel(Object model) {
        if (model instanceof String) {
            return (String) model;
        }
        return null;
    }

    public static String extractManufacturer(Object manufacturer) {
        if (manufacturer instanceof String) {
            return (String) manufacturer;
        }
        return null;
    }

    public static String extractType(Object type) {
        if (type instanceof String) {
            return (String) type;
        }
        return null;
    }

    public static Specification extractSpecifications(Object specifications) {
        if (specifications instanceof Specification) {
            return (Specification) specifications;
        }
        return null;
    }

}
