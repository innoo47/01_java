package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class D_switch {
    public void testSimpleSwitchStatement() {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수 : ");
        int first = sc.nextInt();
        System.out.print("두 번째 정수 : ");
        int second = sc.nextInt();
        System.out.print("연산 기호 입력(+, -, *, x, /, %) : ");
        char op = sc.next().charAt(0);

        int result = 0;
        switch (op) {
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '*':
            case 'x':
                result = first * second;
                break;
            case '/':
                result = first / second;
                break;
            case '%':
                result = first % second;
                break;
            default: /* case문에서 일치하는 값을 찾지 못할 경우 수핼할 구문을 작성 할 수 있다 */
                System.out.println("입력하신 기호는 찾지 못했습니다");
        }

        System.out.println(first + " " + op + " " + second + " = " + result);

    }

    // 추가적인 switch문에 대한 문법
    // java 14부터 적용된 switch문 사용 방법
    public void improveSwitchStatement() {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수 : ");
        int first = sc.nextInt();
        System.out.print("두 번째 정수 : ");
        int second = sc.nextInt();
        System.out.print("연산 기호 입력(+, -, *, x, /, %) : ");
        char op = sc.next().charAt(0);

        /**
         * 2개 이상의 명령문을 작성해야 하는 경우 {}을 생략하지 못하고 작성해야한다
         * 반환 값을 yield라는 명령문을 작성하여 명시적으로 return한다
         */
        int result = switch(op) {
            case '+' -> {
                System.out.println("더하기 연산자 실행");
                yield  first + second;
            }
            case '-' -> first - second;
            case '*', 'x' -> first * second;
            case '/' -> first / second;
            case '%'-> first % second;
            default -> 0;
        };

        System.out.println(first + " " + op + " " + second + " = " + result);
    }
}
