package com.ohgiraffers.section02.responsibility.basic.hotel.start;

import java.util.ArrayList;
import java.util.List;

/* 호텔이다. 방 목록을 가진다. */
public class Hotel {

    private List<Room> rooms = new ArrayList<>();

    public void addRoom(Room room) {
        rooms.add(room);
    }

    // TODO 단계 5: 이제 쓰는 곳이 없는 getRooms를 지운다


    // TODO 단계 2: 방마다 checkIn(name)을 보내 처음 성공한 방의 번호를, 빈 방이 없으면 0을 돌려주는 checkIn(String name) 메소드를 만든다
    public int checkIn(String name) {
        for (Room room : rooms) {
            if (room.checkIn(name)) {
                return room.getNumber();
            }
        }
        return 0;
    }
}