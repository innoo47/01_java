package com.ohgiraffers.section02.set.run;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Application3 {
    public static void main(String[] args) {

        /**
         * TreeSet
         * 중복을 허용하지 않는다, 데이터를 자동으로 정렬해서 저장하는 자료구조
         */
        Set<String> tset = new TreeSet<String>();
        tset.add("java");
        tset.add("mariaDB");
        tset.add("jdbc");
        tset.add("html");
        tset.add("css");
        tset.add("java");

        System.out.println("tset : " + tset);   // toString이 오버라이딩
        //tset : [css, html, java, jdbc, mariaDB]
        // 중복x, 자동 오름차순 정렬을 하여 이진 트리의 형태로 요소를 저장
        // String 클래스에 implements되어있는 Comparable을 통해 compareTo 메소드가
        // 오버라이딩 되어있는 기준으로 정렬된다

        Set<Integer> lotto = new TreeSet<>();
        while (lotto.size() < 6) {
            lotto.add((int) (Math.random() * 45) + 1);
        }
        System.out.println("lotto : " + lotto);
        //lotto : [1, 5, 22, 23, 25, 26]


    }
}
