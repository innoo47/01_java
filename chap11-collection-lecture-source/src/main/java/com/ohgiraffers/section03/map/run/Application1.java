package com.ohgiraffers.section03.map.run;

import java.util.Date;
import java.util.HashMap;

public class Application1 {
    public static void main(String[] args) {

        /**
         * HashMap
         */
        HashMap hmap = new HashMap();
        hmap.put("one", new Date());
        hmap.put(12, "red apple");
        hmap.put(33, 123);

        System.out.println("hmap : " + hmap);
        //hmap : {33=123, one=Wed Nov 04 10:18:00 KST 2026, 12=red apple}
        hmap.put(12, "yellow apple");   // Map객체에 값을 추가(수정)을 할 때 put() 메소드 사용
                                        // 기존에 있는 key값에 다른 값을 넣으면 value가 업데이트 된다
        System.out.println("hmap : " + hmap);
        //hmap : {33=123, one=Wed Nov 04 10:21:09 KST 2026, 12=yellow apple}
        hmap.put(11,"yellow apple");            // key값만 다르면 value는 동일해도 상관없다
        System.out.println("hmap : " + hmap);
        //hmap : {33=123, one=Wed Nov 04 10:22:50 KST 2026, 11=yellow apple, 12=yellow apple}

        /** map에 담겨져있는 value를 가져오기 : get(key) **/
        System.out.println("=======> " + hmap.get(13)); // 없으면 null
        //=======> null
        System.out.println("=======> " + hmap.get(12));
        //=======> yellow apple

        /** key값을 이용해서 삭제한다 : remove(key) **/
        hmap.remove(11);
        System.out.println("hmap : " + hmap);
        //hmap : {33=123, one=Wed Nov 04 10:27:20 KST 2026, 12=yellow apple}

    }
}
