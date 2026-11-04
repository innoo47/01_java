package com.ohgiraffers.section02.set.run;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Application {
    public static void main(String[] args) {

        HashSet<String> hSet = new HashSet<String>();
        hSet.add(new String("java"));
        hSet.add(new String("mariaDB"));
        hSet.add(new String("servlet"));
        hSet.add(new String("spring"));
        hSet.add(new String("html"));

        /** 순서 보장 X **/
        System.out.println(hSet);
        //[mariaDB, spring, java, servlet, html]
        // set에 저장된 자료는 넣는 순서를 보장할 수 없다 - 비정형

        /** 중복허용 X **/
        hSet.add(new String("java"));
        hSet.add(new String("mariaDB"));
        System.out.println(hSet);
        //[mariaDB, spring, java, servlet, html]
        // 중복을 허용하지 않는다

        /** Set의 데이터를 순회하는 방법 **/
        /* 1. 배열로 변경 */
        // String.toCharArray()
        System.out.println(Arrays.toString("helloWorld".toCharArray()));
        //[h, e, l, l, o, W, o, r, l, d]

        // hSet.toArray()
        Object[] array = hSet.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + ": " + array[i]);
        }
        //0: mariaDB
        //1: spring
        //2: java
        //3: servlet
        //4: html

        /* 2. Iterable의 iterator메소드(반복자) */
        Iterator<String> iterator = hSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
//            iterator.remove(); // iterator의 remove를 활용하면 순회하면서 제거할 수 있다
        }
        //mariaDB
        //spring
        //java
        //servlet
        //html

        /* 3. 향상된 for문 */
        for (String str : hSet) {
            System.out.println(str);
//            hSet.remove(str); (x)     // 반복 순회 도중에 remove 메소드를 사용하면
//                                          ConcurrentModificationException이 발생
        }
        //mariaDB
        //spring
        //java
        //servlet
        //html

        System.out.println("hSet.size() = " + hSet.size());
        System.out.println("hSet.isEmpty() = " + hSet.isEmpty());
        //hSet.size() = 5
        //hSet.isEmpty() = false


    }
}
