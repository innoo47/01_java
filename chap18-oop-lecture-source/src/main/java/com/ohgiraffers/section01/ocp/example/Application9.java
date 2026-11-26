package com.ohgiraffers.section01.ocp.example;

import java.util.ArrayList;
import java.util.List;

public class Application9 {

    public static void main(String[] args) {

        /*
         * 새 메뉴 녹차는 GreenTea 클래스를 추가해서 만들었다.
         * Cashier와 다른 음료 클래스는 한 줄도 고치지 않았다.
         * 이것이 변경에 닫혀 있다는 뜻이다.
         * 실행 클래스에서는 녹차 객체를 목록에 넣는 한 줄이 늘었다.
         * 실행 클래스는 객체를 만들어 목록에 넣는 곳이기 때문이다.
         * */
        List<Beverage> beverages = new ArrayList<>();
        beverages.add(new Americano());
        beverages.add(new Latte());
        beverages.add(new GreenTea());

        Cashier cashier = new Cashier();
        for (Beverage beverage : beverages) {
            System.out.println(beverage.getName() + " 가격: " + beverage.getPrice());
        }
        System.out.println("주문 합계: " + cashier.total(beverages));
    }
}