package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class C_while {
    public void testSimplewhileStatement() {
        // for문
        // 0부터 9까지 출력
        for (int i = 0; i < 10; i++) {
            System.out.println("출력 : " + i);
        }

        // while문
        int i = 0;  // 초기식

        while (i < 10) {    // 조건식
            System.out.println("출력 : " + i);
            i++;    // 증감식
        }
    }

    public void testWhileExample() {
        // 반복 횟수가 정해지지 않는 상태일 때 while 사용
        /*
        키보드로 문자열을 입력 받고 반복적으로 출력한다.
        단, "exit"가 입력되면 반복 종료한다.
         */

        Scanner sc = new Scanner(System.in);
        String input = "";

        // 문자열의 동등비교는 '=='로 안되고 문자열.equals(대상문자열)로 한다
        while (!input.equals("exit")) {
            System.out.print("문자열 입력 : ");
            input = sc.nextLine();
            System.out.println("입력받은 값 : " + input);
        }

//        while (true) {
//
//            System.out.print("문자열 입력 : ");
//            input = sc.nextLine();
//            System.out.println("입력받은 값 : " + input);
//            if (input.equals("exit")) {
//                break;
//            }
//        }

    }

    public void testSimpleDoWhileStatement() {

        do {
            System.out.println("조건식의 값이 false여도 최초 한번은 무조건 동작");
        } while (false);
    }


}
