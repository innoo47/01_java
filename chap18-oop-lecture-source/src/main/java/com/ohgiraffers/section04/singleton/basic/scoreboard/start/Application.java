package com.ohgiraffers.section04.singleton.basic.scoreboard.start;

public class Application {

    public static void main(String[] args) {

        /* 청팀과 백팀이 점수판 하나에 점수를 더한다. */
        // TODO 단계 1: 같은 패키지에 상수 INSTANCE 하나와 add·getTotal 메소드를 가진 enum ScoreBoard를 만든다
        // TODO 단계 2: OldScoreBoard.getInstance()를 부르는 줄을 Find Usages로 센다
        Team blue = new Team("청팀");
        Team white = new Team("백팀");

        blue.score(3);
        white.score(2);
        blue.score(1);

        System.out.println("전체 점수: " + ScoreBoard.INSTANCE.getTotal());
    }
}