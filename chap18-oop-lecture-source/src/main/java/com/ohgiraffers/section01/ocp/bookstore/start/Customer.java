package com.ohgiraffers.section01.ocp.bookstore.start;

/*
 * 서점 고객 한 사람을 나타내는 클래스다.
 * 필드는 private으로 숨기고, 값은 생성자로 받아 메소드로 읽는다.
 * */
public class Customer {

    private String name;
    private String grade;

    public Customer(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }
}