package com.ohgiraffers.section01.thread;

public class Application {
    public static void main(String[] args) {

        /**
         * Thread를 생성하는 방법
         * 1. Thread 클래스 상속
         * 2. Runnable 인터페이스 구현
         */

        Thread t1 = new Car();                  // Thread
        Thread t2 = new Tank();                 // Thread
        Thread t3 = new Thread(new Plane());    // Runnable

        /* 기본적으로 가지고 있는 우선순위 */
        System.out.println("t1 우선순위 : " + t1.getPriority());
        System.out.println("t2 우선순위 : " + t2.getPriority());
        System.out.println("t3 우선순위 : " + t3.getPriority());
        //t1 우선순위 : 5
        //t2 우선순위 : 5
        //t3 우선순위 : 5

        t2.setPriority(Thread.MAX_PRIORITY);    // 10
        t3.setPriority(Thread.MIN_PRIORITY);    // 1
        // 원하는대로 동작하지는 않는다

        System.out.println("t1 우선순위 : " + t1.getPriority());
        System.out.println("t2 우선순위 : " + t2.getPriority());
        System.out.println("t3 우선순위 : " + t3.getPriority());
        //t1 우선순위 : 5
        //t2 우선순위 : 10
        //t3 우선순위 : 1


        /* run() 메소드 호출 : 메소드 호출 시 별도의 스레드로 동작하지 않고 메인 스레드가 메소드를 호출하는 방식으로 동작 */
//        t3.run();
//        t1.run();
//        t2.run();

        /* start() 메소드 호출 시 별도의 호출 스택을 생성하여 각각의 스레드가 동작 */
        t1.start();
        t2.start();
        t3.start();







    }
}
