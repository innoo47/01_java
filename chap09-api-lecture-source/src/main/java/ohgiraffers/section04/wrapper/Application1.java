package ohgiraffers.section04.wrapper;

public class Application1 {
    public static void main(String[] args) {

        /**
         * 박싱(Boxing)과 언박싱(UnBoxing)
         * 기본타입을 래퍼클래스의 인스턴스로 인스턴스화 하는것을 박싱(Boxing)이라고하며,
         * 래퍼클래스 타입의 인스턴스를 기본타입으로 변경하는 것을 언박싱(UnBoxing)이라고 한다.
         * */
        int intValue = 20;
//        Integer boxingNumber = new Integer(intValue);     // 이제 안씀
        Integer boxingNumber1 = Integer.valueOf(intValue);  // static 메소드 int -> Integer
        int unBoxingNumber1 = boxingNumber1.intValue();     // Integer -> int

        // 오토 박싱
        Integer boxingNumber2 = intValue;   // 매개변수에서 자동으로 처리하기 좋다

        // 오토 언박싱
        int unBoxingNumber2 = boxingNumber2;


        /**
         * Integer.valueOf() 메소드가 byte 범위의 숫자를 캐싱 처리하고 있어서
         * integerNum1 == integerNum2 가 true가 나올 수 있다
         */

        /**
         * int는 안되지만 Integer는 null을 받을 수 있다
         */

        int inum = 20;
        Integer integerNum1 = Integer.valueOf(20);
        Integer integerNum2 = Integer.valueOf(20);
        Integer integerNum3 = 20;
        Integer integerNum4 = 20;

        // Integer, int 값 비교
        System.out.println("int와 Integer 비교 : " + (inum == integerNum1));   // 20 == 20
        System.out.println("int와 Integer 비교 : " + (inum == integerNum3));
        //int와 Integer 비교 : true
        //int와 Integer 비교 : true

        // Integer, Integer 주소값 비교
        System.out.println("Integer와 Integer 비교 : " + (integerNum1 == integerNum2));
        //Integer와 Integer 비교 : true

        /* 인스턴스 값 비교는 항상 equals() 메소드를 사용 */
        System.out.println(integerNum1.equals(integerNum2));
        //true





    }
}
