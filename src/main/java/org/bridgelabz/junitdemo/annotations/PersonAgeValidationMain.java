package org.bridgelabz.junitdemo.annotations;

import java.lang.reflect.Field;

public class PersonAgeValidationMain {
    public static void main(String[] args) throws NoSuchFieldException {
        Person person = new Person();
        person.setAge(20);
        Field field = person.getClass().getDeclaredField("age");
        ValidAge validAge = field.getAnnotation(ValidAge.class);
        // valid annotation is used then only validate the field
        if (validAge != null) {
            if (person.getAge() < 18) {
                throw new RuntimeException("Person is not eligible for voting.");
            }
        }
    }
}
