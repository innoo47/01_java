package com.ohgiraffers.section05.parameter;

import java.util.Arrays;

public class ParameterTest {

    public void testPrimitiveTypeParameter(int num) {
        num = 10;
        System.out.println("매개변수로 전달받은 값 : " + num);
    }

    public void testPrimitiveTypeArrayParameter(int[] iArr) {
        iArr[0] = 100;
        System.out.println("매개변수로 전달받은 값 : " + Arrays.toString(iArr));
    }

    public void testClassTypeParameter(Rectangle r) {
        r.calArea();
        r.calRound();
    }

    // 가변배열 ...
    public void testVariableLengthArrayParameter(String... str) {
        System.out.println("str = " + Arrays.toString(str));
    }

//    public void testVariableLengthArrayParameter(String str2, String... str) {
//        // 가변배열은 뒤에 적기
//        System.out.println("str = " + Arrays.toString(str));
//    }

//    public void testVariableLengthArrayParameter(String... str, String str3) {
//        // 가변배열이라 언제 두번째 파라미터를 받아야 하는지 모르기 때문에 에러 발생
//        System.out.println("str = " + Arrays.toString(str));
//    }


}
