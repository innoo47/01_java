package com.ohgiraffers.section04.singleton.example;

public class LazySingleton {

    private static int createCount = 0;
    private static LazySingleton instance;

    /* 객체를 만드는 데 시간이 걸린다고 가정하고 10ms 기다린다. */
    private LazySingleton() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        createCount++;
    }

    /* getInstance()를 처음 부를 때 객체를 만든다. 여러 스레드가 동시에 부르는 경우를 막지 않았다. */
    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    public static int getCreateCount() {
        return createCount;
    }
}