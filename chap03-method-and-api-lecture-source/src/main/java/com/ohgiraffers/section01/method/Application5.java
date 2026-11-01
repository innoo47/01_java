package com.ohgiraffers.section01.method;

public class Application5 {
    public static void main(String[] args) {
        System.out.println("main() method 호출");
        new Application5().testMethod();

        System.out.println("main() method 종료");
    }

    public void testMethod() {  // 반환값도 없고, 매개변수도 없는 non-static method 이다.
        System.out.println("testMethod() 동작 확인");
        // 1. test로 return을 생략해서 실행 확인
        return;
        // 2. 메소드가 호출한 곳으로 돌아가기 위해서는 'return;'을 작성안해도 컴파일러가 자동으로 작성 해준다.

    }
}
