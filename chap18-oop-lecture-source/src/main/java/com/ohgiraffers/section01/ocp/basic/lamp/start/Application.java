package com.ohgiraffers.section01.ocp.basic.lamp.start;

public class Application {

    public static void main(String[] args) {

        /*
         * 전구 하나를 이름 변수와 밝기 변수 두 개로 다룬다.
         * 전구가 하나 늘 때마다 변수도 두 개씩 늘어난다.
         * */
        // TODO 단계 3: 안방 전구의 변수 두 개를 Lamp 객체 room 하나로 바꾼다
        Lamp room = new Lamp();
        room.name = "안방";
        room.turnOn(30);
        System.out.println(room.name + " 전구 밝기: " + room.brightness);

        // TODO 단계 4: 거실 전구의 변수 두 개를 Lamp 객체 living 하나로 바꾼다
        Lamp living = new Lamp();
        living.name = "거실";
        living.turnOn(70);
        System.out.println(living.name + " 전구 밝기: " + living.brightness);
    }
}