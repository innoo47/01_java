package com.ohgiraffers.section02.responsibility.basic.hotel.start;

/* 프런트 데스크다. 손님을 받아 방을 정해 주고 결과를 출력한다. */
public class FrontDesk {

    public void checkIn(Hotel hotel, String name) {

        // TODO 단계 3: 이 메소드의 본문을 hotel.checkIn(name)이 돌려준 방 번호로 출력하는 코드로 바꾼다
        int number = hotel.checkIn(name);
        if (number == 0) {
            System.out.println(name + " 체크인 : 빈 방 없음");
        } else {
            System.out.println(name + " 체크인 : " + number + "호");
        }
    }
}