package com.ohgiraffers.section04.racecondition;

public class Application2 {

    static final int TIMES = 100000;

    public static void main(String[] args) throws InterruptedException {

        /**
         * 한 스레드가 count++를 끝날때까지 다른 스레드는 잠금을 기다리므로 더한 값이 사라지지 않는다
         */

        SharedCounter counter = new SharedCounter();

        Runnable safeWork = () -> {
            for (int i = 0; i < TIMES; i++) {
                counter.incrementSafe();
            }
        };

        boolean allSame = true;

        for (int i = 1; i <= 5; i++) {
            counter.reset();
            Thread t1 = new Thread(safeWork);
            Thread t2 = new Thread(safeWork);
            t1.start();
            t2.start();
            t1.join();
            t2.join();
            int value = counter.get();
            System.out.println("synchronized 메서드 : " + i + " 회 : " + value);
            if (value != 200000) {
                allSame = false;
            }
        }

        System.out.println("synchronized 메서드 5회 모두 200000 : " + allSame);


    }
}
