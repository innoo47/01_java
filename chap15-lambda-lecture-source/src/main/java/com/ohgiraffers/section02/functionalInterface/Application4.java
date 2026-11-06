package com.ohgiraffers.section02.functionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Application4 {
    public static void main(String[] args) {

        /**
         * Operator : Function과 똑같이 applyXXX()메소드를 가지고 있다
         * 차이점은 매개변수로 연산을 한 후 동일타입으로 리턴한다
         */

        /* BinaryOperator<T>#apply(T t1, T t2):T --> T와 T를 연산하여 T를 리턴한다
            BiFunction을 상속받아 구현했기 때문에 동일하게 apply를 사용할 수 있다 */
        BinaryOperator<String> binaryOperator = (str1, str2) -> str1 + str2;
        System.out.println(binaryOperator.apply("hello", "world"));
        //helloworld

        List<Integer> numbers = List.of(10, 20, 30, 40);
        int sum = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println("sum = " + sum);
        //sum = 100

        /* UnaryOperator<T>#apply(T t):T --> T를 연산하여 T를 리턴 */
        UnaryOperator<String> unaryOperator = (str) -> str + "world";
        System.out.println(unaryOperator.apply("hello"));
        //helloworld

        List<String> names = new ArrayList<>(
                List.of("hong", "kim", "lee")
        );
        names.replaceAll(name -> name.toUpperCase());
        System.out.println(names);
        //[HONG, KIM, LEE]

    }
}
