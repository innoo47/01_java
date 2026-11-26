package com.ohgiraffers.section01.ocp.example;

/*
 * 횟수 회원권 하나를 나타내는 클래스다. 남은 횟수를 바깥 코드가 바로 고치지 못하게 숨긴다.
 * 남은 횟수를 줄이는 코드를 use 메소드 하나로 모으는 것이 캡슐화다.
 * 「남은 횟수가 0이면 들어올 수 없다」는 규칙도 이 메소드 한 곳에만 적으면 된다.
 * */
public class Ticket {

    // private은 같은 클래스 안의 코드만 이 필드를 읽고 쓸 수 있다는 뜻이다.
    private String owner;
    private int remaining;

    /* 회원권을 만들 때 주인 이름과 처음 횟수를 받는다. 이후로는 use만 횟수를 바꾼다. */
    public Ticket(String owner, int remaining) {
        this.owner = owner;
        this.remaining = remaining;
    }

    /*
     * 바깥 코드가 횟수를 줄이는 유일한 방법이다.
     * 들어올 수 있으면 횟수를 1 줄이고 true를, 들어올 수 없으면 횟수를 그대로 두고 false를 돌려준다.
     * where에는 「프런트」, 「출입기」처럼 들어온 곳의 이름을 받는다.
     * */
    public boolean use(String where) {

        if (remaining <= 0) {
            System.out.println(owner + " 입장 불가: 남은 횟수 없음");
            return false;
        }
        remaining = remaining - 1;
        System.out.println(owner + " " + where + " 입장, 남은 횟수: " + remaining);
        return true;
    }

    // 필드가 private이라 바깥 코드는 남은 횟수를 바로 읽지 못한다.
    // 그래서 값을 돌려주는 메소드를 연다. 이 메소드는 횟수를 바꾸지 않는다.
    public int getRemaining() {
        return remaining;
    }
}