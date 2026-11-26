package com.ohgiraffers.section01.ocp.example;

import java.util.ArrayList;
import java.util.List;

public class Application6 {

    public static void main(String[] args) {

        /*
         * 인터페이스와 다형성
         *     Pass 인터페이스는 회원권이 반드시 가져야 할 메소드(use)만 정한다.
         *     CountPass와 MonthPass는 같은 메소드를 각자 다르게 구현한다.
         *     Pass 타입 변수 하나로 어느 회원권이든 같은 방법으로 부를 수 있는 것을
         *     다형성이라고 한다.
         *     목록 하나와 반복문 하나로 두 종류의 회원권을 모두 들여보낸다.
         * */
        List<Pass> passes = new ArrayList<>();
        passes.add(new CountPass("홍길동", 10));
        passes.add(new CountPass("신사임당", 3));
        passes.add(new MonthPass("강감찬"));

        for (Pass pass : passes) {
            pass.use("출입기");
        }
    }
}