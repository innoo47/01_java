package com.ohgiraffers.section03.reference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application3 {
    public static void main(String[] args) {

        /**
         * Collection과 람다식 함께 사용
         *
         * JDK8에 추가된 default메소드 Iterable:forEach
         * JDK8에 추가된 default메소드 Collection:removeIf
         * JDK8에 추가된 default메소드 List:replaceAll
         */
        test1();

        /**
         *  Map
         *
         *  JDK8에 추가된 default메소드 Map:forEach
         */
        test2();
    }

    private static void test1() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            list.add(i + 1);
        }

        for (Integer i : list) {
            System.out.print(i + " ");
        }
        //1 2 3 4 5 6 7 8 9 10 11

        System.out.println("\n==========================");
        list.forEach(i -> System.out.print(i + " "));
        System.out.println();
        //1 2 3 4 5 6 7 8 9 10 11

        /* 2의 배수 제거 */
        list.removeIf(i -> i % 2 == 0);
        System.out.println(list);
        //[1, 3, 5, 7, 9, 11]

        /* 모든 요소에 10씩 곱하기 */
        list.replaceAll(i -> i * 10);
        System.out.println(list);
        //[10, 30, 50, 70, 90, 110]

//        list.removeIf(i -> i % 2 == 0).replaceAll(i -> i * 10); (x)
    }

    private static void test2() {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Devic");
        map.put(2, "Jack");
        map.put(3, "Peter");
        map.put(4, "Brown");
        map.put(5, "Chris");

        System.out.println(map);
        //{1=Devic, 2=Jack, 3=Peter, 4=Brown, 5=Chris}

        System.out.println(map.get(1));
        System.out.println(map.get(6));
        System.out.println(map.getOrDefault(1, "홍길동"));
        System.out.println(map.getOrDefault(11, "홍길동"));
        //Devic
        //null
        //Devic
        //홍길동

        /* 해당 key가 존재하지 않을 경우 key - value 생성 */
        map.computeIfAbsent(10, k -> "James");
        System.out.println("map = "+ map);
        //map = {1=Devic, 2=Jack, 3=Peter, 4=Brown, 5=Chris, 10=James}

        /* 해당 key가 존재한다면 수정할 수 있다 */
        map.computeIfPresent(5, (k, v) -> "Karl");
        System.out.println("map = "+ map);
        //map = {1=Devic, 2=Jack, 3=Peter, 4=Brown, 5=Karl, 10=James}

        map.replaceAll((k, v) -> v.toUpperCase());
        System.out.println("map = "+ map);
        //map = {1=DEVIC, 2=JACK, 3=PETER, 4=BROWN, 5=KARL, 10=JAMES}

        map.forEach((k, v) -> System.out.println(k + " " + v));
        //1 DEVIC
        //2 JACK
        //3 PETER
        //4 BROWN
        //5 KARL
        //10 JAMES



    }
}
