package com.ogiraffers.section01.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Application1 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>(
                Arrays.asList("hello", "stream", "world")
        );

        /**
         * 특정 요소를 찾기 위해 iterator or forEach(향상된 for문) 등을 활용할 수 있다
         */
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if(next.equals("stream")) {
                System.out.println(next);
            }
        }
        //stream

        System.out.println("====== stream start ======");
        /* stream을 이용해서 위의 동작을 동일하게 수행 */
        list.stream().forEach(System.out::println);
        //hello
        //stream
        //world
        System.out.println("====== stream case 1 ======");
        list.stream().forEach(str-> System.out.println("값 : " + str));
        //====== stream case 1 ======
        //값 : hello
        //값 : stream
        //값 : world
        System.out.println("====== stream case 2 ======");
        list.stream().filter("stream"::equals).forEach(str -> System.out.println("걸러진 값 : " + str));
        //====== stream case 2 ======
        //걸러진 값 : stream





    }
}
