package com.ohgiraffers.section06.statickeyword;

public class StaticFieldTest {

    /*
    static은 너무 남발하면 메모리 누수가 일어난다
    적절하게 사용
     */


    private int nonStaticCount;         // 인스턴스 변수 (인스턴스 당 1개씩)
    private static int staticCount;     // 클래스 변수 (클래스 당 1개씩)

    public void increaseNonStaticCount() {
        this.nonStaticCount++;
    }

    public void increaseStaticCount() {
        /* 클래스 변수는 해당 클래스를 통해서 참조한다. */
        StaticFieldTest.staticCount++;
    }

    public int getNonStaticCount() {
        return nonStaticCount;
    }

    public static int getStaticCount() {
        /**
         * static 메소드는 인스턴스를 생성하지 않고 사용하는 메소드이다
         * 따라서 내부에서는 this키워드를 사용할 수 없다
         * return this.staticCount; (x)
         */
        return staticCount;
    }
}
