package org.bridgelabz.junitdemo.annotations;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, NoSuchFieldException {
        Employee employee = new Employee();
        Method helloMethod = employee.getClass().getMethod("work");
        Field field = employee.getClass().getDeclaredField("name");
        Value nameFieldAnn = field.getAnnotation(Value.class);
        if (employee.getName() == null) {
            employee.setName(nameFieldAnn.name());
        }
        System.out.println(employee);

        Value valueAnnotation = helloMethod.getAnnotation(Value.class);
        System.out.println(valueAnnotation.id());
    }
}
