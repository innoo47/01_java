package com.ohgiraffers.section02.responsibility.example;

public class Application2 {

    public static void main(String[] args) {

        /*
         * 메시지와 협력(묻지 말고 시켜라)
         *     데이터를 꺼내 묻지 않고, 데이터를 가진 객체에게 할 일을 메시지(메소드 호출)로 보낸다.
         *     Application2는 withdraw 메시지를 보낼 뿐 잔액을 계산하지 않는다.
         * */
        Account account = new Account(10000);

        account.withdraw(3000);
        System.out.println("출금 뒤 잔액: " + account.getBalance());

        if (!account.withdraw(20000)) {
            System.out.println("출금 결과: 잔액 부족");
        }
    }
}