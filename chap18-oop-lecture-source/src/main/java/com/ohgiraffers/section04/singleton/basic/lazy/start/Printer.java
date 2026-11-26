package com.ohgiraffers.section04.singleton.basic.lazy.start;

import com.ohgiraffers.section04.singleton.example.HolderSingleton;

public class Printer {

    private static int createCount = 0;
    // TODO 단계 5: 쓰지 않게 된 instance 필드를 지운다
    private static Printer instance;

    /* 프린터에 연결하는 데 시간이 걸린다고 가정하고 10ms 기다린다. */
    private Printer() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        createCount++;
    }

    // TODO 단계 3: getInstance() 위에 Printer 객체 하나를 담는 static 중첩 클래스 Holder를 만든다
    // TODO 단계 4: getInstance()가 Holder.INSTANCE를 돌려주게 바꾸고, 선언의 synchronized를 뺀다
    private static class Holder {
        private static final Printer INSTANCE = new Printer();
    }

    // TODO 단계 2: 메소드 선언의 static 뒤에 synchronized를 넣는다
    public static Printer getInstance() {
        return Holder.INSTANCE;
    }

    public static int getCreateCount() {
        return createCount;
    }
}