package org.bridgelabz.junitdemo.gson;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Country india = new Country();
        india.setName("India");
        india.setPopulation(100000);
        india.setStates(Arrays.asList("Maharashtra", "Telangana", "Karnataka"));
        Gson gson = new Gson();
        String jsonString = gson.toJson(india);

        try {
            FileWriter fileWriter = new FileWriter("/tmp/country.json");
            fileWriter.write(jsonString);
            fileWriter.close();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
