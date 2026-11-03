package ohgiraffers.section05.calendar;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Application2 {
    public static void main(String[] args) {

        /* Calendar 클래스 사용 */

        /* 1. getInstance() static 메소드 이용 */
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

        /* 2. GregorianCalendar 이용하는 방법 */
        Calendar gregorianCalendar = new GregorianCalendar();
        System.out.println(gregorianCalendar);

        /* 2-2. 년, 월, 일, 시, 분, 초 정보를 이용해서 인스턴스 생성 */
        int year = 2026;
        int month = 10; // 월은 0~11 11월은 10
        int dayOfMonth = 2;
        int hour = 17;
        int minute = 29;
        int second = 49;

        Calendar calendar1 = new GregorianCalendar(year, month, dayOfMonth, hour, minute, second);
        System.out.println(calendar1);


        /*
         * 상황에 따라 특정 일자를 기준으로 한 Date타입의 인스턴스가 필요한 경우도 있다.
         * 먼저 GregorianCalendar를 이용해서 특정 날짜/시간 정보로 인스턴스를 생성한 후
         * 1970년 1월 1일 0시 0분 0초를 기준으로 지난 시간을 millisecond로 계산해서
         * long형으로 반환하는 메소드가 있다.
         * */
        System.out.println(calendar1.getTimeInMillis());
        //1793608189000
        Date date = new Date(calendar1.getTimeInMillis());
        System.out.println(date);
        //Mon Nov 02 17:29:49 KST 2026

        /* 생성된 인스턴스의 필드 정보를 Calendar클래스에 있는 get() 메소드를 사용하여 반환 받을 수 잇다 */
        int cYear = calendar1.get(1);
        int cMonth = calendar1.get(2);
        int cDayOfMonth = calendar1.get(5);




    }
}
