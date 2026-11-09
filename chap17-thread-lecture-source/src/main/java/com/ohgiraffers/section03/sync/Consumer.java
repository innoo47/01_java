package com.ohgiraffers.section03.sync;

public class Consumer extends Thread {

    /**
     * 공유 데이터에 값을 소비하는 역할
     * Thread를 상속한 Thread로, 생산자로 받은 Buffer에서 상품을 10번 꺼낸다
     */

    // 생산자와 같은 Buffer객체를 가리킨다. 여러 스레드가 함께 쓰므로 critical(임계) 데이터라고 부른다
    private final Buffer criticalData;

    public Consumer(Buffer criticalData) {
        this.criticalData = criticalData;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            criticalData.getData();

            // 0.1초 쉬면서 생산자 스레드가 실행 될 틈을 만든다
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
