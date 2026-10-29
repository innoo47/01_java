package com.ohgiraffers.section02.encapsulation.problem3;

public class Application {
    public static void main(String[] args) {

        /**
         * 직접 접근이 아닌 메소드를 통한 간접 접근을 작성해두더라도
         * 접근제한자를 통해 강제화하지 않으면 직접접근이 가능한 문제가 존재하여
         * 접근제한자를 설정한다
         * ----> 필드는 private, 메소드는 public ===> 캡슐화 적용
         */
        Monster m1 = new Monster();
//        m1.name;  --> 필드를 private로 선언해서 다른 클래스에서 접근이 불가
        m1.setInfo("두치");
        m1.setHp(100);
        System.out.println(m1.getInfo());
        System.out.println(m1.getHp());

        Monster m2 = new Monster();
        m2.setInfo("뿌꾸");
        m2.setHp(-200);
        System.out.println(m2.getInfo());
        System.out.println(m2.getHp());


    }
}
