package ohgiraffers.section05.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Application4 {
    public static void main(String[] args) {

        /**
         * 문자열을 Time 객체로 변경
         * 파싱
         */

        String timeNow = "14:05:10";
        String dateNow = "2026-11-03";

        LocalTime localTime = LocalTime.parse(timeNow);
        LocalDate localDate = LocalDate.parse(dateNow);
        LocalDateTime localDateTime = LocalDateTime.parse(dateNow + "T" + timeNow);

        System.out.println(localTime);
        System.out.println(localDate);
        System.out.println(localDateTime);
        //14:05:10
        //2026-11-03
        //2026-11-03T14:05:10

        dateNow = "221004";
        timeNow = "14-05-10";
        System.out.println("Pattern : "
                + localDate.parse(dateNow, DateTimeFormatter.ofPattern("yyMMdd")));
        System.out.println("Pattern : "
                + localTime.parse(timeNow, DateTimeFormatter.ofPattern("HH-mm-ss")));
        //Pattern : 2022-10-04
        //Pattern : 14:05:10

        LocalDate localDate1 = LocalDate.now();
        LocalTime localTime1 = LocalTime.now();
        String dateFormat = localDate1.format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        String timeFormat = localTime1.format(DateTimeFormatter.ofPattern("HH시 mm분"));
        System.out.println(dateFormat);
        System.out.println(timeFormat);
        //2026/11/03
        //09시 49분

        // 날짜를 비교해서 과거인지, 미래인지, 같은날인지 : isAfter, isBefore, isEqual..
        LocalDate localDate2 = LocalDate.now();
        LocalDateTime localDateTime2 = LocalDateTime.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        LocalDate past = LocalDate.of(2020, 10, 29);
        LocalDateTime future = LocalDateTime.of(2030, 10, 29, 12, 30);
        ZonedDateTime now = ZonedDateTime.now();

        System.out.println(past + "가 " + localDate2 + "보다 과거인가? " + localDate2.isAfter(past));
        System.out.println(future + "가 " + localDateTime2 + "보다 미래인가? " + localDateTime2.isBefore(future));
        System.out.println(zonedDateTime + "와 " + now + " 가 같은 날인가? " + zonedDateTime.isEqual(now));
        //2020-10-29가 2026-11-03보다 과거인가? true
        //2030-10-29T12:30가 2026-11-03T10:07:13.152187보다 미래인가? true
        //2026-11-03T10:07:13.152187+09:00[Asia/Seoul]와 2026-11-03T10:07:13.152187+09:00[Asia/Seoul] 가 같은 날인가? true

    }
}
