package com.ohgiraffers.section02.encapsulation.problem1;

public class Application {
    public static void main(String[] args) {
        
        /* 필드에 직접 접근하는 경우 발생할 수 있는 문제점 이해 */
        Monster m1 = new Monster();
        m1.name = "두치";
        m1.hp = 200;
        System.out.println("m1.name = " + m1.name);
        System.out.println("m1.hp = " + m1.hp);

        Monster m2 = new Monster();
        m2.name = "뿌꾸";
        m2.hp = 200;
        m2.setHp(-200);
        System.out.println("m2.name = " + m2.name);
        System.out.println("m2.hp = " + m2.hp);
    }
}
