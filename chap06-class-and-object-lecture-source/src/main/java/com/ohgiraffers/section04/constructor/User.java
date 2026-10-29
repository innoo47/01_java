package com.ohgiraffers.section04.constructor;

public class User {
    /* 필드 선언문 */
    private String id;
    private String pwd;
    private String name;
    private java.util.Date enrollDate;

    /* 기본 생성자가 기본적으로 생략되어있다. 컴파일시에 컴파일러가 자동으로 넣어준다 */
    /**
     * 기본 생성자
     * 접근제한자 클래스명([매개변수]) {}
     * 메소드의 형태를 띄지만 특이하게도 반환형이 없는 메소드
     * */
    public User() {
        System.out.println("User 기본 생성자 동작함");
    }

    /**
     * 매개변수가 있는 생성자
     * 초기화 될 필드가 여러 개일 경우 초기화하고 싶은 필드의 조합별로
     * 생성자를 여러개 작성할 수 있다
     */
    public User(String id, String pwd)  {
        this.id = id;
        this.pwd = pwd;
        System.out.println("User id, pwd 초기화 생성자 동작");
    }

    public User(String id, String pwd, String name, java.util.Date enrollDate) {
//        this.id = id;
//        this.pwd = pwd;
        /**
         * this 생성자
         * 동일 클래스 내의 다른 생성자 메소드를 호출하는 구문
         * 리턴 되어 돌아오지만 리턴값은 존재하지 않으며 가장 첫줄에 선언해야 한다
         */
        this(id, pwd);
        this.name = name;
        this.enrollDate = enrollDate;
        System.out.println("User의 모든 필드 초기화 생성자 동작함");
    }


    public String getInfo() {
        return id + " " + pwd + " " + name + " " + enrollDate;
    }

}
