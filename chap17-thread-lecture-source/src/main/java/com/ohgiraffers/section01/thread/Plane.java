package com.ohgiraffers.section01.thread;

public class Plane implements Runnable {

    /**
     * 상속을 몇개를 받을지에 따라 클래스를 상속받을지
     * 인터페이스를 상속받을지 정해야 한다
     */


    @Override
    public void run() {

        for (int i = 1; i < 1000; i++) {

            System.out.println("Plane flight");

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
