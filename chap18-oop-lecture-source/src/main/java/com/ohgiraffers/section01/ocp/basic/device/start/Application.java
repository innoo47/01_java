package com.ohgiraffers.section01.ocp.basic.device.start;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        /* 실행 클래스는 어떤 가전을 쓸지 정한다. */

        // TODO 단계 4: 가전을 List<Device>에 담고, Home의 turnOffAll로 한 번에 끈다

        List<Device> devices = new ArrayList<>();
        devices.add(new Tv());
        devices.add(new AirConditioner());
        devices.add(new Light());

        Home home = new Home();
        home.turnOffAll(devices);
    }
}