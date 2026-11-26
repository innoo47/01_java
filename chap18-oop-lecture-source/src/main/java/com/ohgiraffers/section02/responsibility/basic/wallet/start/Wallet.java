package com.ohgiraffers.section02.responsibility.basic.wallet.start;

public class Wallet {

    private int money;

    public Wallet(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    // TODO 단계 4: 이제 쓰는 곳이 없는 setMoney를 지운다


    // TODO 단계 1: money에서 amount만큼 빼는 spend(int amount) 메소드를 만든다
    public void spend(int amount) {
        money = money - amount;
    }
}