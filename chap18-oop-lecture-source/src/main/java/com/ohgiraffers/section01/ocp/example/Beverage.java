package com.ohgiraffers.section01.ocp.example;

/*
 * 메뉴마다 달라지는 두 가지(이름, 가격)를 정한 인터페이스다.
 * 합계를 계산하는 코드는 이 인터페이스의 메소드만 부르므로
 * 실제로 어떤 메뉴가 들어왔는지 몰라도 된다.
 * */
public interface Beverage {

    // 음료 이름을 돌려준다. 어떤 글자를 돌려줄지는 구현 클래스가 정한다.
    String getName();

    // 음료 가격을 돌려준다. 가격도 구현 클래스가 정한다.
    int getPrice();
}