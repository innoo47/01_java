package com.ohgiraffers.section02.variable;

public class Application3 {
    public static void main(String[] args) {
        /* 1-1. 동일한 범위 내에서 동일한 변수명을 가질 수 없다. */
        int age = 20;
        //int age = 20; 		   //동일한 변수명을 가지므로 에러 발생함

        /* 1-2. 예약어는 사용이 불가능하다. */
        //int true = 1;			//예약어 사용 불가
        //int for = 20;			//예약어 사용 불가

        /* 1-3. 변수명은 대소문자를 구분한다. */
        int Age = 20;			//위에서 만든 age와 다른 것으로 취급한다.
        int True = 10;     //예약어 True와 다른 것으로 취급한다.

        /* 1-4. 변수명은 숫자로 시작할 수 없다. */
        //int 1age = 20;		//숫자로 시작해서 에러 발생
        int age1 = 20;			//숫자가 처음에 시작하지 않으면 섞어서 사용도 가능함

        /* 1-5. 특수기호는 '-'와 '$'만 사용 가능하다. */
        //int sh@rp = 20;		//사용 가능한 특수문자 외에는 사용 불가능
        int _age = 20;				//언더스코어는 사용 가능함. 처음도 가능하고 중간이나 끝에도 가능함
        int $harp = 20;			//$도 사용 가능함. 처음도 가능하고 중간이나 끝에도 가능함

        int 안녕 = 10;            // 변수명은 한글도 가능한데 영어를 사용
        System.out.println(안녕);
    }
}
