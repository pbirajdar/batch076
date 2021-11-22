package org.bridgelabz.junitdemo.lambdademo;

@FunctionalInterface
public interface Calculator {
    int calculate(int a, int b);

    default String someMethod() {
        return "hello";
    }

    static void print(int a, int b, Calculator calculator) {
        System.out.println(calculator.calculate(a, b));
    }
}
