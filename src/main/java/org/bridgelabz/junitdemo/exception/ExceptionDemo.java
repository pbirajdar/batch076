package org.bridgelabz.junitdemo.exception;

import java.io.IOException;
import java.util.Scanner;

public class ExceptionDemo {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        validateSecondParam(b);
    }

    private static void validateSecondParam(int b) throws InvalidInputException {
        if (b == 0) {
            throw new InvalidInputException("B should not be zero!");
        }
    }

}
