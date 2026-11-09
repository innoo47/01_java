package com.ohgiraffers.section03.sync;

public class Buffer {

    /**
     * Buffer는 생산자와 소비자가 함께 쓰는 공유 자원(상품 한개만 담는 칸)
     * - 두 메소드 모두 synchronized라서 한 번에 한 스레드만 들어올 수 있다
     * - wait()와 notify() 메소드는 synchronized 안에서만 호출할 수 있다
     * 밖에서 호출하면 IllegalMonitorStateException이 발생한다
     */

    private int data;
    private boolean empty = false;  // ture이면 칸이 비어있고, false이면 상품이 들어가 있다

    /* 소비자 스레드가 호출 : 칸이 비어있으면 생산자가 채울 때까지 기다린다 */
    public synchronized void getData() {

        if (empty) {
            System.out.println("getData wait");
            try {
                /* 실행중인 스레드를 일시정지 시킨다. 다른 스레드에서 notify()가 호출되면 깨어나게 된다 */
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("소비자 : " + data + " 번 상품을 소비하였습니다");
        empty = true;   // 상품을 가져왔으니 상품이 없다고 상태값을 변경

        /* 대기중인 스레드를 하나 깨워서 다시 실행 대기 상태로 전환시킨다 */
        notify();

    }

    /* 생산자 스레드가 호출 : 칸에 상품이 있으면 소비자가 꺼낼 때까지 기다린다 */
    public synchronized void setData(int data) {

        if (!empty) {
            System.out.println("setData wait");
            try {
                /* 실행중인 스레드를 일시정지 시킨다. 다른 스레드에서 notify()가 호출되면 깨어나게 된다 */
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        this.data = data;
        System.out.println("생산자 : " + data + " 번 상품을 생산하였습니다");
        empty = false;

        /* 대기중인 스레드를 하나 깨워서 다시 실행 대기 상태로 전환시킨다 */
        notify();

    }


}
