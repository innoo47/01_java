package com.ohgiraffers.section02.responsibility.basic.player.start;

public class Player {

    private int hp;
    private int defense = 3;

    // TODO 단계 4: 방어력 필드 defense(값 3)를 두고, takeDamage에서 피해에서 방어력을 뺀 만큼만 hp를 줄인다

    public Player(int hp) {
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }

    // TODO 단계 3: 이제 쓰는 곳이 없는 setHp를 지운다


    // TODO 단계 1: 받은 피해 damage만큼 hp를 줄이는 takeDamage(int damage) 메소드를 만든다
    public void takeDamage(int damage) {
        this.hp -= damage - defense;
    }
}