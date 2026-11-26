package com.ohgiraffers.section02.responsibility.example;

/* 수업용으로 흉내 낸 아주 작은 프레임워크다. 실제 프레임워크가 아니다. */
public class ShopContainer {

    private static boolean running = false;

    public static void start() {
        running = true;
        System.out.println("[ShopContainer] 시작");
    }

    public static boolean isRunning() {
        return running;
    }
}