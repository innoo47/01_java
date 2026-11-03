package ohgiraffers.section05.time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;

public class Application2 {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        System.out.println("시 : " + localTime.getHour());
        System.out.println("분 : " + localTime.getMinute());
        System.out.println("초 : " + localTime.getSecond());
        //09:24:10.850919100
        //시 : 9
        //분 : 25
        //초 : 2

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println("일년 중 몇번째 일 : " + localDate.getDayOfYear());
        System.out.println("월 중 몇번째 일 : " + localDate.getDayOfMonth());
        System.out.println("월(영어) : " + localDate.getMonth());
        System.out.println("월 : " + localDate.getMonthValue());
        //2026-11-03
        //일년 중 몇번째 일 : 307
        //월 중 몇번째 일 : 3
        //월(영어) : NOVEMBER
        //월 : 11

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);
        System.out.println("UTC와 시차 : " + zonedDateTime.getOffset());
        System.out.println("zone의 정보 : " + zonedDateTime.getZone());
        //2026-11-03T09:30:58.098822400+09:00[Asia/Seoul]
        //UTC와 시차 : +09:00
    }
}
