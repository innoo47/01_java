package com.ohgiraffers.section02.responsibility.basic.wallet.start;

public class Customer {

    private Wallet wallet;

    public Customer(Wallet wallet) {
        this.wallet = wallet;
    }

    public Wallet getWallet() {
        return wallet;
    }

    // TODO 단계 2: 지갑에게 spend(price)를 시키는 pay(int price) 메소드를 만든다
    public void pay(int price) {
        wallet.spend(price);
    }
}