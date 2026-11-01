package com.ohgiraffers.section01.method;

public class Application3 {
    // 전역
    static int global = 10; // 클래스(static) 변수

    public static void main(String[] args) {
        // 지역
        int local = 20; // 지역변수
        System.out.println("global = " + global);
        System.out.println("local = " + local);
        test(local);

        // static이 없는 메소드 호출
        // 클래스명 변수명 = new 클래스명();
        Application3 app3 = new Application3();
        app3.testMethod(13);       // 매개변수의 타입에 맞는 값을 그대로 입력하는 방법
        app3.testMethod(local);         // 매개변수의 타입에 맞는 변수를 이용해서 입력하는 방법
        double dAge = 12.35;
        app3.testMethod((int)dAge);

//        Application3 app = new Application3();  <<--- app 변수에 주소를 담아서 여러군데에서 필요할 때마다 app으로 호출
        new Application3().testMethod(13);  // 여기서만 사용하겠다

    }

    /**
     * 메소드의 매개변수가 있으면 반드시 해당 타입과 갯수, 위치에 맞게 제공해야한다
     * @param local
     */
    public static void test(int local) {
        System.out.println("global = " + global);
        System.out.println("local = " + local);
    }

    public void testMethod(int age) {
        System.out.println("당신의 나이는 " + age + "세 입니다");
    }
}
