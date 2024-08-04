package com.techConfig.annotations.drivable.consumer;

import com.techConfig.annotations.drivable.Drivable;
import com.techConfig.annotations.drivable.definition.Drivable;

public class AnnotatedInterfaceParamConsumer {

    @Drivable
    public String setEmpName(Employee employee) {
        return employee.getEmpName();
    }

}
