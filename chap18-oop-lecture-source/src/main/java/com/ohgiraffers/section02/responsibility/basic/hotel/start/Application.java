package com.ohgiraffers.section02.responsibility.basic.hotel.start;

public class Application {

    public static void main(String[] args) {

        /* 방이 두 개인 호텔에 손님 세 명이 차례로 체크인한다. */
        Hotel hotel = new Hotel();
        hotel.addRoom(new Room(101));
        hotel.addRoom(new Room(102));

        FrontDesk desk = new FrontDesk();
        desk.checkIn(hotel, "김하늘");
        desk.checkIn(hotel, "이바다");
        desk.checkIn(hotel, "박구름");
    }
}