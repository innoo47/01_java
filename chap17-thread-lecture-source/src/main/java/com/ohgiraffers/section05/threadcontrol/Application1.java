package com.ohgiraffers.section05.threadcontrol;

public class Application1 {
    public static void main(String[] args) throws InterruptedException {

        /**
         * Thread.sleep(밀리초) : 지금 실행중인 스레드를 지정한 시간동안 멈춘다
         * 멈춘동안 다른 스레드가 중단을 요청하면 InterruptedException이 발생하므로 try-catch로 처리해야한다
         */

        /**
         * getState() : 스레드의 현재 상태(Thread.State)를 돌려준다
         * start() 전에는 NEW, 실행중에는 RUNNABLE, sleep중에는 TIMED_WAITING,
         * 끝난뒤에는 TERMINATED이다
         */

        Thread sleeper = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println("sleep 반복 " + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println("sleep중에 중단됨");
                    return; // 중단 요청을 받으면 반복을 그만두고 스레드를 끝낸다
                }
            }
            System.out.println("sleep 반복 끝");
        });

        System.out.println("시작 전 상태 : " + sleeper.getState());  // NEW
        sleeper.start();
        sleeper.join();     // sleeper가 끝날 때 까지 main이 기다린다
        System.out.println("끝난 뒤 상태 : " + sleeper.getState());  // TERMINATED

    }
}
