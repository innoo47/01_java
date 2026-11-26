package com.ohgiraffers.section02.responsibility.basic.employee.start;

public class Employee {

    private String name;
    private int baseSalary;

    public Employee(String name, int baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return "직원";
    }

    public int monthlyPay() {
        return baseSalary;
    }
}