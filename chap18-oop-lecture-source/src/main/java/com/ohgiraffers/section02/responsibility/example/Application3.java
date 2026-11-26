package com.ohgiraffers.section02.responsibility.example;

public class Application3 {
    public static void main(String[] args) {

        Item item = new Item("노트", 5);

        item.sell();
        System.out.println(item.getName() + " 남은 수량 : " + item.getStock());

    }
}
