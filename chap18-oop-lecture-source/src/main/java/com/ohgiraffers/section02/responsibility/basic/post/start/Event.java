package com.ohgiraffers.section02.responsibility.basic.post.start;

/* Post를 물려받은 행사 글 클래스다. */
public class Event extends Post {

    // TODO 단계 1: Post와 겹치는 필드 title, 그 필드에 값을 넣는 줄, getTitle()을 지운다

    public Event(String title) {
        super(title);
    }

    @Override
    public String getLabel() {
        return "행사";
    }
}