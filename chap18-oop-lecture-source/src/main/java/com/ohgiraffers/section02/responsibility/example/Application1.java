package com.ohgiraffers.section02.responsibility.example;

public class Application1 {

    public static void main(String[] args) {

        /*
         * 데이터를 꺼내서 바깥에서 계산하는 코드
         *     잔액을 꺼내(getBalance) 바깥에서 계산한 뒤 다시 넣는다(setBalance).
         *     「잔액보다 많이 출금할 수 없다」는 규칙이 Account를 쓰는 곳마다 되풀이된다.
         * */
        Account account = new Account(10000);

        int amount = 3000;
        if (account.getBalance() >= amount) {
            account.setBalance(account.getBalance() - amount);
        }
        System.out.println("출금 뒤 잔액: " + account.getBalance());
    }
}