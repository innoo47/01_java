package com.ohgiraffers.section02.encapsulation.problem2;

public class Application {
    public static void main(String[] args) {
        /* 필드에 직접접근하는 경우 발생할 수 잇는 문제점 이해 */

        /**
         * 필드에 직접 접근하면 필드의 변경이 발생하였을 때 사용한 코드를 모두 수정해야한다
         * 이는 유지보수적인 측면에서 악영향을 끼친다
         */
        Monster m1 = new Monster();
        m1.name = "두치";
        m1.setInfo("두치");
        m1.hp = 200;

        Monster m2 = new Monster();
        m2.name = "뿌꾸";
        m2.hp = -200;

        Monster m3 = new Monster();
        m3.setInfo("드라큘라");
    }
}
