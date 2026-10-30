package com.ohgiraffers.section01.polymorphism;

public class Application3 {
    public static void main(String[] args) {

        Application3 application3 = new Application3();

        Animal animal1 = new Rabbit();  // Animal
        Animal animal2 = new Tiger();  // Animal

        application3.feed(animal1); // 동일한 타입이기 때문에 가능
        application3.feed(animal2);
        //토끼가 풀을 뜯어먹고 있습니다
        //호랑이가 고기를 뜯어 먹습니다

        Rabbit rabbit = new Rabbit();
        Tiger tiger = new Tiger();

        application3.feed(rabbit);  // 업캐스팅
        application3.feed(tiger);
        //토끼가 풀을 뜯어먹고 있습니다
        //호랑이가 고기를 뜯어 먹습니다

        application3.feed((Animal) animal1);    // 명시적 형변환
        application3.feed((Animal) animal2);
        //토끼가 풀을 뜯어먹고 있습니다
        //호랑이가 고기를 뜯어 먹습니다

        application3.feed(new Rabbit());
        //토끼가 풀을 뜯어먹고 있습니다


    }

//    public void feed(Rabbit rabbit) {}
//    public void feed(Tiger tiger) {}

    public void feed(Animal animal){
        animal.eat();   // 동적바인딩
    }
}
