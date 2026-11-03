package ohgiraffers.section05.calendar;

import java.util.Date;

public class Application1 {
    public static void main(String[] args) {

        /* java.util.Date 클래스 */

        /* 1. 기본생성자 */
        Date today = new Date();
        System.out.println(today);
        //Mon Nov 02 17:13:54 KST 2026

        System.out.println(today.getTime());
        // 1970년 1월 1일 0시 0분 0초 이후 지난 시간을 ms(밀리세컨드)로 계산해서 long타입으로 반환
        //1793607253583

        /* 2. 매개변수있는 생성자 Date(long date) */
        Date time = new Date(100000L);
        System.out.println(time);
        //Thu Jan 01 09:01:40 KST 1970
    }
}
