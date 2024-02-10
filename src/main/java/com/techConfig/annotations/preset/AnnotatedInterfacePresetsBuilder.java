package com.techConfig.annotations.preset;

import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class AnnotatedInterfacePresetsBuilder {

    private List<Function<Object, String>> idExtractors;
    private List<Function<Object, String>> nameExtractors;

    private AnnotatedInterfacePresetsBuilder() {
    }

    public AnnotatedInterfacePresetsBuilder anAnnotatedInterfacePresets() {
        return new AnnotatedInterfacePresetsBuilder();
    }

    public AnnotatedInterfacePresetsBuilder withIdExtractor(List<Function<Object, String>> idExtractors) {
        this.idExtractors = idExtractors;
        return this;
    }

    public AnnotatedInterfacePresetsBuilder withNameExtractor(List<Function<Object, String>> nameExtractors) {
        this.nameExtractors = nameExtractors;
        return this;
    }

    public AnnotatedInterfacePresets build() {
        if (this.idExtractors == null) {
            this.idExtractors = Collections.emptyList();
        }
        if (this.nameExtractors == null) {
            this.nameExtractors = Collections.emptyList();
        }
        return new AnnotatedInterfacePresets(this.nameExtractors, this.idExtractors);
    }
}
