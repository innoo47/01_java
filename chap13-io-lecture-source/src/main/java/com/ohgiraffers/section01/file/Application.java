package com.ohgiraffers.section01.file;

import java.io.File;
import java.io.IOException;

public class Application {
    public static void main(String[] args) {
        /**
         * JDK 1.0부터 지원하는 API로 파일 처리를 수행하는 대표적인 클래스
         */

        File file = new File("src/main/java/com/ohgiraffers/section01/file/test.txt");
        try {
            /* 파일 생성 후 성공/실패 여부를 boolean으로 리턴(생성 되면 true) */
            boolean createSuccess =  file.createNewFile();

            /**
             *  최초 실행하면 새롭게 파일이 만들어지기 때문에 true를 반환한다
             *  파일이 한 번 생성되고 닌 이후에는 새롭게 파일을 만들지 않기 때문에 false를 반환
             */
            System.out.println(createSuccess);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("파일의 크기 : " + file.length() + "byte");
        System.out.println("파일의 경로 : " + file.getPath());
        System.out.println("현재 파일의 상위 경로 : " + file.getParent());
        System.out.println("파일의 절대경로 : " + file.getAbsolutePath());

        String path = "~/Users/inho/Desktop/Dev/DevTest";
        File filePath = new File(path); // 파일 객체 생성

        /* 폴더의 생성여부를 exists() 메소드를 이용해서 판별 */
        System.out.println("filePath.exists() : " + filePath.exists());

        boolean mkdirs = filePath.mkdirs();
        System.out.println("mkdirs : " + mkdirs);

    }
}
