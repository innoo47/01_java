package com.ohgiraffers.section04.singleton.basic.scoreboard.start;

public class Team {

    private String name;

    public Team(String name) {
        this.name = name;
    }

    public void score(int point) {
        // TODO 단계 3: Team과 Application의 OldScoreBoard.getInstance()를 ScoreBoard.INSTANCE로 바꾼다
        ScoreBoard.INSTANCE.add(point);
        System.out.println(name + " " + point + "점");
    }
}