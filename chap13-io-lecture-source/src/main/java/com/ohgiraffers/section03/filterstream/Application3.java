package com.ohgiraffers.section03.filterstream;

import java.io.*;

public class Application3 {
    public static void main(String[] args) {

        /**
         * 외부 데이터로 부터 읽어오는 데이터를 바이트형 정수, 문자, 문자열로만 읽어오면
         * 여러 데이터 타입을 취급하는 경우 별도로 처리를 해줘야한다
         * 예) 정수 입력받아 처리하려먼 parsing을 해줘야 한다
         * "1" ========> 1 : parsing
         */

        DataOutputStream dos = null;

        try {
            dos = new DataOutputStream(new FileOutputStream("src/main/java/com/ohgiraffers/section03/filterstream/score.txt"));

            dos.writeUTF("홍길동");
            dos.writeInt(95);
            dos.writeChar('A');

            dos.writeUTF("이순신");
            dos.writeInt(85);
            dos.writeChar('B');

            dos.writeUTF("김철수");
            dos.writeInt(65);
            dos.writeChar('C');

            dos.writeUTF("신사임당");
            dos.writeInt(100);
            dos.writeChar('A');


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (dos != null) {
                try {
                    dos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        System.out.println("============================================================");

        try (DataInputStream din = new DataInputStream(new FileInputStream(
                "src/main/java/com/ohgiraffers/section03/filterstream/score.txt"))) {
            while (true) {
                // 파일에 기록한 순서대로 읽어들여야한다
                System.out.println(din.readUTF() + ", " + din.readInt() + ", " + din.readChar());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (EOFException e) {
            System.out.println("파일 읽기 완료");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
