package com.ohgiraffers.section01.ocp.example;

public class Application2 {
    public static void main(String[] args) {
        Member mem1 = new Member();
        mem1.name = "홍길동";
        mem1.count = 10;

        Member mem2 = new Member();
        mem2.name = "신사임당";
        mem2.count = 3;

        mem1.enter();
        mem2.enter();
    }
}
