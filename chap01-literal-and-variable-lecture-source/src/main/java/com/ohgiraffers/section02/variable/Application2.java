package com.ohgiraffers.section02.variable;

public class Application2 {
    public static void main(String[] args) {
        // == 기본 자료형 ==
        // 1. 정수를 취급하는 자료형
        // 변수를 선언 [자료형 변수명]
        byte bNum;  // 1byte
        short sNum; // 2byte
        int iNum;   // 4byte (기본)
        long lNum;  // 8byte

        // 2. 실수를 취급하는 자료형
        float fNum;     // 4byte
        double dNum;    // 8byte (기본)

        // 3. 문자를 취급하는 자료형
        char ch;    // 2byte

        // 4. 논리값을 취급하는 자료형
        boolean isTrue; // 1byte

        // == 참조 자료형 ==
        // 5. 문자열을 취급하는 자료형
        String str; // 4byte
        // Java에서 대문자는 클래스 String은 클래스

        // === 자료형 별로 초기화 방법 ===
        bNum = 1;
        sNum = 2;
        iNum = 4;
        lNum = 888888L; // long형에 대입되는 값은 L을 붙인다. L은 소문자여도 된다.

        fNum = 3.14f; // 대입 연산자의 왼쪽과 오른쪽의 타입은 항상 동일해야 한다.
        // double 형으로 인식되는 실수를 float에 담을 때는 f를 붙인다.
        dNum = -3.14;

        ch = 'a';
        ch = 97;    // char는 양수는 가능 > 문자는 내부적으로 숫자로 계산된다. 그래서 양수를 넣어서 사용할 수 있다.(ASCII 코드)
                    // 받을 수 있는 만큼 0~65535

        isTrue = true;


    }
}
