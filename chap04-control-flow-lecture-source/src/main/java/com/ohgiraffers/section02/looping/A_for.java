package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class A_for {

    public void testSimpleForStatement() {
        for (int i = 1; i <= 10; i++) {
            // 조건식이 비어있으면 무한히 반복 -> 'break'라는 키워드로 탈출
            System.out.println(i);
        }
    }

    public void test1() {
        Scanner sc = new Scanner(System.in);
//
//        System.out.print("1 번째 학생의 이름을 입력해주세요 : ");
//        String student1 = sc.nextLine();
//        System.out.println("1 번째 학생의 이름은 " + student1 + "입니다.");
//
//        System.out.print("2 번째 학생의 이름을 입력해주세요 : ");
//        String student2 = sc.nextLine();
//        System.out.println("2 번째 학생의 이름은 " + student2 + "입니다.");
//
//        System.out.print("3 번째 학생의 이름을 입력해주세요 : ");
//        String student3 = sc.nextLine();
//        System.out.println("3 번째 학생의 이름은 " + student3 + "입니다.");
//
//        System.out.print("4 번째 학생의 이름을 입력해주세요 : ");
//        String student4 = sc.nextLine();
//        System.out.println("4 번째 학생의 이름은 " + student4 + "입니다.");
//
//        System.out.print("5 번째 학생의 이름을 입력해주세요 : ");
//        String student5 = sc.nextLine();
//        System.out.println("5 번째 학생의 이름은 " + student5 + "입니다.");
//
//        System.out.print("6 번째 학생의 이름을 입력해주세요 : ");
//        String student6 = sc.nextLine();
//        System.out.println("6 번째 학생의 이름은 " + student6 + "입니다.");
//
//        System.out.print("7 번째 학생의 이름을 입력해주세요 : ");
//        String student7 = sc.nextLine();
//        System.out.println("7 번째 학생의 이름은 " + student7 + "입니다.");
//
//        System.out.print("8 번째 학생의 이름을 입력해주세요 : ");
//        String student8 = sc.nextLine();
//        System.out.println("8 번째 학생의 이름은 " + student8 + "입니다.");
//
//        System.out.print("9 번째 학생의 이름을 입력해주세요 : ");
//        String student9 = sc.nextLine();
//        System.out.println("9 번째 학생의 이름은 " + student9 + "입니다.");
//
//        System.out.print("10 번째 학생의 이름을 입력해주세요 : ");
//        String student10 = sc.nextLine();
//        System.out.println("10 번째 학생의 이름은 " + student10 + "입니다.");
//
//        System.out.println("10명의 학생 이름을 입력 받고 출력하는 기능을 완료했습니다!");

        /*
        반복 횟수 : 10
        시작 값 : 1
        반복할 내용 :  이름 입력 문구, 입력받기, n번째 학생의 이름을 출력
         */

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " 번째 학생의 이름을 입력해주세요 : ");
            String student = sc.nextLine();
            System.out.println(i + " 번째 학생의 이름은 " + student + "입니다.");
        }

        System.out.println("10명의 학생 이름을 입력 받고 출력하는 기능을 완료했습니다!");
    }

    public void test2() {

        /*
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int num4 = 4;
        int num5 = 5;
        int num6 = 6;
        int num7 = 7;
        int num8 = 8;
        int num9 = 9;
        int num10 = 10;

        int sum = 0;

        sum += num1;
        sum += num2;
        sum += num3;
        sum += num4;
        sum += num5;
        sum += num6;
        sum += num7;
        sum += num8;
        sum += num9;
        sum += num10;

        System.out.println("sum = " + sum);
        */

        /*
        반복할 횟수 : 10
        시작값 : 1
        반복할 내용 : 변수에 1씩 증가하는 값을 담기, sum에 추가
         */

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);

    }

    public void test3() {
        /*
        5부터 10사이의 난수를 발생시켜서 ==> Math, Random
        1부터 발생한 난수까지의 합계를 구해보자
         */


    }

}
