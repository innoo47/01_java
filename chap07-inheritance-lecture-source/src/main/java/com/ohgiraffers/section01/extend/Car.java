package com.ohgiraffers.section01.extend;

public class Car extends Object {
    private boolean runningStatus;  // 자동차의 달리는 상태 값

    public Car() {
        super();    // java의 모든 클래스는 Object클래스를 상속받는다
                    // 아무것도 선언하지 않으면 컴파일러가 자동으로 해당 클래스에게 extends Object를 추가해준다
        System.out.println("Car 클래스의 기본생성자 호출");
    }

    public void run()   {
        runningStatus = true;
        System.out.println("자동차가 달립니다");
    }

    public void soundHorn() {
        if(isRunning()) {
            System.out.println("빵빵");
        } else {
            System.out.println("주행중이 아닌 상태에는 경적을 울릴 수 없습니다");
        }
    }

    protected boolean isRunning() {
        return runningStatus;
    }

    public void stop() {
        runningStatus = false;
        System.out.println("자동차가 멈춥니다");
    }

}
