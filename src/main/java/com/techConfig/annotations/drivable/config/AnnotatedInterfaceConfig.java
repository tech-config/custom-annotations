package com.techConfig.annotations.drivable.config;

import com.techConfig.annotations.drivable.model.Specification;
import com.techConfig.annotations.drivable.preset.DrivableInterfacePresets;
import com.techConfig.annotations.drivable.preset.DrivableInterfacePresetsBuilder;
import com.techConfig.annotations.drivable.utils.DrivableExtractors;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;
import java.util.function.Function;

@Configuration
public class AnnotatedInterfaceConfig {

    Function<Object, String> drivableNameExtractor = DrivableExtractors::extractName;
    Function<Object, String> drivableColorExtractor = DrivableExtractors::extractColor;
    Function<Object, String> drivableModelExtractor = DrivableExtractors::extractModel;
    Function<Object, String> drivableManufacturerExtractor = DrivableExtractors::extractManufacturer;
    Function<Object, String> drivableTypeExtractor = DrivableExtractors::extractType;
    Function<Object, Specification> drivableSpecificationExtractor = DrivableExtractors::extractSpecifications;

    @Bean
    public DrivableInterfacePresets drivableInterfacePresets() {
        return DrivableInterfacePresetsBuilder.drivableInterfacePresetsBuilder()
                .withNameExtractors(Collections.singletonList(drivableNameExtractor))
                .withColorExtractors(Collections.singletonList(drivableColorExtractor))
                .withModelExtractors(Collections.singletonList(drivableModelExtractor))
                .withManufacturerExtractors(Collections.singletonList(drivableManufacturerExtractor))
                .withTypeExtractors(Collections.singletonList(drivableTypeExtractor))
                .withSpecificationExtractors(Collections.singletonList(drivableSpecificationExtractor))
                .build();

    }
}
