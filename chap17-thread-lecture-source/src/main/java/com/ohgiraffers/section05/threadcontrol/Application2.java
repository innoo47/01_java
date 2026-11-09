package com.ohgiraffers.section05.threadcontrol;

public class Application2 {
    public static void main(String[] args) throws InterruptedException {

        /**
         * join() : 대상 스레드가 끝날 때까지 지금 스레드(main)가 기다린다
         * join(밀리초) : 지정한 밀리초 시간만큼만 기다리고, 대상 스레드가 아직 일하는 중이여도 main이 먼저 실행한다
         * isAlive()로 대상 스레드가 아직 실행중인지 확인
         */

        /* join() : 스레드가 끝날때 까지 기다린다 */
        Thread shortWorker = new Thread(() -> {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println("기다리는 중에 중단됨");
            }
            System.out.println("짧은 작업 끝");
        });
        shortWorker.start();
        shortWorker.join();
        System.out.println("main 계속(join)");


        /* join(밀리초) : 정한 시간만 기다리고 main이 먼저 진행된다 */
        Thread longWorker = new Thread(() -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("기다리는 중에 중단됨");
            }
            System.out.println("긴 작업 끝");
        });

        longWorker.start();
        longWorker.join(100);   // 0.1초만 기다린다
        System.out.println("join(100) 뒤 isAlive: " + longWorker.isAlive());
        System.out.println("main 계속(join(100))");
        //짧은 작업 끝
        //main 계속(join)
        //join(100) 뒤 isAlive: true
        //main 계속(join(100))
        //긴 작업 끝


    }
}
