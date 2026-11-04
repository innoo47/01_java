//package com.ohgiraffers.section03.uses;
//
//import java.io.*;
//
//public class Application1 {
//    public static void main(String[] args) {
//
//        /**
//         * 예외처리를 많이 사용하는 IO패키지에서 예외처리를 사용하는 구문
//         * -> 아직 IO(Input/Output)는 학습하지 않았으므로 IO문법보다는 try-catch블럭의 실제 사용과 흐름에 집중
//         */
//        BufferedReader br = null;   // 어떤 데이터를 읽을것이다
//
//        try {
//            /**
//             * FileReader 생성자에 throws
//             */
//            br = new BufferedReader(new FileReader("test.txt"));
//            String s;
//            // readLine()ㅁㅔ소드에 throws IOException이 있으므로 예외처리 강제화
//            while ((s = br.readLine()) != null) {
//                System.out.println(s);
//            }
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } finally {
//            /**
//             * 오류가 발생하거나 발생하지 않거나 무조건 동작해야 하는 구문
//             * 일반적으로
//             */
//            if (br != null) {
//                br.close();
//            }
//
//        }
//    }
//}
