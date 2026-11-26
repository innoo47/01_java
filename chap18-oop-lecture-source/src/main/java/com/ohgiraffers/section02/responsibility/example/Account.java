package com.ohgiraffers.section02.responsibility.example;

public class Account {

    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    /* 출금 규칙은 잔액을 가진 Account가 맡는다. 출금하면 true, 잔액이 모자라면 false를 돌려준다. */
    public boolean withdraw(int amount) {

        if (balance < amount) {
            return false;
        }
        balance = balance - amount;
        return true;
    }
}