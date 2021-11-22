package org.bridgelabz.junitdemo.reportgenerator.service.impl;

import org.bridgelabz.junitdemo.reportgenerator.entity.Employee;
import org.bridgelabz.junitdemo.reportgenerator.service.UserInputService;
import org.bridgelabz.junitdemo.reportgenerator.util.FileUtil;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class FileInput implements UserInputService {
    private static final String IP_FILE_PATH = "/tmp/ipdata.txt";

    FileUtil fileUtil;

    public FileInput() {
        fileUtil = new FileUtil(IP_FILE_PATH);
    }

    @Override
    public List<Employee> takeInput() {
        List<String> lines = null;
        List<Employee> listOfEmployees = null;
        try {
            lines = fileUtil.readDataFromFile();
            listOfEmployees = lines.stream().map(line -> {
                String[] empRecord = line.split(" ");
                return mapEmployeeData(empRecord);
            }).collect(Collectors.toList());
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return listOfEmployees;
    }

    private Employee mapEmployeeData(String[] empRecord) {
        Employee employee = new Employee();
        employee.setFirstName(empRecord[0]);
        employee.setLastName(empRecord[1]);
        employee.setSalary(Double.parseDouble(empRecord[2]));
        employee.setAddr(empRecord[3]);
        employee.setCreationDate(new Date());
        employee.setUpdatationDate(new Date());
        return employee;
    }
}
