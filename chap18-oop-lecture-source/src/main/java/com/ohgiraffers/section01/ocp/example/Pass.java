package com.ohgiraffers.section01.ocp.example;

/*
 * 회원권이 반드시 가져야 할 메소드를 정한 인터페이스다.
 * 출입기가 회원권에게 바라는 일은 「들여보내 달라」 하나뿐이다.
 * 어떻게 들여보낼지는 정하지 않는다. 그 내용은 구현 클래스가 적는다.
 * */
public interface Pass {

    // 본문 없이 이름과 모양만 적고 ;로 끝낸다.
    // 인터페이스의 메소드는 public을 적지 않아도 저절로 public이다.
    boolean use(String where);
}