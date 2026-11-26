package com.ohgiraffers.section01.ocp.example;

/*
 * implements Pass는 Pass의 메소드를 이 클래스가 모두 만든다는 선언이다.
 * 이렇게 만드는 것을 구현이라고 하고, 빠뜨리면 컴파일되지 않는다.
 * 내용은 3절의 Ticket과 같은 횟수 회원권이다.
 * */
public class CountPass implements Pass {

    private String owner;
    private int remaining;

    public CountPass(String owner, int remaining) {
        this.owner = owner;
        this.remaining = remaining;
    }

    // Pass가 정한 이름과 모양 그대로 만들고, 내용은 횟수 회원권에 맞게 적는다.
    public boolean use(String where) {

        if (remaining <= 0) {
            System.out.println(owner + " 입장 불가: 남은 횟수 없음");
            return false;
        }
        remaining = remaining - 1;
        System.out.println(owner + " " + where + " 입장, 남은 횟수: " + remaining);
        return true;
    }
}