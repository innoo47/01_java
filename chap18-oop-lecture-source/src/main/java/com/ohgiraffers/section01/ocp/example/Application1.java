package com.ohgiraffers.section01.ocp.example;

public class Application1 {
    public static void main(String[] args) {

        /* 변수만으로 회원 두명을 다루는 코드 작성 */
        String name1 = "홍길동";
        int count1 = 10;

        String name2 = "신사임당";
        int count2 = 3;

        count1 = count1 - 1;
        System.out.println(name1 + " 입장, 남은 횟수 : " + count1);

        count2 = count2 - 1;
        System.out.println(name2 + " 입장, 남은 횟수 : " + count2);
    }
}
