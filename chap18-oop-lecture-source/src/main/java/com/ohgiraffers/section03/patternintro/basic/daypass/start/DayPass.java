package com.ohgiraffers.section03.patternintro.basic.daypass.start;

import java.util.ArrayList;

public class DayPass implements Pass {

    private String owner;

    public DayPass(String owner) {
        this.owner = owner;
    }

    public boolean use(String where) {
        System.out.println(owner + " " + where + " 입장, 1일권");
        return true;
    }
}
