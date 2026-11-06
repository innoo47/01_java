package com.ogiraffers.section01.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application2 {
    public static void main(String[] args) {


        /* 스트림의 병렬 처리에 대해 이해할 수 있다 */
        List<String> list = new ArrayList<>(
                Arrays.asList("java", "mariadb", "css", "mybatis")
        );

        /* 모든 작업은 기본적으로 main스레드에서 일어난다 */
        System.out.println("향상된 for문(forEach) ========================");
        for(String str : list) {
            print(str);
        }
        //향상된 for문(forEach) ========================
        //java : main
        //mariadb : main
        //css : main
        //mybatis : main

        System.out.println("normal stream ===============================");
        list.stream().forEach(Application2::print);
        //normal stream ===============================
        //java : main
        //mariadb : main
        //css : main
        //mybatis : main

        /**
         * 병렬 스트림을 활용하면 처리해야 할 데이터 요소가 많을 경우
         * 효율적으로 처리할 수 있는 장점이 있다
         */
        System.out.println("parallel stream ==============================");
        list.parallelStream().forEach(Application2::print);
        list.parallelStream().forEach(Application2::print);
        //parallel stream ==============================
        //css : main
        //mybatis : main
        //mariadb : main
        //java : ForkJoinPool.commonPool-worker-1
        //css : main
        //java : ForkJoinPool.commonPool-worker-2
        //mybatis : main
        //mariadb : ForkJoinPool.commonPool-worker-1


    }

    private static void print(String str) {
        System.out.println(str + " : " + Thread.currentThread().getName());
    }
}
