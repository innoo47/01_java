package com.ohgiraffers.section01.ocp.example;

public class Application7 {

    public static void main(String[] args) {

        /*
         * 변경에 닫혀 있지 않은 코드
         *     주문을 메뉴 이름 글자로 적은 배열로 둔다.
         *     같은 이름이 두 번 있으면 두 잔이다.
         *     메뉴마다 priceOf에 이름을 넘겨 가격을 받고, 합계에 더한다.
         * */
        String[] menus = {"아메리카노", "카페라테", "아메리카노"};

        int total = 0;
        for (String menu : menus) {
            total = total + priceOf(menu);
        }
        System.out.println("주문 합계: " + total);
    }

    /*
     * 메뉴 이름을 글자로 비교해 가격을 찾는 메소드다.
     * static이 붙어서 객체를 만들지 않고 main에서 바로 부를 수 있다.
     * */
    public static int priceOf(String menu) {

        if (menu.equals("아메리카노")) {
            return 4500;
        } else if (menu.equals("카페라테")) {
            return 5000;
        }
        return 0;
    }
}