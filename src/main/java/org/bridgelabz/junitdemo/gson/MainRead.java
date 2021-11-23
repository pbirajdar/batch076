package org.bridgelabz.junitdemo.gson;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class MainRead {
    public static void main(String[] args) {
        Gson gson = new Gson();

        try {
            BufferedReader br = new BufferedReader(new FileReader("/tmp/country.json"));
            Country india = gson.fromJson(br, Country.class);

            System.out.println(india);

        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }


    }
}
