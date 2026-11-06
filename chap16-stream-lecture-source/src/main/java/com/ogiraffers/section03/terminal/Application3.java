package com.ogiraffers.section03.terminal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Application3 {
    public static void main(String[] args) {

        /* 스트림의 최종 연산 중 하나인 collect에 대해 이해하고 사용할 수 있다. */
        /*
         * collect()는 Collector타입을 받아서 처리하는데, 해당 메소드를 통해
         * 컬렉션을 출력으로 받을 수 있다.
         * collect()메소드는 Collector객체에서 제공하는 정적 메소드를 사용할 수 있다.
         * */

        List<Member> memberList = Arrays.asList(
                new Member("test01", "홍길동"),
                new Member("test02", "유관순"),
                new Member("test03", "신사임당"),
                new Member("test04", "산사")
        );
        System.out.println("memberList = " + memberList);
        //memberList = [Member{id='test01', name='홍길동'}, Member{id='test02', name='유관순'}, Member{id='test03', name='신사임당'}, Member{id='test04', name='산사'}]



//        // 위의 memberList에서 name만 뽑아서 새로운 리스트 객체를 생성하자
//        List<String> stringList = new ArrayList<>();
//        for (Member member : memberList) {
//            stringList.add(member.getName());
//        }
//        System.out.println("stringList = " + stringList);
//        //stringList = [홍길동, 유관순, 신사임당, 산사]


        List<String> collectionList = memberList
                .stream()
                .map(Member::getName)
                .collect(Collectors.toList());          // 불변객체 x
//                .toList();                            // 불변객체

        collectionList.add("test01");
        collectionList.add("test02");
        collectionList.add("test03");

        System.out.println("collectionList = " + collectionList);
        //collectionList = [홍길동, 유관순, 신사임당, 산사, test01, test02, test03]
        // 에러


        String str = memberList
                .stream()
                .map(Member::getName)
                .collect(Collectors.joining(","));
        // concat() joining() => 문자 연결을 시키는 데 차이점은 joining은 내가 원하는 구분자를 추가할 수 있다
        String str2 = memberList
                .stream()
                .map(Member::getName)
                .collect(Collectors.joining(",", "@", "!"));
        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);
        //str = 홍길동,유관순,신사임당,산사
        //str2 = @홍길동,유관순,신사임당,산사!

    }
}
