package com.techConfig.annotations.consumer;

import com.techConfig.annotations.definition.AnnotatedInterfaceParam;
import com.techConfig.annotations.model.Employee;

public class AnnotatedInterfaceParamConsumer {

    public String setEmpName(@AnnotatedInterfaceParam Employee employee) {
        return employee.getEmpName();
    }

}
