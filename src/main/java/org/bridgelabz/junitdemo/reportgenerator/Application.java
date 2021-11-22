package org.bridgelabz.junitdemo.reportgenerator;

import org.bridgelabz.junitdemo.reportgenerator.entity.Employee;
import org.bridgelabz.junitdemo.reportgenerator.service.ReportGeneratorService;
import org.bridgelabz.junitdemo.reportgenerator.service.UserInputService;
import org.bridgelabz.junitdemo.reportgenerator.service.impl.FileInput;
import org.bridgelabz.junitdemo.reportgenerator.service.impl.TextReportGenerator;
import org.bridgelabz.junitdemo.reportgenerator.util.FileUtil;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) throws IOException {
        UserInputService userInputService = new FileInput();
        ReportGeneratorService reportGeneratorService = new TextReportGenerator();
        List<Employee> listOfEmployees = userInputService.takeInput();
        reportGeneratorService.generateReport(listOfEmployees);
        Scanner scanner = new Scanner(System.in);
        int deleteReport = scanner.nextInt();
        if (deleteReport == 1) {
            FileUtil fileUtil = new FileUtil("/tmp/report.txt");
            System.out.println("Deleted:" +fileUtil.removeFile());
        }
    }
}
