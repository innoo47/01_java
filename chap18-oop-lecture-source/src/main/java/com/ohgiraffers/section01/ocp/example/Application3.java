package com.ohgiraffers.section01.ocp.example;

public class Application3 {
    public static void main(String[] args) {

        /* 필드가 열려 있을 때 생기는 문제점 */
        Member member = new Member();
        member.name = "홍길동";
        member.count = 1;

        frontDesk(member);
        kiosk(member);

    }

    private static void frontDesk(Member member) {

        if (member.count <= 0) {
            System.out.println(member.name + " 입장 불가 : 남은 횟수 없음");
            return;
        }

        member.count = member.count - 1;
        System.out.println(member.name + " 프런트 입장, 남은 횟수 : " + member.count);
    }

    public static void kiosk(Member member) {
        member.count = member.count - 1;
        System.out.println(member.name + " 출입기 입장, 남은 횟수 : " + member.count);
    }
}
