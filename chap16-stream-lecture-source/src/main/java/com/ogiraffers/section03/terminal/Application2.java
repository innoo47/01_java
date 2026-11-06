package com.ogiraffers.section03.terminal;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Application2 {
    public static void main(String[] args) {

        /*
         * [reduce]
         *
         * Optional<T> reduce(BinaryOperator<T> accumulator);
         * T reduce(T identity, BinaryOperator<T> accumulator);
         * U reduce(U identity, BiFunction<U, ? super T, U> accumulator, BinaryOperator<U> combiner);
         * reduce()라는 메소드는 스트림에 있는 데이터들의 총합을 계산해준다.
         * */

        /* 인자가 1개일 경우 */
        OptionalInt reduceOneParam = IntStream.range(1, 10).reduce((a, b) -> Integer.sum(a, b));
        System.out.println(reduceOneParam);
        //OptionalInt[45]

        /* 인자가 2개일 경우 */
        int reduceTwoParam = IntStream.range(1, 10).reduce(100, Integer::sum);
        System.out.println(reduceTwoParam);
        //145


    }
}
