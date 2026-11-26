package com.ohgiraffers.section02.responsibility.basic.player.start;

public class Application {

    public static void main(String[] args) {

        /* 공격을 받을 때마다 바깥 코드가 체력을 꺼내 계산하고 다시 넣는다. */
        Player player = new Player(30);

        // TODO 단계 2: 아래 두 곳의 setHp(getHp() - 피해) 줄을 takeDamage 호출로 바꾼다
        player.takeDamage(10);
        System.out.println("[공격 1] 체력: " + player.getHp());

        player.takeDamage(16);
        System.out.println("[공격 2] 체력: " + player.getHp());
    }
}