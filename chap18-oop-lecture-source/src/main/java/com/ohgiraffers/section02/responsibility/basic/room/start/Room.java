package com.ohgiraffers.section02.responsibility.basic.room.start;

/*
 * 객실 하나를 나타내는 상위 클래스다.
 * 객실 번호와 1박 요금을 가지고, 묵는 날 수로 숙박 요금을 계산한다.
 * 하위 클래스는 이 필드와 메소드를 물려받는다.
 * */
public class Room {

    private String number;
    private int pricePerNight;

    public Room(String number, int pricePerNight) {
        this.number = number;
        this.pricePerNight = pricePerNight;
    }

    public String getNumber() {
        return number;
    }

    public String getType() {
        return "일반실";
    }

    // 묵는 날 수(nights)를 받아 숙박 요금을 돌려준다.
    public int priceFor(int nights) {
        return pricePerNight * nights;
    }
}