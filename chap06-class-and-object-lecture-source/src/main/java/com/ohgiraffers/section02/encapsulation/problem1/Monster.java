package com.ohgiraffers.section02.encapsulation.problem1;

public class Monster {

    String name;
    int hp;

    public void setHp(int hp) {
        if (hp>0) {
            /* this : 인스턴스 변수가 생성 되었을때 자신의 주소를 저장하는 레퍼런스 주소 */
            this.hp = hp;   // m1.hp
            System.out.println("양수 값이 입력되어 몬스터의 체력을 입력값으로 변경");
        } else {
            this.hp = 0;
            System.out.println("음수 값이 입력되어 몬스터의 체력을 0으로 변경");
        }
    }

}
