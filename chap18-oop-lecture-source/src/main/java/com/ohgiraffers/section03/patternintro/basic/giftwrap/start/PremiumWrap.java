package com.ohgiraffers.section03.patternintro.basic.giftwrap.start;

public class PremiumWrap implements Wrap{
    @Override
    public String label() {
        return "고급 포장";
    }

    @Override
    public int fee() {
        return 3000;
    }
}
