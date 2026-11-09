package com.ohgiraffers.section01.thread;

public class Car extends Thread {

    @Override
    public void run() {
        for (int i = 1; i < 1000; i++) {

            System.out.println("Car Driving");

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
