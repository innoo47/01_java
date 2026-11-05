package com.ohgiraffers.section03.grammer;

import java.util.EnumSet;

public class Application2 {
    public static void main(String[] args) {

        /**
         * EnumSet을 활용하여 enum을 Set 자료구조로 다룰 수 있다
         * EnumSet : 정의된 모든 enum상수를 EnumSet에 담고 반복문으로 이름과 값을 가져올 수 있다
         */
        EnumSet<FoodsEnum> foods = EnumSet.allOf(FoodsEnum.class);
        for (FoodsEnum food : foods) {
            System.out.println(food.getName() + " : " + food.getValue());
        }
        //앙버터김치찜 : 0
        //민트미역국 : 1
        //붕어빵초밥 : 2
        //열무김치라떼 : 3
        //우럭스무디 : 4
        //생갈치쉐이크 : 5

        System.out.println("======================================================");

        /**
         * 특정 상수 값만 Set에 추가
         */
        EnumSet<FoodsEnum> foods2 = EnumSet.of(FoodsEnum.DRINK_WOOLUCK_SMOOTHIE, FoodsEnum.MEAL_BUNGEOPPANG_SUSHI);
        for (FoodsEnum food : foods2) {
            System.out.println(food.getName() + " : " + food.getValue());
        }
        //붕어빵초밥 : 2
        //우럭스무디 : 4

        System.out.println("======================================================");

        /**
         * 특정 상수 값만 제외하고 Set에 추가
         */
        EnumSet<FoodsEnum> foods3 = EnumSet.complementOf(EnumSet.of(
                FoodsEnum.DRINK_WOOLUCK_SMOOTHIE, FoodsEnum.MEAL_BUNGEOPPANG_SUSHI
                )
        );

        for (FoodsEnum food : foods3) {
            System.out.println(food.getName() + " : " + food.getValue());
        }
        //앙버터김치찜 : 0
        //민트미역국 : 1
        //열무김치라떼 : 3
        //생갈치쉐이크 : 5

    }
}
