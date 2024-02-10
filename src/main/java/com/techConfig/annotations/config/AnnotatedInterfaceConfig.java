package com.techConfig.annotations.config;

import com.techConfig.annotations.model.Employee;

import java.util.function.Function;

public class AnnotatedInterfaceConfig {

    private static class EmployeeIdExtractor implements Function<Object, String> {
        @Override
        public String apply(Object o) {
            String empId = null;
            if (o instanceof Employee) {
                empId = ((Employee) o).getEmpId();
            }
            return empId;
        }
    }

    private static class EmployeeNameExtractor implements Function<Object, String> {
        @Override
        public String apply(Object o) {
            String empName = null;
            if (o instanceof Employee) {
                empName = ((Employee) o).getEmpName();
            }
            return empName;
        }
    }
}
