package com.ohgiraffers.section01.intro;

public class Application2 {
    public static void main(String[] args) {

        OuterInterface.Sum sum = (int x, int y) -> x + y;
        System.out.println(sum.sumToNumbers(10, 20));
        //30

        OuterInterface.Minus minus = (int a, int b) -> a - b;
        System.out.println(minus.minusToNumbers(10, 20));
        //-10

        OuterInterface.Multiple multiply = (int a, int b) -> a * b;
        System.out.println(multiply.multipleToNumbers(10, 20));
        //200

        OuterInterface.Devide devide = (int a, int b) -> a / b;
        System.out.println(devide.devideToNumbers(10, 20));
        //0

    }
}
