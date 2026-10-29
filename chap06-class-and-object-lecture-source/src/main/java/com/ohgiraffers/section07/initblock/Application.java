package com.ohgiraffers.section07.initblock;

public class Application {
    public static void main(String[] args) {

        Product product = new Product();
        System.out.println(product.getInformation());
        // 인스턴스 변수  : JVM기본값 -> 명시적초기값 -> 인스턴스 초기화 블럭 -> 생성자
        // 클래스 변수   : JVM기본값 -> 명시적초기값 -> static 초기화 블럭 -> 인스턴스 초기화 블럭 -> 생성자

        //null 0 null
        //은하수 2000000 삼송
        //사이언 80000 사과

        Product product2 = new Product("대륙폰", 500000, "샤우미");
        System.out.println(product2.getInformation());
        //인스턴스 초기화 블럭 동작함
        //매개변수 있는 생성자 동작
        //대륙폰 500000 샤우미





    }
}
