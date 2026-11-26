package com.ohgiraffers.section02.responsibility.example;

public class Application4 {

    public static void main(String[] args) {

        /*
         * 상속
         *     Cat은 Animal을 물려받아(extends) name 필드와 getName 메소드를 다시 쓰지 않는다.
         *     speak처럼 하위 클래스에 맞게 바꿀 메소드는 같은 이름으로 다시 정의한다(@Override).
         * */
        Animal animal = new Animal("이름 없는 동물");
        Cat cat = new Cat("나비");

        System.out.println(animal.speak());
        System.out.println("물려받은 메소드: " + cat.getName());
        System.out.println(cat.speak());
    }
}