package com.ohgiraffers.section02.responsibility.basic.wallet.start;

public class Cashier {

    public void sell(Customer customer, int price) {

        // TODO 단계 3: 아래 두 줄을 customer.pay(price) 한 줄로 바꾼다
        customer.pay(price);
    }
}