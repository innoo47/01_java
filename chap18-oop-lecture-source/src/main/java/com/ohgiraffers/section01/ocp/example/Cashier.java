package com.ohgiraffers.section01.ocp.example;

import java.util.List;

/*
 * 주문 합계를 계산하는 클래스다.
 * 음료를 Beverage로만 적었으므로 이 파일에는 메뉴 클래스 이름이 없다.
 * */
public class Cashier {

    /* 어떤 음료가 들어와도 Beverage의 getPrice()만 부른다. */
    public int total(List<Beverage> beverages) {

        int total = 0;
        for (Beverage beverage : beverages) {
            total = total + beverage.getPrice();
        }
        return total;
    }
}