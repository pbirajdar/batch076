package org.bridgelabz.junitdemo.annotations;

public class Employee {
    @Value(id = 10)
    private int id;
    @Value(name = "abc")
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Value(id = 101)
    public void work() {
        System.out.println("Employee is working");
    }

    @Deprecated
    public void enjoyment() {
        System.out.println("Employee is enjoying");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
