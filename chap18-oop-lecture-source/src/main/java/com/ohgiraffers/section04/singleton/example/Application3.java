package com.ohgiraffers.section04.singleton.example;

public class Application3 {

    public static void main(String[] args) throws InterruptedException {

        /*
         * 지연 초기화와 스레드
         *     스레드 10개가 getInstance()를 동시에 처음 부르면 둘 이상이 instance == null을 보고
         *     각자 객체를 만들 수 있다. 실행할 때마다 생성 횟수가 다를 수 있다.
         * */
        Thread[] threads = new Thread[10];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new CreateTask());
            threads[i].start();
        }
        for (int i = 0; i < threads.length; i++) {
            threads[i].join();
        }

        System.out.println("생성 횟수: " + LazySingleton.getCreateCount());
    }
}