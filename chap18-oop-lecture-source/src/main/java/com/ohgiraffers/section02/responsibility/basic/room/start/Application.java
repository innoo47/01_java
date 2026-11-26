package com.ohgiraffers.section02.responsibility.basic.room.start;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        /*
         * SuiteRoom도 Room의 한 종류이므로 List<Room>에 함께 담는다.
         * 반복문은 객체마다 다시 정의한 getType()과 priceFor()를 부른다.
         * */
        List<Room> rooms = new ArrayList<>();
        rooms.add(new Room("101호", 80000));
        rooms.add(new SuiteRoom("901호", 200000, 20000));
        // TODO 단계 4: 가족실 객체를 목록에 넣는다
        rooms.add(new FamilyRoom("501호", 120000, 2));

        int nights = 2;
        for (Room room : rooms) {
            System.out.println(room.getType() + " " + room.getNumber() + " " + nights + "박: " + room.priceFor(nights));
        }
    }
}