package com.ohgiraffers.section02.variable;

public class Application4 {
    public static void main(String[] args) {
        /* 2-1. 변수명의 길이 제한은 없다. */
        int sadjfsadkjhfkjsadhfkjhsafkjhsdfjkhsafkjhsdjkfhsdajkfhdsakjfhsdakjfhasdjkfhsdafkjhfsdakj;

        /* 2-2. 변수명이 합성어로 이루어진 경우 첫 단어는 소문자, 두 번째 시작 단어는 대문자로 시작한다. */
        /* 자바에서는 클래스명만 유일하게 대문자로 시작한다. */
        int maxAge = 20;
        int minAge = 10;

        /* 2-3. 단어와 단어 사이의 연결을 언더스코어(_)로 하지 않는다. */
        String user_name;			//에러가 발생하지 않지만 이렇게 하면 안된다.
        String userName;			  //이게 올바른 표현이다.

        /* 2-4. 한글로 변수명을 짓는 것이 가능하지만, 권장하지 않는다. */
        int 나이;						  //가능하지만 권장하지 않음

        /* 2-5. 변수 안에 저장된 값이 어떤 의미를 가지는지 명확하게 표현하도록 한다. */
        String s;					    //변수가 어떤 의미인지 파악하기 힘들다.
        String name;				    //문자열 형태의 이름이 저장되겠구나 하는 의도가 파악이 된다.

        /* 2-6. 전형적인 변수 이름이 있다면 가급적 사용하도록 한다. */
        int sum = 0;
        int max = 10;
        int min = 0;
        int count = 1;

        /* 2-7. 명사형으로 작성할 수 있도록 한다. */
        String goHome;				    //가능하긴 하지만 가급적 명사형으로 짓는다.
        String home;

        /* 2-8. boolean 형은 의문문으로 가급적 긍정형태로 네이밍한다. */
        boolean isAlive = true;
        boolean isDead = false;	//부정형보다는 긍정형이 더 나은 방식이다.
    }
}
