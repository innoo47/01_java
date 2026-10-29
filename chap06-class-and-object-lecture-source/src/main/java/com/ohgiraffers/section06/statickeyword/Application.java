package com.ohgiraffers.section06.statickeyword;

public class Application {
    public static void main(String[] args) {

        StaticFieldTest f1 =  new StaticFieldTest();
        f1.increaseNonStaticCount();
        f1.increaseStaticCount();

        System.out.println(f1.getNonStaticCount());
        System.out.println(f1.getStaticCount());
        //  1
        //  1


        StaticFieldTest f2 =  new StaticFieldTest();
        f2.increaseNonStaticCount();
        f2.increaseStaticCount();

        System.out.println(f2.getNonStaticCount()); // 매번 0부터
        System.out.println(f2.getStaticCount());    // 유지
        //  1
        //  2


    }
}
