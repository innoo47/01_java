package com.ohgiraffers.section01.array;

public class Application1 {
    public static void main(String[] args) {
        /**
         * 배열의 선언 및 할당
         * 자료형[] 배열명 = new 자료형[방의 크기];
         *
         */

        int[] arr = new int[5];
        /* 하나의 이름을 관리되는 연속 된 메모리 공간이며, 해당 공간에 접근시에는 인덱스를 사용한다 */
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        /**
         * 인덱스를 반복문으로 처리할 수 있다
         *
         * 반복문 사용
         * 초기값 : 0
         * 조건식 : 배열의 인덱스 크기만큼 > 배열의 길이 length 필드변수를 이용하면 배열의 길이를 알 수 있다
         *         배열의 길이와 인덱스는 항상 -1씩 차이가 난다
         *         마지막 인덱스의 값은 4
         * 반복할 내용
         */

        for (int i = 0, value = 0; i < arr.length; i++) {
            arr[i] = value += 10;
            System.out.println(arr[i]);
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];  // sum = sum + arr[i];
        }
        System.out.println("sum = " + sum);

        /**
         * 향상된 for문
         *
         * for(한 번의 반복문에서 사용될 변수: 반복을 수행 할 배열) {}
         *
         * 배열 인덱스레 담긴 값을 꺼내 int i 라는 변수로 옮겨 담아서 사용하는 맥락이므로
         * i 변수에 값을 대입하더라도 배열 인덱스의 값은 변경되지 않는다.
         * 따라서 배열 인덱스의 값을 변경하고자 할 때는 사용 할 수 없다.
         */
        for (int i : arr) {
            System.out.println(i);
            i = 0;
        }

        for (int j : arr) {
            System.out.println("j = " + j);
        }

    }
}
