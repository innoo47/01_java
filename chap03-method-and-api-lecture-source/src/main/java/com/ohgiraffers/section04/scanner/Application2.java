package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        /* Scanner 유의 사항 */
        Scanner sc = new Scanner(System.in);

        /* 1. 개행 문자를 남기는 메소드 뒤에 nextLine()이 오면 개행 문자를 읽고 넘어가버리는 문제가 발생 */
//        System.out.print("숫자 입력 : ");
//        int num = sc.nextInt();
//        System.out.println("num = " + num);
//
//        sc.nextLine(); // nextInt()가 읽어가지 않은 개행 문자를 입력 버퍼에서 읽어서 버린다
//
//        System.out.print("문자열 입력 : ");
//        String str = sc.next();
//        System.out.println("str = " + str);

//        System.out.print("문자열 입력 : ");
//        String str2 = sc.nextLine();
//        System.out.println("str2 = " + str2);

        /* 2. next메소드로 읽어왔지만 "공백"을 포함한 문자열이여서 입력버퍼에 남아있게 되면
            이후에 메소드의 타입이 맍지 않아 "java.util.InputMismatchException"이 발생
         */
        System.out.print("문자열 입력 : ");
        String str2 = sc.next(); // 공백 포함이 예상되는 문자열은 nextLine()으로 입력받기
        System.out.println("str2 = " + str2);

        sc.nextLine(); // 버퍼의 공간을 비우는것

        System.out.print("숫자 입력 : ");
        int num2 = sc.nextInt();
        System.out.println("num2 = " + num2);

    }
}
