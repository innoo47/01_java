package com.ohgiraffers.section03.math;

import java.util.Random;

public class Application2 {
    public static void main(String[] args) {
        // Random() -> 0.0 >= 값 < 1.0 실수값을 리턴
        // (int) (Math.random() * 구하려는 난수의 개수) + 구하려는 난수의 최소값

        // 0~9까지의 난수를 생성
        // 0.0 * 10 >=  < 1.0 * 10
        // 0.0              10.0  >>> 0.0 ~ 9.9999..
        // (int) >>> 0 ~ 10

        int randomNumber1 = (int) (Math.random() * 10);
        System.out.println("randomNumber1 = " + randomNumber1);


        // 1~10 까지의 난수 생성
        // 1 >= 값 < 11
        int randomNumber2 = (int) (Math.random() * 10) + 1;
        System.out.println("randomNumber2 = " + randomNumber2);
        
        // 10~15 까지의 난수 생성
        int randomNumber3 = (int) (Math.random() * 6) + 10;
        System.out.println("randomNumber3 = " + randomNumber3);

        Random random = new Random();
        /* 0부터 9까지의 난수 발생 */
        int randomNumber5 = random.nextInt(10);
        System.out.println("randomNumber5 = " + randomNumber5);
        /* 20부터 45까지릐 난수 발생 */
        int randomNumber6 = random.nextInt(26) + 20;
        System.out.println("randomNumber6 = " + randomNumber6);

        /* -128부터 127까지의 난수 발생 */
        int randomNumber7 = random.nextInt(256) - 128;
        System.out.println("randomNumber7 = " + randomNumber7);


    }
}
