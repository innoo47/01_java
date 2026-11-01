package com.ohgiraffers.section02.package_and_import;


import com.ohgiraffers.section02.package_and_import.test.Calculator;

import static com.ohgiraffers.section02.package_and_import.test.Calculator.*;

public class Application2 {
    public static void main(String[] args) {
        // non-static method
        Calculator cal = new Calculator();
        int result = cal.plusTwoNumbers(10, 20);
        System.out.println("result = " + result);

        // 패키지가 다르지만 클래스 명이 같은 경우에는 import 구문을 중첩해서 사용하지 못하니
        // 풀패키지명.클래스명으로 사용해야한다
        com.ohgiraffers.section01.method.Calculator calculator = new com.ohgiraffers.section01.method.Calculator();
        int result2 = calculator.plusTwoNumbers(10,20);
        System.out.println("result2 = " + result2);

        // static method 사용 방법
        int result3 = Calculator.maxNumberOf(10, 30);   // 클래스명으로 시작
        System.out.println("result3 = " + result3);

        int result4 = maxNumberOf(10, 40); // import static을 이용해서 사용
        System.out.println("result4 = " + result4);

        int result5 = minNumberOf(10, 40);
        System.out.println("result5 = " + result5);


    }
}
