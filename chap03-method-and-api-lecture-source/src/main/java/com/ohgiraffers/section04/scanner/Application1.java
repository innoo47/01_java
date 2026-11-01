package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        // 1. Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        // 정수값 받기
        // nextInt() : 입력받은 값을 int형으로 반환한다
//        System.out.print("나이를 입력하세요 : ");
//        int age = sc.nextInt();
//        System.out.println("age = " + age);

        // 실수값 받기
        // nextDouble() : 입력받은 값을 double형으로 반환
//        System.out.print("키를 입력하세요 : ");
//        double height = sc.nextDouble();
//        System.out.println("height = " + height);

        // 논리형 입력 받기
        // nextBoolean() : 입력한 값을 boolean(true/false)형으로 반환
//        System.out.print("true or false : ");
//        boolean isTrue = sc.nextBoolean();
//        System.out.println("isTrue = " + isTrue);

        // 문자열 입력 받기
        // next() : 공백 또는 개행문자까지
//        System.out.print("이름을 입력하세요 : ");
//        String name = sc.next();
//        System.out.println("name = " + name); // 공백이 있으면 끊어버림
//        String name2 = sc.next();
//        System.out.println("name2 = " + name2); // 공백을 기준으로 끊어서 가져옴 박 인호

        // nextLine() : 개행문자까지 다 가져온다. 공백 포함
        System.out.print("주소를 입력하세요 : ");
        String address = sc.nextLine();
        System.out.println("address = " + address);

        // 문자 입력
        // Scanner에서 제공하지 않는다
        // String에서 제공하는 charAt(index) 메소드를 통해 문자를 분리해서 활용할 수 있다.
        System.out.print("아무 문자나 입력 : ");
        


    }
}
