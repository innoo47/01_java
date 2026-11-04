package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class Application2 {
    public static void main(String[] args) {

        ExceptionTest exceptionTest = new ExceptionTest();
        try {
            exceptionTest.checkEnoughMoney(10000, 50000);   // 정상동작
//            exceptionTest.checkEnoughMoney(-20000, 50000);  // 상품가격이 음수일 경우
//            exceptionTest.checkEnoughMoney(20000, -10000);  // 가진 돈이 음수일 경우
//            exceptionTest.checkEnoughMoney(20000, 10000);

            /**
             * '|' : 동일한 레벨의 다른 타입의 예외를 하나의 catch블록에서 처리할 수 있다
             * 단, 상위 타입의 Exception과 하위 타입의 Exception은 함께 서술할 수 없다
             */
        } catch (PriceNegativeException | MoneyNegativeException | NotEnoughMoneyException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            /**
             * try구문이 정상적으로 동작해도 실행하고,
             * exception이 발생해도 finally 구문은 반드시 동작한다
             */
            System.out.println("finally 동작");
        }
        System.out.println("프로그램 종료");
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }

    }
}
