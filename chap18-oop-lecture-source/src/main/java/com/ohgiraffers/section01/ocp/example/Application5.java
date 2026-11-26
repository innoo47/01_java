package com.ohgiraffers.section01.ocp.example;

import java.util.ArrayList;
import java.util.List;

public class Application5 {

    public static void main(String[] args) {

        /*
         * 실제 클래스에 직접 의존하는 코드
         *     출입기는 오늘 온 회원의 회원권을 목록에 담아 차례로 들여보낸다.
         *     List<Ticket>에는 Ticket 객체만 담을 수 있으므로
         *     월 회원권을 받으려면 목록과 반복문을 하나 더 만들어야 한다.
         * */
        List<Ticket> tickets = new ArrayList<>();
        tickets.add(new Ticket("홍길동", 10));
        tickets.add(new Ticket("신사임당", 3));

        List<MonthTicket> monthTickets = new ArrayList<>();
        monthTickets.add(new MonthTicket("강감찬"));

        for (Ticket ticket : tickets) {
            ticket.use("출입기");
        }
        for (MonthTicket monthTicket : monthTickets) {
            monthTicket.use("출입기");
        }
    }
}