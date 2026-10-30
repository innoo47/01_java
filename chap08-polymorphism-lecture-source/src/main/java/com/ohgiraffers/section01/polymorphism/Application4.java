package com.ohgiraffers.section01.polymorphism;

public class Application4 {
    public static void main(String[] args) {

        Application4 app4 = new Application4();
        Animal randomAnimal = app4.getRandomAnimal();
        randomAnimal.cry();
        //Random Animal: 0
        //토끼가 울음소리를 냅니다

        //Random Animal: 1
        //호랑이가 울부짖습니다
    }

    public Animal getRandomAnimal() {
        int random = (int) (Math.random() * 2);
        System.out.println("Random Animal: " + random);

//        Animal animal = null;
//        if (random == 0) {
//            animal = new Rabbit();
//        }  else if (random == 1) {
//            animal = new Tiger();
//        }
        //=======>
        return (random == 0) ? new Rabbit() : new Tiger();
    }
}
