package com.ohgiraffers.section01.intro;

public class Application1 {
    public static void main(String[] args) {

        /**
         * 인터페이스에 정의된 추상 메소드를 활용
         * 1. 인터페이스를 상속받은 클래스를 정의하여 기능을 완성 후 사용하는 방법
         */

        Calculator c1 = new CalculatorImpl();
        System.out.println("10과 20의 합은 : " + c1.sumToNumbers(10, 20));
        //10과 20의 합은 : 30

        /**
         * 2. 익명클래스를 활용하여 메소드 재정의 후 사용하는 방법
         */
//        Calculator c2 = new Calculator() {
//            @Override
//            public int sumToNumbers(int a, int b) {
//                return a + b;
//            }
//
//            @Override
//            public int minusToNumbers(int a, int b) {
//                return a - b;
//            }
//        };

//        System.out.println("10과 20의 합은 : " + c2.sumToNumbers(10, 20));
        //10과 20의 합은 : 30

        /**
         * 3. 람다식을 활용하는 방법
         */
        Calculator c3 = (a, b) -> a + b;
        System.out.println("10과 20의 합은 : " + c3.sumToNumbers(10, 20));



    }
}
