package com.ohgiraffers.section03.sync;

public class Application {
    public static void main(String[] args) {

        /**
         * 동기화와 wait/notify : 생산자, 소비자
         * 생산자(Producer) 와 소비자(Consumer) 두 스레드가 Buffer 객체 하나를 함께 쓴다
         * - Buffer는 상품을 한 개만 담을 수 있다. 생산자는 비어있을 때만 넣고, 소비자는 채워져 있을 때만 꺼낸다
         * - 조건이 맞지 않으면 wait()로 기다리고, 상대가 일을 마치면 notify()로 깨워준다
         */

        // 공유 자원 : 두 스레드에 같은 Buffer 객체를 넘겨야지 서로 주고 받을 수 있다
        Buffer buffer = new Buffer();

        Thread b1 = new Producer(buffer);
        Thread b2 = new Consumer(buffer);

        b1.start(); // producer 스레드 실행
        b2.start(); // consumer 스레드 실행


    }
}
