package com.ohgiraffers.section02.responsibility.example;

/* 프레임워크가 정한 상위 클래스다. 이 클래스를 물려받아야 프레임워크 안에서 동작한다. */
public abstract class ShopBean {

    public ShopBean() {
        if (!ShopContainer.isRunning()) {
            throw new IllegalStateException("ShopContainer를 먼저 시작해야 만들 수 있다");
        }
    }

    /* 프레임워크가 정한 메소드다. 물려받은 클래스는 반드시 구현해야 한다. */
    public abstract void init();
}