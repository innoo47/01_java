package com.ohgiraffers.section01.extend;

public class Application {
    public static void main(String[] args) {

        /* 부모클래스 */
        Car car = new Car();
        //Car 클래스의 기본생성자 호출

        car.soundHorn();

        /**
         * 상속은 IS-A 관계로 구분되는 경우에만 사용해야 한다
         * 삼각형은 도형이다(o)
         * 도형은 삼각형이다(x)
         *
         * 소방차, 레이싱카는 모두 자동차이다(o)
         * 모든 자동차는 소방차 혹은 스쿨버스 혹은 레이싱카다(x)
         */
        /* 자식클래스 */
        FireCar fireCar = new FireCar();
        //Car 클래스의 기본생성자 호출
        //FireCar 기본 생성자 호출

        fireCar.soundHorn();
        //Car 클래스의 기본생성자 호출
        //FireCar 기본 생성자 호출
        //소방차가 앞으로 갈 수 없습니다

        fireCar.run();
        fireCar.sprayWater();
        //자동차가 달립니다
        //물을 뿌립니다

        RacingCar racingCar = new RacingCar();
        racingCar.run();
        racingCar.soundHorn();
        racingCar.stop();
        //Car 클래스의 기본생성자 호출
        //RacingCar 클래스 기본생성자 호출
        //레이싱카가 전속력으로 질주합니다
        //레이싱카는 경적을 울리지 않습니다
        //레이싱카가 멈춥니다

    }
}
