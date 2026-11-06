package com.ohgiraffers.section03.reference;

import java.lang.constant.DynamicCallSiteDesc;
import java.util.List;
import java.util.function.Function;

public class Application2 {
    public static void main(String[] args) {

        Function<String, Member> function = Member::new;

        Member member1 = function.apply("user01");
        Member member2 = function.apply("user02");

        System.out.println(member1);
        System.out.println(member2);
        //[id='user01']
        //[id='user02']

        System.out.println("=======================================");
        List<String> memberIds = List.of("user01", "user02", "user03");
        List<Member> members = memberIds.stream().map(Member::new).toList();
        members.forEach(System.out::println);
        //[id='user01']
        //[id='user02']
        //[id='user03']



    }
}
