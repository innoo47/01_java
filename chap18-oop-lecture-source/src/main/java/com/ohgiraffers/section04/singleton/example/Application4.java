package com.ohgiraffers.section04.singleton.example;

public class Application4 {

    public static void main(String[] args) {

        /*
         * 싱글톤의 비용
         *     화면 A와 화면 B가 클릭 수를 따로 세고 싶어도 싱글톤 카운터는 하나뿐이라 둘이 같은 값을 나눠 쓴다.
         *     어느 코드가 카운터를 쓰는지도 getInstance() 호출을 찾아봐야 알 수 있다.
         * */
        SharedCounter.getInstance().increase();
        SharedCounter.getInstance().increase();
        System.out.println("A 카운터: " + SharedCounter.getInstance().getCount());

        SharedCounter.getInstance().increase();
        System.out.println("B 카운터: " + SharedCounter.getInstance().getCount());
    }
}