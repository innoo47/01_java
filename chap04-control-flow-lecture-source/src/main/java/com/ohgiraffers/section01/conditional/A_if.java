package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class A_if {
    // 기능형 클래스 (A_if 클래스 이름은 교육용으로 사용한거라 이렇게 쓰면 안됨)

    public void testSimpleIfStatement() {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 하나 입력 : ");

        int num = sc.nextInt();

        //홀수인지 짝수인지에 따라서 프로그램을 조절
        if (num % 2 == 0) { // 조건식 --> 입력한 값이 짝수이면 실행
            System.out.println("짝수");
        }

        System.out.println("프로그램 종료");
    }

    public void testNestedIfStatement() {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 하나 입력 : ");
        int num = sc.nextInt();

        // 짝수인지 홀수인지, 음수인지 양수인지 체크
        if (num > 0) {
            if (num % 2 == 0) {
                System.out.println("양수이면서 짝수이다");
            }
        }

        System.out.println("프로그램 종료");
    }
}
