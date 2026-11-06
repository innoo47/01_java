package com.ohgiraffers.section02.functionalInterface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Application3 {
    public static void main(String[] args) {

        /**
         * Function : 매개변수와 리턴값이 있는 applyXXX() 메소드를 가지고 있다
         * (매개변수를 리턴값으로 매핑하는 역할)
         */

        /* 1. Function<T, R>#apply(T t):R --> 객체 T를 R로 매핑한다 */
        Function<String, Integer> function = (str) -> Integer.parseInt(str);
        String strValue = "12345";
        System.out.println(function.apply(strValue) + " : " + function.apply(strValue).getClass().getName());
        //12345 : java.lang.Integer

        List<String> names = List.of("홍길동", "신사임당", "김철");
        List<Integer> lengths = names.stream().map(name -> name.length()).toList();
        System.out.println(lengths);
        //[3, 4, 2]


        /* 2. BiFunction<T, U, R>#apply(T t, U u):R --> 객체 T와 U를 R로 매핑한다 */
        BiFunction<String, String, Integer> biFunction = (str1, str2) -> Integer.parseInt(str1) + Integer.parseInt(str2);
        String str1 = "12345";
        String str2 = "67890";
        System.out.println(biFunction.apply(str1, str2) + " : " + biFunction.apply(str1, str2).getClass().getName());
        //80235 : java.lang.Integer

        Map<String, Integer> scores = new HashMap<>();
        scores.put("홍길동", 80);
        scores.computeIfPresent("홍길동", (name, score) -> score + 10);
        System.out.println(scores.get("홍길동"));
        //90

        /*
            Function    은 입력값 1개    |    반환값은 R |   하나의 값을 반환
            BiFunction  은 입력값 2개    |    반환값은 R |   두 값을 이용해서 결과를 생성
         */

    }
}
