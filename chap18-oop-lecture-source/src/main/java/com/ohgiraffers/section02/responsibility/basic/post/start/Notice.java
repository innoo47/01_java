package com.ohgiraffers.section02.responsibility.basic.post.start;

/* Post를 물려받은 공지 글 클래스다. 머리말만 다시 정의한다. */
public class Notice extends Post {

    public Notice(String title) {
        super(title);
    }

    @Override
    public String getLabel() {
        return "공지";
    }
}