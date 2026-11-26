package com.ohgiraffers.section02.responsibility.basic.laundry.start;

public class Application {

    public static void main(String[] args) {

        Laundry laundry = new Laundry("김민지", 3);

        // TODO 단계 2: printScreen() 대신 값을 받아 화면 안내 두 줄을 여기서 출력한다
        System.out.println("세탁 접수: " + laundry.getCustomer() + " 셔츠 " + laundry.getShirts() + "벌");
        System.out.println("세탁 요금: " + laundry.fee() + "원");
        // TODO 단계 3: printMessage() 대신 값을 받아 문자 안내 한 줄을 여기서 출력한다
        System.out.println("[문자] " + laundry.getCustomer() + "님, 세탁 요금은 " + laundry.fee() + "원입니다.");
        // TODO 단계 5: 메일 안내 한 줄을 더한다
        System.out.println("[메일] " + laundry.getCustomer() + "님의 셔츠 " + laundry.getShirts() + "벌 세탁 요금 : " + laundry.fee() + "원");
    }
}