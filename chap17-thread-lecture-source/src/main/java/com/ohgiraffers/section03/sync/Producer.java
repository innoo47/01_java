package com.ohgiraffers.section03.sync;

public class Producer extends Thread {

    /**
     * 공유 데이터에 값을 생산하는 역할
     * Thread를 상속한 클래스로, 생산자로 받은 Buffer에 1번부터 10번까지 상품을 넣는다
     */

    // 소비자와 같은 Buffer객체를 가리킨다
    private final Buffer criticalData;

    public Producer(Buffer criticalData) {
        this.criticalData = criticalData;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            criticalData.setData(i); //Buffer클래스에서 정의한 생산하는 기능의 메소드 호출

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
