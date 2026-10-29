package com.ohgiraffers.section08.object_array;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {

        /**
         * 배열의 선언
         * 자료형[] 변수명 = new 자료형[방의크기];
         * Car[] carr = new Car[4];
         */
        Car car1 = new Car("페라리", 300);
        Car car2 = new Car("람보르기니", 510);
        Car car3 = new Car("롤스로이스", 250);
        Car car4 = new Car("부가티", 400);
        Car car5 = new Car("포터", 500);

        car1.driveMaxSpeed();
        car2.driveMaxSpeed();
        car3.driveMaxSpeed();
        car4.driveMaxSpeed();
        car5.driveMaxSpeed();
        //페라리 차량이 최고 시속 300(km/h)로 달립니다
        //람보르기니 차량이 최고 시속 510(km/h)로 달립니다
        //롤스로이스 차량이 최고 시속 250(km/h)로 달립니다
        //부가티 차량이 최고 시속 400(km/h)로 달립니다
        //포터 차량이 최고 시속 500(km/h)로 달립니다

        Car[] carArr = new Car[5];  // 객체 배열 선언
        System.out.println(Arrays.toString(carArr));
        //[null, null, null, null, null]

        carArr[0] = car1;
        carArr[1] = car2;
        carArr[2] = car3;
        carArr[3] = car4;
        carArr[4] = car5;
        System.out.println(Arrays.toString(carArr));
        //[com.ohgiraffers.section08.object_array.Car@3d494fbf, ...]
        //주소값으로 나옴

        Car[] carArr2 = {car1, car2, car3, car4, car5};
        System.out.println(Arrays.toString(carArr2));
        //[com.ohgiraffers.section08.object_array.Car@3d494fbf, ...]
        //주소값으로 나옴

        // 향상된 for문
        for (Car car : carArr2) {
            System.out.println(car);
        }

    }
}
