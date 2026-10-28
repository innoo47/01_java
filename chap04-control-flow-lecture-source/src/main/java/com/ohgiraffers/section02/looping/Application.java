package com.ohgiraffers.section02.looping;

public class Application {
    public static void main(String[] args) {

        A_for aFor = new A_for();
//        aFor.testSimpleForStatement();
//        aFor.test1();
//        aFor.test2();

        B_nestedFor bNestedFor = new B_nestedFor();
//        bNestedFor.printGugudanFromTwoToNine();
//        bNestedFor.printTriangleStars();

        C_while cWhile = new C_while();
//        cWhile.testSimplewhileStatement();
//        cWhile.testWhileExample();
        cWhile.testSimpleDoWhileStatement();
    }
}
