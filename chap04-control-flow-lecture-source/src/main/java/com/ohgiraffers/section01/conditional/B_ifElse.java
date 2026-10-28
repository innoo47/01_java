package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class B_ifElse {
    public void testSimpleIfElseStatement() {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 하나 입력 : ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }
    }

    public void testNestedIfElseStatement() {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 하나 입력 : ");
        int num = sc.nextInt();

        if (num > 0) {
            if (num % 2 == 0) {
                System.out.println("짝수");
            } else {
                System.out.println("홀수");
            }
        } else {
            System.out.println("음수");
        }
    }
}
