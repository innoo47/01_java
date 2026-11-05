package com.ohgiraffers.section01.file;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ExamClass {
    public static void main(String[] args) {

        /**
         * 경로 : src/main/java/com/ohgiraffers/section01
         */

        /* 저장할 폴더를 생성 */
        String basePath = "src/main/java/com/ohgiraffers/section01/logs/app";

        File baseFolder = new File(basePath);   // 생성할 폴더 객체
        boolean mkdirs = false;
        if (!baseFolder.exists()) {               // 해당 폴더가 생성 되어있는지 여부를 확인
            // 폴더가 없으면 폴더 생성
            mkdirs = baseFolder.mkdir();         // 폴더 생성
        }
        System.out.println("mkdirs: " + mkdirs);

        /* 파일 이름 생성 */
        // 년도월일시분초
        String today = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
        String fileName = today + ".txt";
        // src/main/java/com/ohgiraffers/section01/logs/app/20261105.txt

        /* 파일 생성 */
        File todayFile = new File(basePath + "\\" + fileName);

        try {
            boolean newFile = todayFile.createNewFile();
            System.out.println("newFile: " + newFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // 현재 경로, 상위폴더 경로, 파일의 사이즈 ...
        System.out.println("1. 현재 파일 경로 : " + todayFile.getPath());
        System.out.println("2. 파일의 상위 폴더 경로 : " + todayFile.getParent());
        System.out.println("3. 파일의 크기 : " + todayFile.length());
        //mkdirs: false
        //newFile: false
        //1. 현재 파일 경로 : src\main\java\com\ohgiraffers\section01\logs\app\20261105.txt
        //2. 파일의 상위 폴더 경로 : src\main\java\com\ohgiraffers\section01\logs\app
        //3. 파일의 크기 : 0

    }
}
