package com.ohgiraffers.section01.ocp.example;

public class Member {

    /* 헬스장 회원 한명을 나타내는 클래스
     *
     *  회원이 가진 값(이름, 남은횟수)과 회원이 하는 일(입장)
     * */

    String name;
    int count;

    public void enter() {
        count = count - 1;
        System.out.println(name + "입장, 남은횟수 : " + count);
    }




}
