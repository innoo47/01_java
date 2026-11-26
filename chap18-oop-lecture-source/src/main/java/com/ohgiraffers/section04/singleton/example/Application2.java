package com.ohgiraffers.section04.singleton.example;

public class Application2 {

    public static void main(String[] args) {

        /*
         * 싱글톤 구현 방식
         *     홀더 방식: 객체를 처음 쓸 때 만들고, JVM이 한 번만 만들도록 보장한다.
         *     enum 방식: 상수 하나짜리 enum을 쓴다. 코드가 가장 짧다.
         *
         *      # 복기 : 상수필드 -> public static final
         *      인터페이스에서 int MAX_VALUE = 10; == public static final int MAX_VALUE = 10;
         *                     같기 때문에 생략 가능
         * */
        HolderSingleton holder1 = HolderSingleton.getInstance();
        HolderSingleton holder2 = HolderSingleton.getInstance();
        System.out.println("홀더 같은 객체인가: " + (holder1 == holder2));

        EnumSingleton enum1 = EnumSingleton.INSTANCE;
        EnumSingleton enum2 = EnumSingleton.INSTANCE;
        System.out.println("enum 같은 객체인가: " + (enum1 == enum2));
    }
}