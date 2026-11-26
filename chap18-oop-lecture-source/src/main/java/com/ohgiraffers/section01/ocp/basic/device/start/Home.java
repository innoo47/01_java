package com.ohgiraffers.section01.ocp.basic.device.start;

import java.util.List;

public class Home {

    public void turnOffAll(List<Device> devices) {
        int count = 0;

        for(Device device : devices) {
            device.turnOff();
            count++;
        }

        System.out.println("꺼진 가전: " + count + "대");
    }

}
