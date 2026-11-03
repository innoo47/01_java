package com.ohgiraffers.section01.list.run;

import java.util.Stack;

public class Application4 {
    public static void main(String[] args) {

        /**
         * stack이란?
         * 후입선출(LIFO : Last In First Out)의 자료구조로 push(), pop(), peek() 등의
         * 메소드를 활용하여 자료를 처리할 수 있다
         */
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("Stack: " + stack);
        //Stack: [1, 2, 3, 4, 5]
        System.out.println("peek: " + stack.peek()); // 값이 어디에 있는지 확인
        //peek: 5
        System.out.println("search: " + stack.search(2));
        //search: 4
        // 2의 위치가 왜 4인가?
        // 1/2/3/4/5 로 들어갔으니 위부터 검색해서
        // 5/4/3/2/1 번째에 있다라는 뜻

        System.out.println("pop: " + stack.pop());
        System.out.println("pop: " + stack.pop());
        System.out.println("pop: " + stack.pop());
        System.out.println("pop: " + stack.pop());
        System.out.println("pop: " + stack.pop());
//        System.out.println("pop: " + stack.pop());  // EmptyStackException 발생
        System.out.println("stack: " + stack);
        //pop: 5
        //pop: 4
        //pop: 3
        //pop: 2
        //pop: 1
        //stack: []



    }
}
