package com.ohgiraffers.section01.list.run;

import java.util.*;

public class Application5 {
    public static void main(String[] args) {

        /** Queue **/
        // 큐는 LinkedList를 주로 씀
//        Queue<String> queue = new LinkedList<>();
        LinkedList<String> queue = new LinkedList<>();  // LinkedList는 queue 중에서도 deque에 해당되어
                                                        // offerFirst(), offerLast()같은 메소드도 제공한다
        // 선입 선출 + 정렬의 개념 : PriortyQueue
        PriorityQueue<String> priorityQueue1 = new PriorityQueue<>();    // String의 기준대로 문자열 오름차순
        PriorityQueue<String> priorityQueue2 = new PriorityQueue<>(Collections.reverseOrder()); // 내림차순

        /* Queue에 데이터를 넣을 때는 offer() 메소드를 사용 */
        queue.offer("first");
        queue.offer("second");
        queue.offer("third");
        queue.offer("fourth");
        queue.offer("fifth");

        System.out.println("queue: " + queue);
        //queue: [first, second, third, fourth, fifth] <-- []로 보아 toString() 오버라이딩 되어있다

        /**
         * peek() : 해당 큐의 가장 앞에 있는 요소(먼저 들어온 요소)를 반환
         * poll() : 해당 큐의 가장 앞에 있는 요소(먼저 들어온 요소)를 반환하고 제거
         * */
        System.out.println("peek: " + queue.peek());
        System.out.println("poll: " + queue.poll());
        System.out.println("peek: " + queue.peek());
        System.out.println("poll: " + queue.poll());
        System.out.println("poll: " + queue.poll());
        System.out.println("poll: " + queue.poll());
        System.out.println("poll: " + queue.poll());
        System.out.println("poll: " + queue.poll());    // 큐에서 반환할 값이 없을 경우 null 반환
        //peek: first
        //poll: first
        //peek: second
        //poll: second
        //poll: third
        //poll: fourth
        //poll: fifth
        //poll: null



    }
}
