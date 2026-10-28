package com.ohgiraffers.section01.literal;

public class Application2 {
    public static void main(String[] args) {

        System.out.println("===== 문자 형태의 값 출력 =====");
        System.out.println('a');			     //문자 형태의 값은 홑따옴표(single-quotation)으로 감싸주어야 한다.
        //        System.out.println('ab');			   //두 개 이상은 문자로 취급하지 않기 때문에 에러가 발생한다.
        //        System.out.println('');			     //아무 문자도 기록되지 않는 경우도 에러가 발생한다.
        System.out.println('1');			     //숫자 값 이지만 홑따옴표로 감싸져 있는 경우 문자 '1'이라고 판단한다.

        System.out.println("===== 문자열 형태의 값 출력 =====");
        System.out.println("안녕하세요");		//문자열은 문자 여러 개가 나열된 형태를 말하며 쌍따옴표(double-quotation)으로 감싸주어야 한다.
        System.out.println("123");			    //정수 이지만 쌍따옴표로 감싸져있기 때문에 문자열로 보아야 한다.
        //        System.out.println("");				      //아무 값도 없는 빈 쌍따옴표도 문자열로 취급한다.
        System.out.println("a");			      //한 개의 문자도 쌍따옴표로 감싸면 문자열이다. (문자 a와는 다르다)

        System.out.println("===== 정수와 정수의 연산 =====");
        System.out.println(123 + 456);
        System.out.println(123 - 23);
        System.out.println(123 * 10);
        System.out.println(123 / 10);
        System.out.println(123 % 10);

        System.out.println("===== 실수와 실수의 연산 =====");
        System.out.println(1.23 + 1.23);
        System.out.println(1.23 - 0.23);
        System.out.println(1.23 * 10.0);
        System.out.println(1.23 / 10.0);
        System.out.println(1.23 % 1.0);			//약간의 오차가 생긴다

        System.out.println("===== 정수와 실수의 연산 =====");
        System.out.println(123 + 0.5);
        System.out.println(123 - 0.5);
        System.out.println(123 * 0.5);
        System.out.println(123 / 0.5);
        System.out.println(123 % 0.5);
        System.out.println("정수와 실수의 연산은 항상 실수로 나온다");

        System.out.println("===== 문자와 문자의 연산 =====");
        System.out.println('a' + 'b');
        System.out.println('a' - 'b');
        System.out.println('a' * 'b');
        System.out.println('a' / 'b');
        System.out.println('a' % 'b');

        System.out.println("===== 문자와 정수의 연산 =====");
        System.out.println('a' + 1);
        System.out.println('a' - 1);
        System.out.println('a' * 2);
        System.out.println('a' / 2);
        System.out.println('a' % 2);

        System.out.println("===== 문자와 실수의 연산 =====");
        System.out.println('a' + 1.0);
        System.out.println('a' - 1.0);
        System.out.println('a' * 2.0);
        System.out.println('a' / 2.0);
        System.out.println('a' % 2.0);

        System.out.println("===== 문자열와 문자열의 연산 =====");
        System.out.println("hello " + "world");
        //System.out.println("hello" - "world");			//에러 발생
        //System.out.println("hello" * "world");			//에러 발생
        //System.out.println("hello" / "world");			//에러 발생
        //System.out.println("hello" % "world");			//에러 발생

        System.out.println("===== 문자열와 다른 리터럴의 연산 =====");
        System.out.println("helloworld" + 123);
        System.out.println("helloworld" + 123.456);
        System.out.println("helloworld" + 'a');
        System.out.println("helloworld" + true);
        System.out.println("123" + "456");
        System.out.println(9+9+"9");
        System.out.println("문자열로 출력");

        // 논리연산은 모든 사칙연산이 안된다.
        // 논리값과 문자열의 + 연산만 사용가능하다.
        System.out.println("=======================================================");
        System.out.println(9 + 9);    // 18 정수
        System.out.println("9" + 9);  // 문자열 99
        System.out.println(9 + "9");  // 문자열 99
        System.out.println("9" + "9"); // 문자열 99
        System.out.println("=======================================================");
        System.out.println(9 + 9 + "9"); //  18 + "9" > 189
        System.out.println(9 + "9" + 9); // 999
        System.out.println("" + 9 + 9);  // "" + 9 > "9" + 9 > 99 (형변환)
        System.out.println("9" +(9 + 9));  // 918

        System.out.println("============== 10과 20의 사칙연산 결과");
        System.out.println(10 + 20);
        System.out.println(10 - 20);
        System.out.println(10 * 20);
        System.out.println(10 / 20);
        System.out.println(10 % 20);

        System.out.println("============== 10과 20의 사칙연산 결과");
        System.out.println("10과 20의합 : " + (10 + 20));
        System.out.println("10과 20의차 : " + (10 - 20));
        System.out.println("10과 20의곱 : " + (10 * 20));
        System.out.println("10과 20의 나누기 한 몫 : " + (10 / 20));
        System.out.println("10과 20의 나누기한 나머지 : " + (10 % 20));


    }
}
