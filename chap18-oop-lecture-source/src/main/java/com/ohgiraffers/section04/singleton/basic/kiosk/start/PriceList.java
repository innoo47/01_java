package com.ohgiraffers.section04.singleton.basic.kiosk.start;

/* 본사 가격표. 지금은 싱글톤이라 프로그램 전체에 하나뿐이다. */
public class PriceList {

    // TODO 단계 6: 쓰지 않게 된 instance 필드와 getInstance()를 지운다
//    private static PriceList instance = new PriceList(4500);

    private int americano;

    // TODO 단계 1: 지점마다 가격표를 만들 수 있게 생성자를 public으로 바꾼다
    public PriceList(int americano) {
        this.americano = americano;
    }

//    public static PriceList getInstance() {
//        return instance;
//    }

    public int americano() {
        return americano;
    }
}