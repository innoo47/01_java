package com.ohgiraffers.section02.responsibility.basic.post.start;

/* Post를 물려받은 질문 글 클래스다. 모양은 Notice와 같고 머리말이 다르다. */
public class Question extends Post {

    public Question(String title) {
        super(title);
    }

    @Override
    public String getLabel() {
        return "질문";
    }
}