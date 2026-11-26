package com.ohgiraffers.section02.responsibility.basic.fuel.start;

public class Application {

    public static void main(String[] args) {

        /* 1번 차는 연료통에 10L만 남아 있어서, 30L를 넣어 달라고 해도 10L만 들어간다. */
        FuelStation station = new FuelStation();

        station.fill(new Car("1번 차", 40, 50), 30);
        station.fill(new Car("2번 차", 20, 60), 25);
    }
}