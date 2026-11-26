package com.ohgiraffers.section02.responsibility.basic.fuel.start;

/* 자동차 한 대다. 이름, 지금 연료량, 연료통 크기를 안다. 단위는 리터(L)다. */
public class Car {

    private String name;
    private int fuel;
    private int capacity;

    public Car(String name, int fuel, int capacity) {
        this.name = name;
        this.fuel = fuel;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getFuel() {
        return fuel;
    }

    public int getCapacity() {
        return capacity;
    }

    // TODO 단계 3: 이제 쓰는 곳이 없는 setFuel을 지운다


    // TODO 단계 1: 연료통이 넘치지 않게 liters만큼 채우고, 실제로 넣은 양을 돌려주는 refuel(int liters) 메소드를 만든다
    public int refuel(int liters) {
        int filled = liters;
        int space = getCapacity() - getFuel();
        if (filled > space) {
            filled = space;
        }
        fuel = fuel + filled;
        return filled;
    }
}