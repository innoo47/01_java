package com.ohgiraffers.section03.grammer;

public class Application1 {
    public static void main(String[] args) {

        /** Enum type의 메소드 */

        /**
         *  1. values() : 열거 타입의 모든 값을 배열로 반환
         *  */
        for (EnumType enumType : EnumType.values()) System.out.println("enumType: " + enumType);
        //enumType: JAVA
        //enumType: MARIADB
        //enumType: SPRING

        /**
         * 2. valueOf() : 해당 이름을 가진 열거 타입 상수 반환
         * */
        for(EnumType enumType : EnumType.values()) {
            if(enumType == EnumType.valueOf("JAVA")) {
                System.out.println("EnumType.valueOf(\"JAVA\") = " + EnumType.valueOf("JAVA"));
                System.out.println("valueOf = " + enumType);
                //EnumType.valueOf("JAVA") = JAVA
                //valueOf = JAVA
            }
        }

        /**
         *  3. ordinal() : 열거 타입의 상수의 순서를 리턴
         *  */
        for(EnumType enumType : EnumType.values()) {
            System.out.println("ordinal = " + enumType.ordinal());
        }
        //ordinal = 0
        //ordinal = 1
        //ordinal = 2

        System.out.println("=====> " + EnumType.JAVA);
        System.out.println("=====> " + EnumType.JAVA.ordinal());
        //=====> JAVA
        //=====> 0

        /**
         * 4. name() : 열거 타입의 문자열 리턴
         */
        System.out.println("name : " + EnumType.MARIADB.name());
        //name : MARIADB
        System.out.println("name : " + EnumType.MARIADB.name().toString());
        //name : MARIADB

        /**
         * EnumType.valueOf("JAVA")는 EnumType으로 반환
         * EnumType.JAVA는 EnumType으로 반환
         * EnumType.JAVA.name(), EnumType.JAVA.toString()은 String타입으로 반환
         */

    }
}


