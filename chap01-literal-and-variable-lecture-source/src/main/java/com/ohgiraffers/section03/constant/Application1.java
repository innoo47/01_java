package com.ohgiraffers.section03.constant;

public class Application1 {
    public static void main(String[] args) {
        // final이라는 단어를 보면, 마지막, 종단, 변하지 않는다는 의미
        final int AGE;    // 상수의 변수명은 대문자로 표기(암묵적)

        AGE = 18;
//        AGE = 20;

        System.out.println("AGE = " + AGE);
    }
}
