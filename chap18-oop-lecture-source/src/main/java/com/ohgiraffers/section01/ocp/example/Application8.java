package com.ohgiraffers.section01.ocp.example;

import java.util.ArrayList;
import java.util.List;

public class Application8 {

    public static void main(String[] args) {

        /*
         * 개방-폐쇄 원칙(OCP, Open-Closed Principle)
         *     소프트웨어 구성 요소는 확장에는 열려 있고 변경에는 닫혀 있어야 한다.
         *     메뉴마다 다른 가격을 Beverage 인터페이스 뒤로 숨긴다.
         *     Cashier와 Beverage에는 메뉴 클래스 이름이 없다.
         *     실행 클래스는 객체를 만들어 목록에 넣는 일을 맡는다.
         * */
        List<Beverage> beverages = new ArrayList<>();
        beverages.add(new Americano());
        beverages.add(new Latte());

        Cashier cashier = new Cashier();
        for (Beverage beverage : beverages) {
            System.out.println(beverage.getName() + " 가격: " + beverage.getPrice());
        }
        System.out.println("주문 합계: " + cashier.total(beverages));
    }
}