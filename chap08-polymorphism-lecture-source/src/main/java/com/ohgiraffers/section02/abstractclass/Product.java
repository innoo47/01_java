package com.ohgiraffers.section02.abstractclass;

/*  추상클래스 선언  : abstract */
public abstract class Product {

    /**
     * 추상클래스는 보통 일반 클래스에서 필요할때 abstract 키워드를 붙여 만든다
     */

    /* 추상 클래스는 필드를 가질 수 있다 */
    private int  nonStaticField;
    private static int staticField;

    /**
     * 추상클래스는 생성자를 가질 수 있다
     * 단, 직접적으로 인스턴스를 생성 할 수는 없다
     */
    public Product() {
    }

    /* 추상클래스는 처음부터 만들어지지 않을 경우가 많아서 일반적인 메소드를 가질 수 있다 */
    public void nonStaticMethod() {
        System.out.println("Product 클래스의 nonStaticMethod");
    }
    public void staticMethod() {
        System.out.println("Product static method");
    }

    /* 추상 메소드 (미완성메소드) 작성 */
    public abstract void abstMethod();
}
