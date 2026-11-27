package com.ohgiraffers.section04.singleton.example;

public class Application5 {

    public static void main(String[] args) {

        /*
         * 생성자로 넘기기
         *     카운터를 만들어 Screen의 생성자로 넘긴다. 화면마다 다른 카운터를 넘길 수 있다.
         *     어느 화면이 어느 카운터를 쓰는지 이 main 한 곳에서 보인다.
         * */
        Counter counterA = new Counter();
        Counter counterB = new Counter();
        Screen screenA = new Screen(counterA);
        Screen screenB = new Screen(counterB);

        screenA.click();
        screenA.click();
        screenB.click();

        System.out.println("A 카운터: " + counterA.getCount());
        System.out.println("B 카운터: " + counterB.getCount());
    }
}