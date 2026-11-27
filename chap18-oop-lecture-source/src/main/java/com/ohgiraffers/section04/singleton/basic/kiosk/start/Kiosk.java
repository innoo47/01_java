package com.ohgiraffers.section04.singleton.basic.kiosk.start;

public class Kiosk {

    private String store;

    // TODO 단계 2: PriceList 필드 priceList와, 지점 이름과 가격표를 함께 받는 생성자 Kiosk(String store, PriceList priceList)를 더 만든다
    private PriceList priceList;

    public Kiosk(String store, PriceList priceList) {
        this.store = store;
        this.priceList = priceList;
    }

    // TODO 단계 5: 쓰지 않게 된 이 생성자를 지운다


    public String order(int cups) {
        // TODO 단계 4: PriceList.getInstance()를 필드 priceList로 바꾼다
        int price = priceList.americano() * cups;
        return store + " 아메리카노 " + cups + "잔: " + price + "원";
    }
}