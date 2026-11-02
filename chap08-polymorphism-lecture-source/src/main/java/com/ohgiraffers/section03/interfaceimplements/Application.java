package com.ohgiraffers.section03.interfaceimplements;

public class Application {
    public static void main(String[] args) {

        /**
         * 인터페이스 란?
         * 자바의 클래스와 유사한 형태지만 상수필드(public static final)와
         * 추상메소드(public static)만 가질 수 있는 클래스의 변형체이다
         */
        /* 인터페이스도 추상 클래스와 동일하게 객체를 생성 할 수 없다 */
//        InterProduct ip1 = new InterProduct();
//        Product p = new Product();
        InterProduct p = new Product(); // 다형성이 적용 가능하다
        p.defaultMethod();
        p.nonStaticMethod();
    }
}
