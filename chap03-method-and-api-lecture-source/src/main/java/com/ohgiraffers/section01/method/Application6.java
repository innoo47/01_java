package com.ohgiraffers.section01.method;

public class Application6 {
    public static void main(String[] args) {
        System.out.println("main() 메소드 호출");

        testMethod();

        String result = testMethod();
        System.out.println(result);

        System.out.println("testMethod() = " + testMethod());

        System.out.println("main() 메소드 종료");
    }

    public static String testMethod() {
        // String타입의 값을 반환하고, 매개변수가 없는 static 메소드
        System.out.println("testMethod() 메소드 실행");
        return "test";
    }
}
