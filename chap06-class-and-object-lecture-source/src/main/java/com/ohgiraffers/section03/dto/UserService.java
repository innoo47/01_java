package com.ohgiraffers.section03.dto;

public class UserService {
    /**
     * 사용자 관련된 기능 모음
     */

    /**
     * 로그인 기능
     * @param loginDto
     * @return
     */
    public String login(LoginDto loginDto) {
        // 데이터베이스가 없으니 임의의 아이디와 비밀번호를 대조한다
        String dataBaseInId = "user01";
        String dataBaseInPassword = "pass01";

        if (loginDto.getId().equals(dataBaseInId) && loginDto.getPwd().equals(dataBaseInPassword)) {
            // 문자열끼리의 비교여서 .equals()를 사용
            return "로그인 성공";

        } else {
            return "아이디 또는 비밀번호를 확인해주세요";
        }
    }
}
