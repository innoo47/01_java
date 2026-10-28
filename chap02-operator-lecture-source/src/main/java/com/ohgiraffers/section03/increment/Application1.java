package com.ohgiraffers.section03.increment;

public class Application1 {
    public static void main(String[] args) {

        int num = 20;
        System.out.println("num = " + num);

        num++;
        System.out.println("num = " + num);

        ++num;
        System.out.println("num = " + num);

        num--;
        System.out.println("num = " + num);

        --num;
        System.out.println("num = " + num);

        int firstNum = 20;
        int result1 = firstNum++ * 3;
        System.out.println("result1 = " + result1); // 60 다른 연산을 먼저 처리하고 난 뒤 마지막에 증가 처리가 된다
        System.out.println("firstNum = " + firstNum);   // 21

        int secondNum = 20;
        int result2 = ++secondNum * 3;
        System.out.println("result2 = " + result2); // 63 증가를 먼저 처리하고 난 뒤 다른 연산을 한다
        System.out.println("secondNum = " + secondNum); // 21

        int a = 3;
        int b = 5;
        int c = -1;
        int d = a + --b; // 7

        b = 2 * (-c + a++) - d; //
        c *= 2; //
        a = b++ + c;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        // -1 2 -2 7
    }
}
