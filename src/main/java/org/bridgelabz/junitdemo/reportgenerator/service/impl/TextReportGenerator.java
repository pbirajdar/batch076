package org.bridgelabz.junitdemo.reportgenerator.service.impl;

import org.bridgelabz.junitdemo.reportgenerator.entity.Employee;
import org.bridgelabz.junitdemo.reportgenerator.service.ReportGeneratorService;
import org.bridgelabz.junitdemo.reportgenerator.util.FileUtil;

import java.io.IOException;
import java.util.List;

public class TextReportGenerator implements ReportGeneratorService {

    FileUtil fileUtil;
    private static final String IP_FILE_PATH = "/tmp/report.txt";

    public TextReportGenerator() {
        fileUtil = new FileUtil(IP_FILE_PATH);
    }

    @Override
    public void generateReport(List<Employee> employees) {
        employees.stream().forEach(employee -> {
            try {
                fileUtil.writeData(employee.toString());
            } catch (IOException ioException) {
                System.err.println(ioException.getMessage());
            }
        });
    }
}
