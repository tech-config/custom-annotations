package com.techConfig.annotations.drivable.preset;

import com.techConfig.annotations.drivable.model.Specification;

import java.util.List;
import java.util.function.Function;

import static java.util.Collections.emptyList;
import static java.util.Objects.requireNonNullElse;

public class DrivableInterfacePresetsBuilder {

    private List<Function<Object, String>> nameExtractors;
    private List<Function<Object, String>> colorExtractors;
    private List<Function<Object, String>> modelExtractors;
    private List<Function<Object, String>> manufacturerExtractors;
    private List<Function<Object, String>> typeExtractors;
    private List<Function<Object, Specification>> specificationExtractors;

    private DrivableInterfacePresetsBuilder() {
    }

    public static DrivableInterfacePresetsBuilder drivableInterfacePresetsBuilder() {
        return new DrivableInterfacePresetsBuilder();
    }

    public DrivableInterfacePresetsBuilder withNameExtractors(List<Function<Object, String>> nameExtractors) {
        this.nameExtractors = nameExtractors;
        return this;
    }

    public DrivableInterfacePresetsBuilder withColorExtractors(List<Function<Object, String>> colorExtractors) {
        this.colorExtractors = colorExtractors;
        return this;
    }

    public DrivableInterfacePresetsBuilder withModelExtractors(List<Function<Object, String>> modelExtractors) {
        this.modelExtractors = modelExtractors;
        return this;
    }

    public DrivableInterfacePresetsBuilder withManufacturerExtractors(List<Function<Object, String>> manufacturerExtractors) {
        this.manufacturerExtractors = manufacturerExtractors;
        return this;
    }

    public DrivableInterfacePresetsBuilder withTypeExtractors(List<Function<Object, String>> typeExtractors) {
        this.typeExtractors = typeExtractors;
        return this;
    }

    public DrivableInterfacePresetsBuilder withSpecificationExtractors(List<Function<Object, Specification>> specificationExtractors) {
        this.specificationExtractors = specificationExtractors;
        return this;
    }

    public com.techConfig.annotations.drivable.preset.DrivableInterfacePresets build() {
        this.nameExtractors = requireNonNullElse(this.nameExtractors, emptyList());
        this.colorExtractors = requireNonNullElse(this.colorExtractors, emptyList());
        this.modelExtractors = requireNonNullElse(this.modelExtractors, emptyList());
        this.manufacturerExtractors = requireNonNullElse(this.manufacturerExtractors, emptyList());
        this.typeExtractors = requireNonNullElse(this.typeExtractors, emptyList());
        this.specificationExtractors = requireNonNullElse(this.specificationExtractors, emptyList());

        return new com.techConfig.annotations.drivable.preset.DrivableInterfacePresets(
                this.nameExtractors,
                this.colorExtractors,
                this.modelExtractors,
                manufacturerExtractors,
                typeExtractors,
                specificationExtractors
        );
    }
}
