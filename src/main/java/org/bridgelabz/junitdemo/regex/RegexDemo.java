package org.bridgelabz.junitdemo.regex;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
* It contains at least 8 characters and at most 20 characters.
It contains at least one digit.
It contains at least one upper case alphabet.
It contains at least one lower case alphabet.
It contains at least one special character which includes !@#$%&*()-+=^.
It doesn’t contain any white space.
* */
public class RegexDemo {
    String regex = "^(?=.*[0-9])"
            + "(?=.*[a-z])(?=.*[A-Z])"
            + "(?=.*[@#$%^&+=])"
            + "(?=\\S+$).{8,20}$";
    public static void main(String[] args) {
       validatePincode();
       //validateEmailIds();
    }

    private static void validateEmailIds() {
        ArrayList<String> emailIds = new ArrayList<>();
        emailIds.add("user@domain.com");
        emailIds.add("user@domain.co.in");
        emailIds.add("user1@domain.com");
        emailIds.add("user_name@domain.com");
        emailIds.add("@domain.com");
        emailIds.add("abc#xyz@domain.com");
        emailIds.add("abc@domaincom");

        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";

        Pattern pattern = Pattern.compile(regex);

        for (String email: emailIds) {
            Matcher matcher = pattern.matcher(email);
            matcher.matches();
            System.out.println(email+": "+email.matches(regex));
        }
    }

    private static void validatePincode() {
        ArrayList<String> pincodes = new ArrayList<>();
        pincodes.add("012345");
        pincodes.add("12345");
        pincodes.add("1234567");
        pincodes.add("12345a");
        pincodes.add("123456");
        pincodes.add("100000");
        pincodes.add("999999");

        String regex = "^[1-9][0-9]{5}$";
        for (String pincode: pincodes) {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(pincode);
            System.out.println(pincode + ": "+ matcher.matches());
        }
    }
}
