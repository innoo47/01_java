package com.ohgiraffers.section05.threadcontrol;

public class Application3 {
    public static void main(String[] args) throws InterruptedException {

        /**
         * interrupt
         * intertupt()는 스레드를 강제로 끝내지 않는다.
         * 대상 스레드에 "중단 요청" 표시만 남긴다
         */

        Thread sleepingWorker = new Thread(() -> {
            int step = 1;

            try {
                while (true) {
                    System.out.println("작업 진행 : " + step);
                    step++;
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                System.out.println("중단 요청 받음");
                System.out.println("catch안에서 isInterrupted : " + Thread.currentThread().isInterrupted());
            }
        });

        sleepingWorker.start();
        Thread.sleep(300);



    }
}
