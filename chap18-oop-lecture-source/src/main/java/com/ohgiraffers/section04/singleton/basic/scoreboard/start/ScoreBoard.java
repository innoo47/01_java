package com.ohgiraffers.section04.singleton.basic.scoreboard.start;

public enum ScoreBoard {

    INSTANCE;

    private int total;

    public void add(int point) {
        total = total + point;
    }

    public int getTotal() {
        return total;
    }

}
