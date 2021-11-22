package org.bridgelabz.junitdemo;

import java.util.Objects;

public class UserLogin {

    public
    String login(String username, String password) {

        String msg = null;
        if (Objects.isNull(username) || username.length() < 4) {
            msg =  "username is invalid!";
        } else if (Objects.isNull(password)) {
            msg = "password is invalid!";
        } else if ("abcd".equals(username) && "123456".equals(password)) {
            msg = "logged in successfully!";
        } else {
            msg = "username or password is invalid!";
        }
        return msg;
    }
}
