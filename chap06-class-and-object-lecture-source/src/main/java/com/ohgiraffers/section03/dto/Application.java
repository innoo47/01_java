package com.ohgiraffers.section03.dto;

import com.ohgiraffers.section01.user_type.Member;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        MemberDto memberDto = new MemberDto();
        memberDto.setNumber(1);
        memberDto.setName("홍길동");
        memberDto.setAge(20);
        memberDto.setGender('남');
        memberDto.setHeight(185.3);
        memberDto.setWeight(75.3);
        memberDto.setActivated(true);

        System.out.println(memberDto.getNumber());
        System.out.println(memberDto.getName());
        System.out.println(memberDto.getAge());
        System.out.println(memberDto.getGender());
        System.out.println(memberDto.getHeight());
        System.out.println(memberDto.getWeight());
        System.out.println(memberDto.isActivated());

        testMethod1(memberDto);
        MemberDto memberDto1 = getMemberDto(memberDto);
        System.out.println(memberDto1.getNumber());

        System.out.println("===== login =====");
        /**
         * 1. 아이디와 비밀번호를 사용자에게 입력 받는다
         * 2. 입력한 아이디와 비밀번호가 일치하면 "로그인 성공"이라는 문구를 출력
         * 3. 입력한 아이디와 비밀번호가 일치하지 않으면 "아이디 또는 비밀번호를 확인해주세요"라는 문구를 출력
         */
        UserService userService = new UserService();
        Scanner sc = new Scanner(System.in);


        System.out.print("아이디를 입력하세요 : ");
        String id = sc.nextLine();
        System.out.print("비밀번호를 입력하세요 : ");
        String pwd = sc.nextLine();

        LoginDto loginDto = new LoginDto();
        loginDto.setId(id);
        loginDto.setPwd(pwd);

        // 로그인 기능 실행
        System.out.println(userService.login(loginDto));



    }

    public static void testMethod1(MemberDto memberDto)    {
        System.out.println(memberDto.getNumber());
    }

    public static MemberDto getMemberDto(MemberDto memberDto)    {
        memberDto.setNumber(999);
        return memberDto;
    }
}
