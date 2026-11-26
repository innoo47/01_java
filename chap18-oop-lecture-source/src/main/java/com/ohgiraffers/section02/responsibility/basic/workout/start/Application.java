package com.ohgiraffers.section02.responsibility.basic.workout.start;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        /* 마지막 값은 1분에 쓰는 열량(kcal)이다. */
        List<Workout> workouts = new ArrayList<>();
        workouts.add(new Workout("달리기", 30, 10));
        workouts.add(new Workout("걷기", 40, 5));

        for (Workout workout : workouts) {
            // TODO 단계 2: printReport() 대신 getName()·getMinutes()·calories()로 값을 받아 여기서 세 줄을 출력한다
            System.out.println("운동: " + workout.getName());
            System.out.println("운동 시간: " + workout.getMinutes() + "분");
            System.out.println("열량: " + workout.calories() + "kcal");
        }
    }
}