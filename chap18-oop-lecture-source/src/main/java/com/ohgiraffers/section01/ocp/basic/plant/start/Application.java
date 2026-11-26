package com.ohgiraffers.section01.ocp.basic.plant.start;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        /* count는 물을 준 화분 수를 센다. */
        int count = 0;

        // TODO 단계 4: 두 목록을 List<Plant> 하나로, 두 반복문을 반복문 하나로 바꾼다

        List<Plant> plants = new ArrayList<>();
        plants.add(new Rose("창가"));
        plants.add(new Rose("베란다"));
        plants.add(new Cactus("책상"));

        for (Plant plant : plants) {
            plant.water();
            count++;
        }
        System.out.println("물 준 화분: " + count + "개");
    }
}