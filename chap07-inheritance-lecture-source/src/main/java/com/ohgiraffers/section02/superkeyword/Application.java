package com.ohgiraffers.section02.superkeyword;

import java.util.Date;

public class Application {

    /*
     * super : 자식클래스를 이용해서 객체를 생성할 때 부모 생성자를 호출하여 부모 클래스의 인스턴스도
     *         함께 생성하게 된다. 이 때 생성한 부모의 인스턴스 주소를 보관하는 레퍼런스 변수도
     *         자식 클래스 내의 모든 생성자의 메소드 내에서 선언하지 않고도 사용할 수 있는 레퍼런스변수이다.
     * super() : 부모 생성자를 호출하는 구문으로 인자와 매개변수의 타입, 갯수, 순서가 일치하는
     *           부모의 생성자를 호출하게 된다. this()가 해당 클래스 내의 다른 생성자를 호출하는
     *           구문이라면, super()는 부모클래스가 가지는 private 생성자를 제외한 나머지 생성자를
     *           호출할 수 있도록 한 구문이다.
     * */

    public static void main(String[] args) {

        Product product1 = new Product();
        System.out.println(product1.getInformation());
        //Product 클래스의 기본생성자 호출
        //code = null, brand = null, name = null, price = 0

        Product product2 = new Product("s-1234", "삼성", "갤럭시z폴드8", 3000000, new Date());
        System.out.println(product2.getInformation());
        //Product 클래스의 매개변수 있는 생성자 호출
        //code = s-1234, brand = 삼성, name = 갤럭시z폴드8, price = 3000000

        Computer computer1 = new Computer();
        System.out.println(computer1.getInformation());
        //Product 클래스의 기본생성자 호출
        //Computer클래스의 기본 생성자 호출
        //code = null, brand = null, name = null, price = 0, cpu = null, ssd = 0, ram = 0, operationSystem = null

        Computer computer2 = new Computer("퀄컴 스냅드래곤", 512, 24, "안드로이드");
        System.out.println(computer2.getInformation());
        //Product 클래스의 기본생성자 호출
        //code = null, brand = null, name = null, price = 0, cpu = 퀄컴 스냅드래곤, ssd = 512, ram = 24, operationSystem = 안드로이드

        Computer computer3 = new Computer("s-1234", "삼성", "갤럭시z폴드8", 3000000, new Date(), "퀄컴 스냅드래곤", 512, 24, "안드로이드");
        System.out.println(computer3.getInformation());
        //Product 클래스의 매개변수 있는 생성자 호출
        //code = s-1234, brand = 삼성, name = 갤럭시z폴드8, price = 3000000, cpu = 퀄컴 스냅드래곤, ssd = 512, ram = 24, operationSystem = 안드로이드



    }
}
