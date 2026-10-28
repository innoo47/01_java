package com.ohgiraffers.section02.dimensional;

public class Application2 {
    public static void main(String[] args) {
        /**
         * 2차원 가변 배열 선언 및 할당
         */
        int[][] iarr = new int[3][];    // 가변 배열
        System.out.println(iarr);   // stack의 레퍼런스 배열의 참조 주소값
        System.out.println(iarr[0]);    // heap의 1차원 배열의 참조 주소값(현재는 null)
//        System.out.println(iarr[0][0]); // 현재는 NullPointerException 발생

        iarr[0] = new int[3];
        iarr[1] = new int[2];
        int[] arr = new int[5];
        iarr[2] = arr;

        /**
         * 가변 배열도 정변배열에서 사용한 것과 동일한 반복문으로 순회 가능
         */
        int value = 0;
        for (int i = 0; i < iarr.length; i++) {
            for (int j = 0; j < iarr[i].length; j++) {
                iarr[i][j] = value++;
                System.out.print(iarr[i][j] + " ");
            }
            System.out.println();
        }

        /**
         * 2차원 배열의 선언과 할당 및 초기화를 동시에 할 수 있다
         */
        int[] iarr3 = {1, 2, 3, 4, 5};

        /* 정변 배열 */
        int[][] iarr4 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        /* 가변 배열 */
        int[][] iarr5 = {{1, 2, 3}, {4, 5}, {7}};

        int[] arr6 = {1, 2, 3, 4, 5};
        int[] arr7 = {6, 7, 8};
        int[][] arr8 = {arr6, arr7};  // 가변 배열

    }
}
