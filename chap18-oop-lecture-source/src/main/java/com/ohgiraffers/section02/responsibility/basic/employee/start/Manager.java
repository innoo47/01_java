package com.ohgiraffers.section02.responsibility.basic.employee.start;

public class Manager extends Employee {

    // TODO 단계 1: 클래스 선언에 extends Employee를 붙이고, 생성자 첫 줄에 super(name, baseSalary)를 쓴다
    // TODO 단계 3: Employee와 겹치는 필드 name·baseSalary, 그 필드에 값을 넣는 두 줄, getName()을 지운다
    private String name;
    private int baseSalary;
    private int bonus;

    public Manager(String name, int baseSalary, int bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    // TODO 단계 2: 다시 정의한 getTitle()과 monthlyPay() 위에 @Override를 붙이고, baseSalary 대신 super.monthlyPay()를 쓴다
    @Override
    public String getTitle() {
        return "관리자";
    }

    @Override
    public int monthlyPay() {
        return super.monthlyPay() + bonus;
    }
}