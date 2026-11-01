package com.ohgiraffers.section01.method;

public class Application1 {
    public static void main(String[] args) {
        System.out.println("main() 시작함");
        Application1.methodA(); // static 키둬드가 붙어있는 메서드를 호출하는 방식 : 클래스명.메소드명
        System.out.println("main() 종료됨");
    }

    // 메소드에 static이라는 키워드가 붙어있을 때 메소드를 호출하는 형태
    public static void methodA() {
        System.out.println("methodA 호출");
        methodB();  // 같은 클래스 내의 static 메서드는 클래스명을 생략 가능
        return;
    }

    /**
     * methodB() 입니다
     */
    public static void methodB() {
        System.out.println("methodB() 호출됨");
        System.out.println("methodB() 종료됨");
    }
}
