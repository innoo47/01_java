package com.ohgiraffers.section02.set.run;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Application2 {
    public static void main(String[] args) {

        /**
         * LinkedHashSet
         * 저장 당시의 순서를 유지하는 특성을 가지고 있다
         * (중복제거 + 순서유지)
         */
        Set<String> lset = new LinkedHashSet<>();
        lset.add("ramen");
        lset.add("pork");
        lset.add("kimchi");
        lset.add("friedEgg");
        lset.add("kimchi");
        lset.add("chicken");
        lset.add("chicken");

        System.out.println("lset : " + lset);
        //lset : [ramen, pork, kimchi, friedEgg, chicken]
        // 중복을 제거하고, 순서를 유지한다

        // 1
        /**
         * Link를 통해서 저장 순서를 유지하며, 중복저장은 불가능한 특성을 가지고 있다
         * HashSet이 가지는 기능을 모두 가지고 있으므로 동일한 메소드 활용이 가능
         */
        Object[] array = lset.toArray();
        System.out.println("lset : " + Arrays.toString(array));
        //lset : [ramen, pork, kimchi, friedEgg, chicken]

        // 2
        Iterator<String> iterator = lset.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s);
        }
        //ramen
        //pork
        //kimchi
        //friedEgg
        //chicken

        // 3
        for(String s: lset){
            System.out.println(s);
        }
        //ramen
        //pork
        //kimchi
        //friedEgg
        //chicken




    }
}
