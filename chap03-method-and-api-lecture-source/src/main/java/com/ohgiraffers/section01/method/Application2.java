package com.ohgiraffers.section01.method;

public class Application2 {
    /* static이 없는 메소드 호출 사용 */
    public static void main(String[] args) {
        System.out.println("main() 시작됨");
        // static 키워드가 없을 때 메소드를 호출하는 방법
        // 내가 사용하려는 메소드가 있는 클래스명 [변수명] = new 클래스명(); --> 객체를 생성
        Application2 app = new Application2();
        app.methodA();
        app.methodB();

        /* Application3의 메소드 호출 연습 */
        Application3.test(10);

        System.out.println("main() 종료됨");
    }

    // static 키워드가 없는 메소드 선언

    /**
     * static 키워드가 없는
     * non-static method 사용
     */
    public void methodA() {
        System.out.println("methodA() 호출됨");
        System.out.println("methodA() 종료됨");
    }

    public void methodB() {
        System.out.println("methodB() 호출됨");
        System.out.println("methodB() 종료됨");
    }
}
