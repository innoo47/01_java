package ohgiraffers.section05.time;

import java.time.*;
import java.util.TimeZone;

public class Application1 {
    public static void main(String[] args) {

        // LocalTime
        // now()    : 자신의 PC의 현재시간 기준으로 LocalTime 객체 반환
        // of()     : 매개변수로 받은 시간 기준으로 LocalTime 객체 반환
        LocalTime timeNow = LocalTime.now();
        LocalTime timeOf = LocalTime.of(9,5,53);
        System.out.println(timeNow);
        System.out.println(timeOf);
        //09:08:56.727981600
        //09:05:53

        // LocalDate
        // now()    : 자신의 PC의 현재시간 기준으로 LocalDate 객체 반환
        // of()     : 매개변수로 받은 시간 기준으로 LocalDate 객체 반환
        LocalDate dateNow = LocalDate.now();
        LocalDate dateOf = dateNow.of(2026, 11, 4);
        System.out.println(dateNow);
        System.out.println(dateOf);
        System.out.println("주소값 확인 : " + dateNow.hashCode());
        System.out.println("주소값 확인 : " + dateOf.hashCode());
        //2026-11-03
        //2026-11-04
        //주소값 확인 : 4149955
        //주소값 확인 : 4149956

        // LocalDateTime
        // now()    : 자신의 PC의 현재시간 기준으로 LocalDateTime 객체 반환
        // of()     : 매개변수로 받은 시간 기준으로 LocalDateTime 객체 반환
        LocalDateTime dateTimeNow = LocalDateTime.now();
        LocalDateTime dateTimeOf = LocalDateTime.of(dateNow, timeNow);
        System.out.println(dateTimeNow);
        System.out.println(dateTimeOf);
        //2026-11-03T09:12:04.798733400
        //2026-11-03T09:13:41.095650200

        // ZonedDateTime
        // now() : ZoneId를 매개변수로 넘겨주면 ZonedDateTime객체를 반환
        // of() : 매개변수로 java.util.TimeZone의 getAvailableIDs() 메소드가
        //        반환하는 값을 넣어 ZoneID를 반환 할 수 있다
//        String[] iDs = TimeZone.getAvailableIDs();
//        for (int i = 0; i < iDs.length; i++) {
//            System.out.println(iDs[i]);
//        }
        // Asia/Seoul 등등

        // Asia/Seoul
        ZonedDateTime zonedDateTimeNow = ZonedDateTime.now();
        ZonedDateTime zonedDateTimeOf = zonedDateTimeNow.of(dateOf, timeOf, ZoneId.of("Asia/Seoul"));
        System.out.println(zonedDateTimeNow);
        System.out.println(zonedDateTimeOf);
        //2026-11-03T09:19:05.200731500+09:00[Asia/Seoul]
        //2026-11-04T09:05:53+09:00[Asia/Seoul]





    }
}
