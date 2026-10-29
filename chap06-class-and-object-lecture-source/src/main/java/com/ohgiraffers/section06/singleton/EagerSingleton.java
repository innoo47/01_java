package com.ohgiraffers.section06.singleton;

public class EagerSingleton {

    private static EagerSingleton eager = new EagerSingleton();

    private EagerSingleton() {} // private로 생성자 자체를 막는다

    // 주소값을 가져가기 위해
    public static EagerSingleton getInstance() {
        return eager;
    }

}
