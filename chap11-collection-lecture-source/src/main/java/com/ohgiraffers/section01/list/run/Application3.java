package com.ohgiraffers.section01.list.run;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Application3 {
    public static void main(String[] args) {

        List<String> linkedList = new LinkedList<>();

        /**
         * 내부적인 구현코드는 다르지만 LinkedList도 List계열이기 때문에
         * 동일한 메소드를 호출해서 작업할 수 있다
         */
        linkedList.add("apple");
        linkedList.add("orange");
        linkedList.add("banana");
        linkedList.add("pear");
        linkedList.add("banana");
        System.out.println("linkedList = " + linkedList);   // []로 출력되니 toString()이 오버라이딩 되어있다
        //linkedList = [apple, orange, banana, pear, banana]
        System.out.println("linkedList.size() = " + linkedList.size());
        //linkedList.size() = 5

        // 저장 순서를 유지하고, 중복을 허용하고 있다
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(i + " : " + linkedList.get(i));
        }
        //0 : apple
        //1 : orange
        //2 : banana
        //3 : pear
        //4 : banana

        linkedList.set(0, "pineapple");
        System.out.println("linkedList = " + linkedList);
        //linkedList = [pineapple, orange, banana, pear, banana]

        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        //pineapple
        //orange
        //banana
        //pear
        //banana

        linkedList.clear(); // 전체 요소를 제거
        System.out.println("linkedList = " + linkedList);
        //linkedList = []


        /**
         * LinkedList는 ArrayList와 내부적인 구현 방식이 다르므로
         * 수정, 삭제가 빈번한 상황에서는 LinkedList를 사용하는 것이 효율적이다.
         * ~first, ~last 접미어를 붙여 순차적 기능을 강조한 함수들이
         * LinkedList에는 추가적으로 정의 되어 있다.
         * */
        linkedList.add("hello");
        ((LinkedList) linkedList).addFirst("world");
        ((LinkedList) linkedList).addLast("java");
        System.out.println("linkedList = " + linkedList);
        //linkedList = [world, hello, java]

        ((LinkedList) linkedList).removeFirst();
        ((LinkedList) linkedList).removeLast();
        System.out.println("linkedList = " + linkedList);
        //linkedList = [hello]
        System.out.println("isEmpty = " + linkedList.isEmpty());
        //isEmpty = false



    }
}
