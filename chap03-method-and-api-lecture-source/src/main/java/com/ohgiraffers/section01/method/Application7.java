package com.ohgiraffers.section01.method;

public class Application7 {
    public static void main(String[] args) {
        int first = 100;
        int second = 50;

        Calculator calculator = new Calculator();

        // 덧셈
        int sum = calculator.plusTwoNumbers(first, second);
        System.out.println("두 수의 합은 ? " + sum);

        // 뺄셈
        System.out.println("두 수의 차는? " + calculator.subTwoNumbers(first, second));

        // 두 수 중의 최대값 구하기
        // static method를 호출하기 위한 방법
        System.out.println("두 수중 큰값은?" + Calculator.maxNumberOf(first, second));
        System.out.println("두 수중 작은값은?" + Calculator.minNumberOf(first, second));



    }


}
