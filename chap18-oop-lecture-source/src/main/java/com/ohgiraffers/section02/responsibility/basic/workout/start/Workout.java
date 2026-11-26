package com.ohgiraffers.section02.responsibility.basic.workout.start;

/* 운동 기록 하나를 나타내는 클래스다. */
public class Workout {

    private String name;
    private int minutes;
    // 1분에 쓰는 열량(kcal)이다.
    private int caloriesPerMinute;

    public Workout(String name, int minutes, int caloriesPerMinute) {
        this.name = name;
        this.minutes = minutes;
        this.caloriesPerMinute = caloriesPerMinute;
    }

    public String getName() {
        return name;
    }

    public int getMinutes() {
        return minutes;
    }

    // TODO 단계 1: 소모 열량(minutes * caloriesPerMinute)을 돌려주는 int calories() 메소드를 만든다
    public int calories() {
        return minutes * caloriesPerMinute;
    }

    // TODO 단계 3: 쓰는 곳이 없는 printReport()를 지운다

}