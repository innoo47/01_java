package com.ohgiraffers.section02.responsibility.basic.wallet.start;

public class Application {

    public static void main(String[] args) {

        Customer customer = new Customer(new Wallet(10000));
        Cashier cashier = new Cashier();

        cashier.sell(customer, 3000);
        System.out.println("남은 돈: " + customer.getWallet().getMoney());
    }
}