package com.ohgiraffers.section02.functionalInterface;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.function.*;

public class Application2 {
    public static void main(String[] args) {

        /**
         * Supplier : 매개변수가 없고 리턴 값이 있는 getXXX() 메소드를 가지고 있다
         */

        /* Supplier<T>#get(): T ==> 객체 T를 리턴한다 */
        Supplier<LocalDateTime> supplier = () -> LocalDateTime.now();
        System.out.println(supplier.get());
        //2026-11-06T10:38:27.547080400

        Optional<String> name = Optional.empty();
        String result = name.orElseGet(() -> "기본 사용자");
        System.out.println(result);
        //기본 사용자

        /* BooleanSupplier#getAsBoolean():boolean --> boolean값을 리턴한다 */
        BooleanSupplier booleanSupplier = () -> {
            int random = (int) (Math.random() * 2);
            return random == 0 ? true : false;
        };
        System.out.println(booleanSupplier.getAsBoolean());
        //true

        int age = 25;
        BooleanSupplier isAdult = () -> age >= 19;
        if(isAdult.getAsBoolean()) {
            System.out.println("성인 입니다");
        } else {
            System.out.println("미성년자 입니다");
        }
        //성인 입니다

        /* IntSupplier#getAsInt():int --> int값을 리턴한다 */
        IntSupplier intSupplier = () -> (int) (Math.random() * 6) + 1;
        System.out.println("주사위를 던져서 나온 수 : " + intSupplier.getAsInt());
        //주사위를 던져서 나온 수 : 5

        /* LongSupplier#getAsLong():long --> long값을 리턴한다 */
        LongSupplier longSupplier = () -> new java.util.Date().getTime();
        System.out.println("1970년 1월 1일 0시 0분 0초 이후 지난 시간 : " + longSupplier.getAsLong());
        //1970년 1월 1일 0시 0분 0초 이후 지난 시간 : 1793930551691

        /* DoubleSupplier#getAsDouble():double --> double값을 리턴한다 */
        DoubleSupplier doubleSupplier = () -> Math.random();
        System.out.println("Math.random()의 리턴값 : " + doubleSupplier.getAsDouble());
        //Math.random()의 리턴값 : 0.3344026632903381

    }
}
