package com.ohgiraffers.section02.responsibility.basic.room.start;

public class FamilyRoom extends Room {

    private int extraBeds;

    public FamilyRoom(String number, int pricePerNight, int extraBeds) {
        super(number, pricePerNight);
        this.extraBeds = extraBeds;
    }

    @Override
    public String getType() {
        return "가족실";
    }

    @Override
    public int priceFor(int nights) {
        return super.priceFor(nights) + (extraBeds * 15000 * nights);
    }
}
