package com.ogiraffers.section03.terminal;

import java.util.Arrays;
import java.util.List;

public class Application4 {
    public static void main(String[] args) {

        /*
         * match
         *
         * Predicate 를 인자로 받아 조건을 만족하는 엘리먼트가 있는지 확인하고 boolean 으로 리턴
         * boolean anyMatch(Predicate<? super T> predicate);      // 하나라도 조건을 만족하는 값이 있는지
         * boolean allMatch(Predicate<? super T> predicate);      // 모든 조건을 만족하는지
         * boolean noneMatch(Predicate<? super T> predicate);     // 모든 조건을 만족하지 않는지
         * */

        List<String> stringList = Arrays.asList("Java", "Spring", "Spring Boot");

        boolean anyMatch = stringList.stream().anyMatch(str -> str.contains("p"));
        System.out.println(anyMatch);
        //true

        boolean allMatch = stringList.stream().allMatch(str -> str.length() > 4);
        System.out.println(allMatch);
        //false

        boolean noneMatch = stringList.stream().noneMatch(str -> str.contains("x"));
        System.out.println(noneMatch);
        //true


    }
}
