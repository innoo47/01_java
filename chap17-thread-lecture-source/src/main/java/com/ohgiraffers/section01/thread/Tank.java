package com.ohgiraffers.section01.thread;

public class Tank extends Thread {

    /**
     * 방법 1. Thread 클래스를 상속해 만든 스레드
     * - Tank 객체 자체가 스레드이므로
     * - Thread를 상속했기 때문에 다른 클래스는 더 이상 상속 못한다 (단일 상속)
     */

    /* Tank 스레드로 수행할 작업 내용을 작성 */

    @Override
    public void run() {

        for (int i = 0; i <= 1000; i++) {
            System.out.println("Tank Shooting");

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }
}
