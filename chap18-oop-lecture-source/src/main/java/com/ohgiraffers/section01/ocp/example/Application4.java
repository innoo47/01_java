package com.ohgiraffers.section01.ocp.example;

public class Application4 {

    public static void main(String[] args) {

        /*
         * 캡슐화
         *     remaining 필드를 private으로 숨기면 바깥 코드는 use 메소드로만 횟수를 줄일 수 있다.
         *     프런트와 출입기 모두 같은 use를 부르므로 규칙이 두 곳에 똑같이 적용된다.
         *     아래 주석을 풀면 remaining has private access 컴파일 오류가 난다.
         *     확인했으면 다시 주석으로 되돌린다.
         * */
        Ticket ticket = new Ticket("홍길동", 1);
        ticket.use("프런트");
        ticket.use("출입기");
        // ticket.remaining = 100;

        System.out.println("남은 횟수: " + ticket.getRemaining());
    }
}