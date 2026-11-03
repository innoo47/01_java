package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.*;

public class Application {
    public static void main(String[] args) {

        RabbitFarm<Bunny> rabbitFarm = new RabbitFarm<>();

        rabbitFarm.setAnimal(new Bunny());
        rabbitFarm.getAnimal().cry();
        //바니바니 당근당근

        rabbitFarm.setAnimal(new DrunkBunny());
        rabbitFarm.getAnimal().cry();
        //봐니봐니 돵근돵근

        /* extends 키워드를 이용하여 특정 타입만 사용하도록 제네릭 범위를 제한 할 수 있다 */
//        RabbitFarm<Animal> farm1 = new RabbitFarm<>();
//        RabbitFarm<Mammal> farm2 = new RabbitFarm<>();
//        RabbitFarm<Snake> farm3 = new RabbitFarm<>();

        RabbitFarm<Rabbit> farm4 = new RabbitFarm<>();
        farm4.setAnimal(new Rabbit());
        farm4.getAnimal().cry();
        //토끼가 울음소리를 냅니다

        RabbitFarm<Bunny> farm5 = new RabbitFarm<>();
        farm5.setAnimal(new Bunny());
        farm5.getAnimal().cry();
        //바니바니 당근당근

        RabbitFarm<DrunkBunny> farm6 = new RabbitFarm<>();
        farm6.setAnimal(new DrunkBunny());
        farm6.getAnimal().cry();
        //봐니봐니 돵근돵근



    }
}
