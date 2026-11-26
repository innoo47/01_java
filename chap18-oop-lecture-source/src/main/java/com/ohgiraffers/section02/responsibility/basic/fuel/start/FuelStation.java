package com.ohgiraffers.section02.responsibility.basic.fuel.start;

/* 주유소다. 차에 기름을 넣고 넣은 양만큼 요금을 받는다. 1L에 1700원이다. */
public class FuelStation {

    public void fill(Car car, int liters) {

        // TODO 단계 2: 아래 여섯 줄을 int filled = car.refuel(liters); 한 줄로 바꾼다
        int filled = car.refuel(liters);

        int price = filled * 1700;
        System.out.println(car.getName() + ": " + filled + "L 주유, 요금 " + price + "원, 연료 " + car.getFuel() + "L");
    }
}