package com.ohgiraffers.section04.singleton.example;

/* 스레드 하나가 할 일: getInstance()를 한 번 부른다. */
public class CreateTask implements Runnable {

    @Override
    public void run() {
        LazySingleton.getInstance();
    }
}