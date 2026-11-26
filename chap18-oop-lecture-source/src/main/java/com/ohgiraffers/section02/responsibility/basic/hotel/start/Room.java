package com.ohgiraffers.section02.responsibility.basic.hotel.start;

/* 호텔 방 하나다. 방 번호와 묵는 손님 이름을 안다. 손님 이름이 null이면 빈 방이다. */
public class Room {

    private int number;
    private String guest;

    public Room(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getGuest() {
        return guest;
    }

    // TODO 단계 4: 이제 쓰는 곳이 없는 setGuest를 지운다


    // TODO 단계 1: 빈 방이면 손님 이름 name을 넣고 true를, 아니면 false를 돌려주는 checkIn(String name) 메소드를 만든다
    public boolean checkIn(String name) {
        if(guest == null) {
            guest = name;
            return true;
        }
        return false;
    }
}