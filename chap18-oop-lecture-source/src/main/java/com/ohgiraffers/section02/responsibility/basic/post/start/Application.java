package com.ohgiraffers.section02.responsibility.basic.post.start;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        /*
         * 세 글 종류는 모두 Post를 물려받았으므로 List<Post>에 함께 담는다.
         * new Notice("")처럼 빈 글자를 넘기면 제목이 비어 있는 글이다.
         * */
        List<Post> posts = new ArrayList<>();
        posts.add(new Notice("서버 점검 안내"));
        posts.add(new Notice(""));
        posts.add(new Question(""));
        posts.add(new Event(""));

        for (Post post : posts) {
            System.out.println(post.summary());
        }
    }
}