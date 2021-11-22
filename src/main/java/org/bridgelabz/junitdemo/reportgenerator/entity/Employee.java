package org.bridgelabz.junitdemo.reportgenerator.entity;

import java.util.Date;

public class Employee {

    private String firstName;
    private String lastName;
    private Double salary;
    private String addr;
    private Date creationDate;
    private Date updatationDate;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getUpdatationDate() {
        return updatationDate;
    }

    public void setUpdatationDate(Date updatationDate) {
        this.updatationDate = updatationDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", addr='" + addr + '\'' +
                ", creationDate=" + creationDate +
                ", updatationDate=" + updatationDate +
                '}';
    }
}
