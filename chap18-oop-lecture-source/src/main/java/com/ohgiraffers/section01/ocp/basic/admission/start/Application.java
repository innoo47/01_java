package com.ohgiraffers.section01.ocp.basic.admission.start;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        /* total은 입장료 합계를 모은다. */
        // TODO 단계 2: 배열과 반복문을 List<AgeGroup> 목록과 반복문으로 바꾼다
//        String[] visitors = {"어린이", "어른", "어린이"};

//        int total = 0;
//        for (String visitor : visitors) {
//            System.out.println(visitor + " 입장료: " + feeOf(visitor));
//            total = total + feeOf(visitor);
//        }
//        System.out.println("입장료 합계: " + total);

        List<AgeGroup> visitors = new ArrayList<>();
        visitors.add(new Child());
        visitors.add(new Adult());
        visitors.add(new Child());
        visitors.add(new Teen());

        int total = 0;
        for (AgeGroup visitor : visitors) {
            System.out.println(visitor.getName() + " 입장료: " + visitor.getFee());
            total += visitor.getFee();
        }
        System.out.println("입장료 합계: " + total);


    }

    /*
     * 연령대 이름을 글자로 비교해 입장료를 찾는 메소드다.
     * static이 붙어서 객체를 만들지 않고 main에서 바로 부를 수 있다.
     * */
    // TODO 단계 3: 이 메소드와 바로 위 설명 주석을 지운다
    public static int feeOf(String ageGroup) {

        if (ageGroup.equals("어린이")) {
            return 8000;
        } else if (ageGroup.equals("어른")) {
            return 15000;
        }
        return 0;
    }
}