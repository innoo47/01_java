package com.ohgiraffers.section04.singleton.example;

public class HolderSingleton {

    private HolderSingleton() {
    }

    /* Holder 클래스는 getInstance()를 처음 부를 때 준비된다. 클래스 준비는 JVM이 한 번만 한다. */
    private static class Holder {
        private static final HolderSingleton INSTANCE = new HolderSingleton();
    }

    public static HolderSingleton getInstance() {
        return Holder.INSTANCE;
    }
}