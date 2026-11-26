package com.ohgiraffers.section02.responsibility.basic.employee.start;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("김철수", 3000000));
        employees.add(new Manager("이영희", 3000000, 500000));

        // TODO 단계 4: 두 객체를 List<Employee>에 담고, 반복 한 번으로 출력한다

        for(Employee e: employees) {
            System.out.println(e.getTitle() + " " + e.getName() + " 월급 : " + e.monthlyPay());
        }
    }
}