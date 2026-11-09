package com.ohgiraffers.section04.racecondition;

public class Application {

    static final int TIMES = 100000;

    public static void main(String[] args) throws InterruptedException {

        /**
         * count++가 읽기 -> 더하기 -> 쓰기 세 단계라서, 두 스레드가 같은 값을 읽고 각자 쓰면
         * 한번이 사라지기 때문에 값은 실행할 때마다 다르다. 줄어들수는 있어도 200000을 넘지는 않는다
         */



        // 두 스레드가 함께 쓰는 공유 객체
        SharedCounter counter = new SharedCounter();

        // 스레드 하나가 할 일 : 카운터를 TIMES번 늘린다
        Runnable unsafework = () -> {
            for (int i = 0; i < TIMES; i++) {
                counter.increment();
            }
        };

        Thread first = new Thread(unsafework);
        Thread second = new Thread(unsafework);
        first.start();
        second.start();

        System.out.println("join 없이 읽는 값 : " + counter.get());
        //join 없이 읽는 값 : 0


        // 다음 실행에 영향을 주지 않도록 두 스레드가 끝날 때까지 기다린다
        first.join();
        second.join();

        boolean neverOver = true;
        for (int i = 0; i <= 3; i++) {

            counter.reset();

            Thread t1 = new Thread(unsafework);
            Thread t2 = new Thread(unsafework);
            t1.start();
            t2.start();

            // 해당 스레드가 끝날때까지 main스레드가 기다린다
            t1.join();
            t2.join();

            int value = counter.get();
            System.out.println("동기화 없음 " + i + "회 : " + value);
            if(value > 200000) {
                neverOver = false;
            }
        }

        System.out.println("동기화 없음 값이 200000 이하 : " + neverOver);


    }
}
