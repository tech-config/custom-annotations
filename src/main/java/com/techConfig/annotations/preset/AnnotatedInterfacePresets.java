package com.techConfig.annotations.preset;

import java.util.List;
import java.util.function.Function;

public class AnnotatedInterfacePresets {

    private final List<Function<Object, String>> nameExtractors;
    private final List<Function<Object, String>> idExtractors;

    public AnnotatedInterfacePresets(List<Function<Object, String>> empNameExtractor, List<Function<Object, String>> empIdExtractor) {
        this.nameExtractors = empNameExtractor;
        this.idExtractors = empIdExtractor;
    }

    public List<Function<Object, String>> getNameExtractors() {
        return nameExtractors;
    }

    public List<Function<Object, String>> getIdExtractors() {
        return idExtractors;
    }
}
