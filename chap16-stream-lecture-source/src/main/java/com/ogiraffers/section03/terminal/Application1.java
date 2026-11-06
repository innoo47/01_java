package com.ogiraffers.section03.terminal;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Application1 {
    public static void main(String[] args) {

        // 1, 2, 3, 4, 5, 6, 7, 8, 9
        long count = IntStream.range(1, 10).count();
        System.out.println(count);
        //9

        long sum = IntStream.range(1, 10).sum();
        System.out.println(sum);
        //45

        /**
         * OptionalInt : 결과 없음을 나타내는 명확한 요구가 있는 메소드의 반환 형식으로 사용
         */
        OptionalInt max = IntStream.range(1, 10).max();
        System.out.println("max: " + max);
        //max: OptionalInt[9]

        OptionalInt min = IntStream.range(1, 10).min();
        System.out.println("min: " + min);
        //min: OptionalInt[1]


        int oddSum = IntStream.range(1, 10).filter(i -> i % 2 == 0).sum();
        System.out.println("oddSum: " + oddSum);
        //oddSum: 20

    }
}
