package com.techConfig.annotations.drivable.preset;

import com.techConfig.annotations.drivable.Specification;
import com.techConfig.annotations.drivable.model.Specification;
import lombok.Data;

import java.util.List;
import java.util.function.Function;

@Data
public class DrivableInterfacePresets {
    private final List<Function<Object, String>> nameExtractors;
    private final List<Function<Object, String>> colorExtractors;
    private final List<Function<Object, String>> modelExtractors;
    private final List<Function<Object, String>> manufacturerExtractors;
    private final List<Function<Object, String>> typeExtractors;
    private final List<Function<Object, Specification>> specificationExtractors;

    public DrivableInterfacePresets(List<Function<Object, String>> nameExtractors,
                                    List<Function<Object, String>> colorExtractors,
                                    List<Function<Object, String>> modelExtractors,
                                    List<Function<Object, String>> manufacturerExtractors,
                                    List<Function<Object, String>> typeExtractors,
                                    List<Function<Object, Specification>> specificationExtractors) {
        this.nameExtractors = nameExtractors;
        this.colorExtractors = colorExtractors;
        this.modelExtractors = modelExtractors;
        this.manufacturerExtractors = manufacturerExtractors;
        this.typeExtractors = typeExtractors;
        this.specificationExtractors = specificationExtractors;
    }

    public List<Function<Object, String>> getNameExtractors() {
        return nameExtractors;
    }

    public List<Function<Object, String>> getColorExtractors() {
        return colorExtractors;
    }

    public List<Function<Object, String>> getModelExtractors() {
        return modelExtractors;
    }

    public List<Function<Object, String>> getManufacturerExtractors() {
        return manufacturerExtractors;
    }

    public List<Function<Object, String>> getTypeExtractors() {
        return typeExtractors;
    }

    public List<Function<Object, Specification>> getSpecificationExtractors() {
        return specificationExtractors;
    }
}
