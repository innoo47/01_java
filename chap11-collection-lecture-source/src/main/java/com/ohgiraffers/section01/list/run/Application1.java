package com.ohgiraffers.section01.list.run;

import java.util.*;

public class Application1 {
    public static void main(String[] args) {
        /*
         * 컬렉션 프레임워크(Collection Framework)
         * 자바에서 컬렉션 프레임워크는 여러 개의 다양한 데이터들을 쉽고 효과적으로 처리할 수 있도록
         * 표준화된 방법을 제공하는 클래스들의 집합을 의미한다.
         * 즉, 데이터는 효율적으로 저장하는 자료구조와 데이터를 처리하는 알고리즘을 미리 구현해 놓은 클래스를 말한다.
         * */

        /*
         * ArrayList
         * 가장 많이 사용되는 컬렉션 클래스이다.
         * JDK 1.2부터 제공된다.
         *
         * : 배열은 크기를 변경하는 것이 불가능하고 요소의 추가/삭제/정렬 등이 복잡하다.
         * 이러한 기능을 메소드로 구현해서 제공하고 있으며 단, 속도가 빨라지는 것은 아니다.
         * */

        /**
         * 다형성을 이용해서 상위 레퍼런스로 ArrayList객체를 참조할 수 있다
         * List인터페이스 하위 다양한 구현체들로 타입변경이 가능하므로
         * 보다 유연한 코드를 작성 할 수 있다
         */
        ArrayList alist = new ArrayList();
        List list = new ArrayList();        // 강추! 다형성 때문에 변경사항에 대처가 좋음
        Collection clist = new ArrayList();

//        list = new LinkedList(alist);
//        LinkedList list1 = new LinkedList<>(new ArrayList());

        System.out.println("=====> alist : " + alist.toString());
        alist.add("hello");
        alist.add(10);      // autoboxing(값 -> 객체)
        System.out.println("=====> alist : " + alist);
        //=====> alist : []
        //=====> alist : [hello, 10]

        /**
         * arrayList의 크기는 size() 메소드로 확인 가능
         * 단, size() 메소드는 배열의 크기가 아닌 요소의 갯수를 반환한다
         */
        System.out.println("alist.size() : " + alist.size());
        //alist.size() : 2


        /* (READ) get */
        for (int i = 0; i < alist.size(); i++) {
            System.out.println(i + " : " + alist.get(i));
        }
        //0 : hello
        //1 : 10

        /* (CREATE) add */
        alist.add("apple");
        System.out.println("=====> alist : " + alist);
        //=====> alist : [hello, 10, apple]
        alist.add(2, "orange");
        System.out.println("=====> alist : " + alist);
        //=====> alist : [hello, 10, orange, apple]

        /* (DELETE) remove */
        alist.remove(2);
        System.out.println("=====> alist : " + alist);
        //=====> alist : [hello, 10, apple]

        /* (UPDATE) set */
        alist.set(1, Boolean.valueOf("true"));
        System.out.println("=====> alist : " + alist);
        //=====> alist : [hello, true, apple]

        /**
         * String 타입의 Element만 저장하는 ArrayList 생성
         */
        List<String> stringList = new LinkedList<>();
        stringList.add("apple");
//        stringList.add(123); (x)
        stringList.add("orange");
        stringList.add("banana");
        stringList.add("mango");
        stringList.add("grape");
        stringList.add("apple"); // 똑같은것을 넣어도 가능


        /* 오름차순 : .sort() */

        System.out.println("stringList = " + stringList);
        //stringList = [apple, orange, banana, mango, grape, apple]
        Collections.sort(stringList);   // String 에는 문자열 오름차순(Ascending)에 대한 정의가 되어있다
        System.out.println("stringList = " + stringList);
        //stringList = [apple, apple, banana, grape, mango, orange]

        List<Integer> integerList = new LinkedList<>();
        integerList.add(4);
        integerList.add(50);
        integerList.add(200);
        integerList.add(4);
        integerList.add(8);
        integerList.add(9);
        integerList.add(15);
        System.out.println("integerList = " + integerList);
        //integerList = [4, 50, 200, 4, 8, 9, 15]
        Collections.sort(integerList);
        System.out.println("integerList = " + integerList);
        //integerList = [4, 4, 8, 9, 15, 50, 200]

        /* 내림차순은 따로 없어서 다음과 같이 */

        /*
         * Iterator란?
         * Collection 인터페이스의 iterator() 메소드를 이용해서 인스턴스를 생성할 수 있다.
         * 컬렉션에서 값을 읽어오는 방식을 통일된 방식으로 제공하기 위해 사용한다.
         * 반복자라고 불리우며, 반복문을 이용해서 목록을 하나씩 꺼내는 방식으로 사용하기 위함이다.
         *
         * 인덱스로 관리되는 컬렉션이 아닌 경우에는 반복문을 사용해서 요소에 하나씩 접근할 수 없기 때문에
         * 인덱스를 사용하지 않고도 반복문을 사용하기 위한 목록을 만들어주는 역할이라고 보면된다.
         *
         * hasNext() : 다음 요소를 가지고 있는 경우 true, 더이상 요소가 없는 경우 false를 반환
         * next() : 다음 요소를 반환
         * */

        /* 편하게 값 변경 */

        stringList = new LinkedList<>(stringList);

        // 오름차순만 쓸 수 있던걸 내림차순으로 구현
        Iterator<String> dIter = ((LinkedList<String>) stringList).descendingIterator();
        while (dIter.hasNext()) {
            System.out.println(dIter.next());
        }
        //orange
        //mango
        //grape
        //banana
        //apple
        //apple
        System.out.println("========================");
        while (dIter.hasNext()) {
            System.out.println(dIter.next());
        }
        System.out.println("========================");

        List<String> descList = new ArrayList<>();
        while (dIter.hasNext()) {
            descList.add(dIter.next());
        }
        System.out.println("descList = " + descList);

    }
}
