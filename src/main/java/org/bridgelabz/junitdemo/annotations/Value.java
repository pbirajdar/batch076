package org.bridgelabz.junitdemo.annotations;


import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({METHOD, FIELD})
public @interface Value {
    int id() default 0;
    String name() default "";
}
