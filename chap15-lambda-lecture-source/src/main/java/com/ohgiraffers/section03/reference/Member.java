package com.ohgiraffers.section03.reference;

public class Member {

    private String id;

    public Member(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "[" +
                "id='" + id + '\'' +
                ']';
    }
}
