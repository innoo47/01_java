package com.ohgiraffers.section03.map.run;

import java.util.*;

public class Application2 {
    public static void main(String[] args) {


        HashMap<String, String> hmap = new HashMap<String, String>();
        hmap.put("one", "java");
        hmap.put("two", "css");
        hmap.put("three", "html");
        System.out.println("hmap : " + hmap);
        //hmap : {one=java, two=css, three=html}

        /** Map 타입 순회 방법 **/
        /* 1. keySet() : key 순회 */
        Iterator<String> keyIter = hmap.keySet().iterator();
        while (keyIter.hasNext()) {
            String key = keyIter.next();
            String value = hmap.get(key);
            System.out.println("key : " + key + " / " + "value : " + value);
        }
        //key : one / value : java
        //key : two / value : css
        //key : three / value : html

        // 향상된 for문도 당연히 가능
        for(String key : hmap.keySet()) {
            String value = hmap.get(key);
            System.out.println("key : " + key + " / " + "value : " + value);
        }
        //key : one / value : java
        //key : two / value : css
        //key : three / value : html


        /* 2. values() : value 순회 */
        Collection<String> values = hmap.values();
        Iterator<String> iterator = values.iterator();
        while (iterator.hasNext()) {
            String value = iterator.next();
            System.out.println("value : " + value);
        }
        //value : java
        //value : css
        //value : html

        for(String value : hmap.values()) {
            System.out.println("value : " + value);
        }
        //value : java
        //value : css
        //value : html

        /* 3. entrySet() : key와 value를 동시에 가져오기 */
        Set<Map.Entry<String, String>> entries = hmap.entrySet();
        Iterator<Map.Entry<String, String>> iterator1 = entries.iterator();
        while (iterator1.hasNext()) {
            Map.Entry<String, String> entry = iterator1.next();
            System.out.println("key : " + entry.getKey() + " / " + "value : " + entry.getValue());
        }
        //key : one / value : java
        //key : two / value : css
        //key : three / value : html

        for(Map.Entry<String, String> entry : entries) {
            System.out.println("key : " + entry.getKey() + " / " + "value : " + entry.getValue());
        }
        //key : one / value : java
        //key : two / value : css
        //key : three / value : html

    }
}
