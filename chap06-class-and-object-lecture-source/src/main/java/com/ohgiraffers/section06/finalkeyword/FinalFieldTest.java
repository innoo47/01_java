package com.ohgiraffers.section06.finalkeyword;

public class FinalFieldTest {

    /**
     * final 키워드를 사용할 수 있는 위치는 다양하다
     * 1. 지역변수 : 초기화 이후 값 변경 불가
     * 2. 매개변수 : 호출 시 전달한 값 변경 불가
     * 3. 인스턴스 변수 : 인스턴스 생성 초기화 이후엔 값 변경 불가
     * 4. 클래스 변수(static) : 프로그램 시작 이후 값 변경 불가
     * 5. non-static method : 메소드 재작성(오버라이딩) 불가
     * 6. static method : 메소드 재작성(오버라이딩) 불가
     * 7. 클래스 : 상속 불가
     */

    /* 1 */
    public void test() {
        final int i = 0;
    }

    /* 2 */
    public void user(final char gender) {
//        gender = 'm';
    }

    /* 3 */
//    private final int NON_STATIC_NUM;   // 전역 변수, 필드 변수
    private final int NON_STATIC_NUM = 1;   // 초기화 해야한다

    private final String NON_STATIC_NAME;
    public FinalFieldTest(String NON_STATIC_NAME) {
        this.NON_STATIC_NAME = NON_STATIC_NAME;
    }   // 생성자 -> 객체 생성 될 때 필드나 그 이외 특정 작업 필요하면 처리해 수행

    /* 4. static field에 final 사용할 경우 */
    private static final String STATIC_NAME;    // 비워놓으면 안됨
    /* static field는 생성자 초기화는 불가능하며 static 초기화 블럭을 활용할 수 있다 */
    static  {
        STATIC_NAME = "static";
    }

    // static final 순서 상관 x
    // 다만 주로 static final로 작성한다
    public static final int MAX = 100;
    public final static int MIN = 1;
    


}
