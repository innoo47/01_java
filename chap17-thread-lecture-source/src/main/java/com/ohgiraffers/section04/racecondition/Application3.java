package com.ohgiraffers.section04.racecondition;

public class Application3 {

    static final int TIMES = 100000;

    public static void main(String[] args) throws InterruptedException {

        /**
         * Application2와 같은 결과를 가져오는데, 메서드 전체가 아니라 잠궈야하는 줄만
         * 블럭으로 감싸서 실행한다. 결과는 synchronized 메서드와 동일하다
         * -> 메서드안에 잠글 필요가 없는 작업이 많을 때는 블록으로 잠궈서 범위를 줄이는 편이 좋다
         */

        SharedCounter counter = new SharedCounter();
        Runnable safeWork = () -> {
            for (int i = 0; i < TIMES; i++) {
                counter.incrementBlock();
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
            System.out.println("synchronized block : " + i + " 회 : " + value);
            if (value != 200000) {
                allSame = false;
            }
        }

        System.out.println("synchronized block 5회 모두 200000 : " + allSame);


    }
}
