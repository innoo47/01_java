package com.ohgiraffers.section01.exception;

public class Application2 {
    public static void main(String[] args) {

        ExceptionTest exceptionTest = new ExceptionTest();
        try {
            /* try : 예외 발생 가능성이 있는 코드를 작성 */
            exceptionTest.checkEnoughMoney(10000, 50000);
            System.out.println("====================================");
            exceptionTest.checkEnoughMoney(50000, 10000);
        } catch (Exception e) {
            /* catch : try블럭에서 예외가 발생한 경우 catch블럭의 코드가 실행 */
            System.out.println("============== 상품구입불가 ==============");
            e.printStackTrace();
        }

        /* 예외가 발생하더라도 catch블럭 실행 후 프로세스의 수행 흐름으로 돌아와 정상 종료된다 */
        System.out.println("프로그램을 종료");
    }
    //가지고 계신 돈은 50000원 입니다
    //상품을 구입하기 위한 금액이 충분합니다
    //즐거운 쇼핑되세요
    //====================================
    //가지고 계신 돈은 10000원 입니다
    //============== 상품구입불가 ==============
    //프로그램을 종료
    //java.lang.Exception
    //	at com.ohgiraffers.section01.exception.ExceptionTest.checkEnoughMoney(ExceptionTest.java:12)
    //	at com.ohgiraffers.section01.exception.Application2.main(Application2.java:11)
}
