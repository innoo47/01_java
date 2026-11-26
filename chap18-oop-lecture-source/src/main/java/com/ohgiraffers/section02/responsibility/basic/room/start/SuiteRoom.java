package com.ohgiraffers.section02.responsibility.basic.room.start;

/*
 * Room을 물려받은 스위트룸 클래스다.
 * 스위트룸은 1박마다 조식 요금(breakfast)이 더해진다.
 * */
public class SuiteRoom extends Room {

    private int breakfast;

    public SuiteRoom(String number, int pricePerNight, int breakfast) {
        super(number, pricePerNight);
        this.breakfast = breakfast;
    }

    @Override
    public String getType() {
        return "스위트룸";
    }

    // super.priceFor(nights)는 Room이 계산한 숙박 요금이다. 여기에 조식 요금을 더한다.
    @Override
    public int priceFor(int nights) {
        return super.priceFor(nights) + breakfast * nights;
    }
}