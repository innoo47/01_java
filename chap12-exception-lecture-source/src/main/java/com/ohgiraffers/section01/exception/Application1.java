package com.ohgiraffers.section01.exception;

public class Application1 {
    public static void main(String[] args) {

        /**
         * [ 예외처리 방법 ]
         *
         * 1. throws로 위임
         * 2. try-catch문으로 처리
         *
         * [ 강제로 예외를 발생 ]
         * 발생시켜서 로직의 원하는 방향으로 유도
         * throw new 예외클래스명();
         */
        ExceptionTest exceptionTest = new ExceptionTest();
//        exceptionTest.checkEnoughMoney(10000, 50000);
        //가지고 계신 돈은 50000원 입니다
        //상품을 구입하기 위한 금액이 충분합니다
        //즐거운 쇼핑되세요
//        exceptionTest.checkEnoughMoney(50000, 10000);
        //가지고 계신 돈은 10000원 입니다
        //상품을 구입하기 위한 금액이 부족합니다
        //즐거운 쇼핑되세요
        System.out.println("프로그램이 종료합니다");


    }
}
