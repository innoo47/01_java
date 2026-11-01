package com.ohgiraffers.section02.package_and_import;

import com.ohgiraffers.section02.package_and_import.test.Calculator;

// import 등록을 생략해도 되는 패키지 : java.lang

public class Application1 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sum = calculator.plusTwoNumbers(10, 20);
        System.out.println(sum);
    }
}
