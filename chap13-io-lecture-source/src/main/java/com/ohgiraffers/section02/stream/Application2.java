package com.ohgiraffers.section02.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application2 {
    public static void main(String[] args) {

        /*
         * FileReader
         * FileInputStream과 사용하는 방법이 거의 동일하다.
         * 단, byte단위가 아닌 character 단위로 읽어들이는 부분이 차이점이다.
         * 따라서 2바이트이던 3바이트이던 글자단위로 읽어오기 때문에 한글을 정상적으로 읽어올 수 있다.
         * */

        FileReader fr = null;
        try {
            fr = new FileReader("src/main/java/com/ohgiraffers/section02/stream/testReader.txt");

//            int value;
//            while((value = fr.read()) != -1) {
//                System.out.print((char)value);
//            }

            int size = (int) new File("src/main/java/com/ohgiraffers/section02/stream/testReader.txt").length();
            // int로 다운캐스팅 한 이유 : length()가 long타입이기 때문에
            System.out.println("size: " + size);

            char[] buffer = new char[size]; // 문자열 배열
            fr.read(buffer);

            for (int i = 0; i < buffer.length; i++) {
                System.out.print(buffer[i]);
            }
            //size: 27
            //hello월드 안녕하세요


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
