package org.bridgelabz.junitdemo.reportgenerator.service;

import org.bridgelabz.junitdemo.reportgenerator.entity.Employee;

import java.util.List;

public interface ReportGeneratorService {
    void generateReport(List<Employee> employees);
}
