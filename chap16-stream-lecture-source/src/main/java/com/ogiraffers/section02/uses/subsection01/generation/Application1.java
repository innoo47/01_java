package com.ogiraffers.section02.uses.subsection01.generation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Application1 {
    public static void main(String[] args) {

        /* 배열이나 컬렉션을 이용하여 스트림을 생성하는 방법을 이해하고 사용할 수 있다 */

        /* 배열을 스트림으로 생성하기 */
        String[] sarr = {"java", "mariadb", "jdbc"};       // 배열 -> 스트림
        Stream<String> stringStream = Arrays.stream(sarr);
        stringStream.forEach(System.out::println);
        //java
        //mariadb
        //jdbc

        Arrays.asList("java", "mariadb", "jdbc").forEach(System.out::println);
        //java
        //mariadb
        //jdbc
        System.out.println("======================================");
        Stream<String> stringStream1 = Arrays.stream(sarr, 0, 2);
        stringStream1.forEach(System.out::println);
        //java
        //mariadb

        System.out.println("======================================");
        /* 컬렉션을 스트림으로 생성하기 */
        List<String> stringList = Arrays.asList("html", "css", "javascript");
        Stream<String> stringStream2 = stringList.stream();
        stringStream2.forEach(System.out::println);
        //html
        //css
        //javascript

        System.out.println("======================================");
        /* 컬렉션에도 forEach기능은 정의되어 있어서 stream화 하지 않고 사용할 수 있다 */
        stringList.forEach(System.out::println);
        //html
        //css
        //javascript

        System.out.println("======================================");
        /* Builder를 활용한 스트림 생성 */
        Stream<String> stringStream3 = Stream.<String>builder().add("홍길동").add("유관순").add("이순신").build();
        stringStream3.forEach(System.out::println);
        //홍길동
        //유관순
        //이순신

        System.out.println("======================================");
        /* iterate()를 활용하여 수열 형태의 스트림을 생성 */
        Stream<Integer> intStream = Stream.iterate(10, value -> value * 2).limit(10);
        intStream.forEach(System.out::println);
        //10
        //20
        //40
        //80
        //160
        //320
        //640
        //1280
        //2560
        //5120


    }
}
