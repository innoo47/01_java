package com.ohgiraffers.section02.functionalInterface;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.function.*;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Application1 {
    public static void main(String[] args) {

        /* JDK 8에서 빈번하게 사용되는 함수적 인터페이스를 표준 API로 제공하고 있다.
         *  Consumer : 리턴값이 없는 accept() 메소드를 가지고 있다.
         *  Supplier : 매개변수가 없고 리턴 값이 있는 getXXX() 메소드를 가지고 있다.
         *  Function : 매개변수와 리턴값이 있는 applyXXX() 메소드를 가지고 있다. (매개변수를 리턴값으로 매핑하는 역할)
         *  Operator : Function과 똑같이 applyXXX() 메소드를 가지고 있다. 차이점은 매개변수로 연산을 한 후 통일타입으로 리턴한다.
         *  Predicate : 매개변수와 boolean 값을 반환하는 testXXX()를 가지고 있다. (매개변수를 활용하여 boolean 반환)
         * */

        /* 매개변수 없고, 리턴값도 없는 람다 */
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello");
            }
        };
        r.run();
        //hello

        /**/
        Runnable runnable = () -> System.out.println("hello");
        runnable.run();
        //hello

        /**
         * Consumer
         */

        Consumer<String> c = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s + "(이)가 입력됨");
            }
        };
        c.accept("hello");
        //hello(이)가 입력됨

        /* Consumer<T>#accept(T t) : 객체 T를 입력받아 소비 */
        Consumer<String> consumer = (String s) -> System.out.println(s + "가 입력됨");
        consumer.accept("hello");
        //hello가 입력됨


        /* BiConsumer<T, U>#accept(T t, U u):void --> 객체 T, U를 받아 소비한다 */
        BiConsumer<String, LocalTime> biConsumer = (String s1, LocalTime time) ->
                System.out.println(s1 + "(이)가 " + time + "이 입력됨");
        biConsumer.accept("hello", LocalTime.now());
        //hello(이)가 10:20:17.041112이 입력됨

        Map<String, Integer> scores = Map.of(
                "홍길동", 90, "강감찬", 85, "신사임당", 100
        );
        scores.forEach((String name, Integer score) -> System.out.println(name + "의 점수는 " + score));
        //강감찬의 점수는 85
        //홍길동의 점수는 90
        //신사임당의 점수는 100

        /* IntConsumer#accept(int value): void -> int값을 받아 소비한다 */
        IntConsumer intConsumer = num -> System.out.println("입력하신 정수의 제곱은" + (num * num) + "입니다");
        intConsumer.accept(10);
        //입력하신 정수의 제곱은100입니다

        IntStream.rangeClosed(1, 10).forEach(value -> System.out.println(value *10));
        //10
        //20
        //30
        //40
        //50
        //60
        //70
        //80
        //90
        //100

        /* LongConsumer#accept(long value):void -> long값을 받아 소비한다 */
        LongConsumer longConsumer = num -> System.out.println("입력하신 정수는 " + num + "입니다");
        longConsumer.accept(12345);
        //입력하신 정수는 12345입니다

        LongStream.rangeClosed(1, 10).forEach(value -> System.out.println(value *10));
        //10
        //20
        //30
        //40
        //50
        //60
        //70
        //80
        //90
        //100

        /* ObjIntConsumer#accept(T t, int value):void -> 객체 T와 int 값을 받아 소비한다 */
        ObjIntConsumer<java.util.Random> objIntConsumer = (random, bound) -> System.out.println("0부터 " + bound + "전까지의 난수 발생 : " + random.nextInt(bound));
        objIntConsumer.accept(new Random(), 10);
        //0부터 10전까지의 난수 발생 : 5
    }
}
