package ohgiraffers.section05.time;

import java.time.LocalDateTime;

public class Application3 {
    public static void main(String[] args) {

        /**
         *  time 패키지의 클래스들은 불변의 특징을 가지고 있다
         *  객체가 가진 년, 월, 일, 시, 분, 초 등을 변경하게 되면 새로운 객체가 생성되어 반환되므로
         *  주소값은 같지 않다
         */
        LocalDateTime dateTimeNow = LocalDateTime.now();
        LocalDateTime localDateTimeNow1 = dateTimeNow.plusMinutes(30);
        LocalDateTime localDateTimeNow2 = dateTimeNow.plusDays(1);
        LocalDateTime localDateTimeNow3 = dateTimeNow.plusYears(20);

        System.out.println(dateTimeNow);
        System.out.println(localDateTimeNow1);
        System.out.println(localDateTimeNow2);
        System.out.println(localDateTimeNow3);
        //2026-11-03T09:37:31.397936
        //2026-11-03T10:07:31.397936
        //2026-11-04T09:37:31.397936
        //2046-11-03T09:37:31.397936
        System.out.println();
        System.out.println(dateTimeNow == localDateTimeNow1);
        System.out.println(dateTimeNow == localDateTimeNow2);
        System.out.println(dateTimeNow == localDateTimeNow3);
        //false
        //false
        //false
        //불변객체
    }
}
