package com.ohgiraffers.section07.initblock;

public class Product {

    /* 1. JVM 기본값 */

    /* 2. 명시적 초기화 */
    private String name = "은하수";
    private int price = 2000000;
    private static String brand = "삼송";

    /* 기본 생성자 */
    public Product() {
        System.out.println("기본 생성자 동작");
    }

    /* 매개변수 있는 생성자 */
    public Product(String name, int price,  String brand) {
        this.name = name;
        this.price = price;
        this.brand = brand;
        System.out.println("매개변수 있는 생성자 동작");
    }

    /* 3. 초기화 블럭 */
    /* 인스턴스 초기화 블럭 */
    {
        name = "사이언";
        price = 80000;
        brand = "사과";
        System.out.println("인스턴스 초기화 블럭 동작함");
    } // static은 이렇게 쓰면 안됨

    /* static 초기화 블럭 */
    static {
        brand = "헬지";
        System.out.println("static 초기화 블럭 동작");
    }

    public String getInformation() {
        return this.name + " " +  this.price + " " + Product.brand;
    }

}
