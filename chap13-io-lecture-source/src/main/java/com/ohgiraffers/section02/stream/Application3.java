package com.ohgiraffers.section02.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Application3 {
    public static void main(String[] args) {

        /**
         * FileOutputStream
         * 프로그램의 데이터를 파일로 내보내기 위한 용도의 스트림이다
         * 1byte 단위로 데이터를 처리한다
         */

        /**
         * 파일 등록 2가지
         *
         * 1. 덮어쓰기
         * 2. 이어 붙이기
         *
         * boolean append가
         * false(디폴트값)면 덮어쓰기
         * true면 이어붙이기
         */

        FileOutputStream fileOutputStream = null;
        try {

            /**
             * OutputStream의 경우 대상 파일이 존재하지 않으면 파일을 자동으로 생성한다
             * 기본값은 false로 초기화 시킨다
             */
            fileOutputStream = new FileOutputStream("src/main/java/com/ohgiraffers/section02/stream/testOutputStream.txt", true);
            // true를 해주면서 덮어쓰기가 아니라 이어붙이기로 설정

            // 한번씩 추가
            fileOutputStream.write(97);

            // 한번에 추가
            byte[] barr = new byte[] {98, 99, 100, 101, 102, 10, 103};  // 10은 개행문자 -> 줄 바꿔줘
            fileOutputStream.write(barr);
            fileOutputStream.write(barr, 1, 4);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }


    }
}
