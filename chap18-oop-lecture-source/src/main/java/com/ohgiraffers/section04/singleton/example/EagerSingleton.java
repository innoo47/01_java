package com.ohgiraffers.section04.singleton.example;

/**
 * 이른 초기화 싱글톤 패턴
 */
public class EagerSingleton {

    /* 클래스가 처음 생성 될 때 객체를 하나만 생성해둔다 */
    private static EagerSingleton instance = new EagerSingleton();

    /* 생성자의 접근제한자를 private로 만들어서 다른 곳에서는 직접 생성하지 못하게 막음 */
    private EagerSingleton() {}

    /* 필드와 생성자의 접근 제한자를 private로 선언하여 외부에서 값을 가져갈 수 있는 방법을 제시 */
    public static EagerSingleton getInstance() {
        return instance;
    }

}
