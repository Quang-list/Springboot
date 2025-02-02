package com.example.EmployeeMgmSyst.employee;

public class Employees {

    private Long id;
    private String name;
    private int salary;

    public Employees() {

    }

    public Employees(Long id, String name, String contact, String jobTitle, String department, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
