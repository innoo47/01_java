package com.ohgiraffers.section02.responsibility.basic.post.start;

/*
 * 게시판 글 하나를 나타내는 상위 클래스다.
 * 글 종류마다 다른 것은 머리말(getLabel) 하나다.
 * summary()는 머리말과 제목을 이어 한 줄로 돌려준다.
 * */
public class Post {

    private String title;

    public Post(String title) {
        this.title = title;
    }

    // TODO 단계 2: title이 빈 글자("")이면 "제목 없음"을 돌려주게 바꾼다
    public String getTitle() {
        if(title.equals("")){
            return "제목 없음";
        }
        return title;
    }

    public String getLabel() {
        return "글";
    }

    public String summary() {
        return "[" + getLabel() + "] 「" + getTitle() + "」";
    }
}