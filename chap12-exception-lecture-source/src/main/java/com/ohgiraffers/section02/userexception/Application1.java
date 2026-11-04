package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class Application1 {
    public static void main(String[] args) {

        ExceptionTest et = new ExceptionTest();
        try {
            // 상품 가격이 음수일 경우
            et.checkEnoughMoney(-20000, 10000);
            // 가진 돈이 음수일 경우
            et.checkEnoughMoney(10000, -20000);
            // 상품 가격보다 가진 돈이 적은 경우
            et.checkEnoughMoney(20000, 10000);

            /**
             * 예외 상황별로 catch블럭을 따로 작성해서 처리할 수도 있고,
             * 상위타입의 Exception을 이용해서 통합적으로 처리할 수도 있다
             * 단, 상위타입의 Exception블럭이 먼저 기술 되면 아래로 코드가 도달할 수 없으므로
             * 컴파일 에러가 발생한다
             * 서술 순서는 하위 타입 -> 상위 타입으로 기재한다
             */

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage()); // 사용자가 예외 처리시에 입력한 문구만 출력
            System.out.println(e.getClass());
            System.out.println(e.getClass().getName());
        }
//        } catch (PriceNegativeException e) {
//            throw new RuntimeException(e);
//        } catch (MoneyNegativeException e) {
//            throw new RuntimeException(e);
//        } catch (NotEnoughMoneyException e) {
//            throw new RuntimeException(e);
//        }



        //상품 가격은 음수일 수 없습니다@
        //class com.ohgiraffers.section02.userexception.exception.PriceNegativeException
        //com.ohgiraffers.section02.userexception.exception.PriceNegativeException

    }
}
