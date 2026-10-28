package com.ohgiraffers.section03.copy;

import java.util.Arrays;

public class Application2 extends Object {
    public static void main(String[] args) {
        /* 깊은 복사 */

        /**
         * 얕은 복사는 서로 다른 변수가 하나의 주소값을 바라보고 있기 때문에
         * 하나의 변수에서 값을 변경하면 다른 변수에 있는 것도 같이 바뀐다
         *
         * 깊은 복사는 서로 다른 변수가 서로 다른 배열의 주소값을 참조한다.
         * 단, 값은 동일하게 가지고 있다.
         */

        /* 원본 배열 */
        int[] origin = {1, 2, 3, 4, 5};

        /* 깊은 복사 */
        /* 1. for문 */
        int[] copy1 = new int[10];
        for (int i = 0; i < origin.length; i++) {
            copy1[i] = origin[i];
        }
        System.out.println("===== origin =====");
        print(origin);
        System.out.println("===== copy1 =====");
        print(copy1);

        copy1[1] = 99999;

        System.out.println("===== origin =====");
        print(origin);
        System.out.println("===== copy1 =====");
        print(copy1);

        /* 2. Object의 clone 메소드 */
        // 동일한 길이, 동일한 값을 가진 배열의 복제본이 생성
        int[] copy2 = origin.clone();
        System.out.println("===== copy2 =====");
        print(copy2);

        /* 3. System의 arraycopy 메소드 */
        // arraycopy(원본배열, 복사를 시작할 인덱스, 복사본배열, 복사를 시작할 인덱스, 복사할 길이)
        int[] copy3 = new int[10];  // 복사본배열
        System.arraycopy(origin, 0, copy3, 3, origin.length);
        System.out.println("===== copy3 =====");
        print(copy3);

        /* 4. Arrays의 copyOf 메소드 : 원본의 처음부터만 가능 */
        int[] copy4 = Arrays.copyOf(origin, 7);
        int[] copy5 = Arrays.copyOf(origin, 3);
        System.out.println("===== copy4 =====");
        print(copy4);
        System.out.println("===== copy5 =====");
        print(copy5);

    }

    /**
     * hashcode와 값을 출력하는 메서드
     * @param arr
     */
    public static void print(int[] arr) {
        System.out.println("hashCode() : " + arr.hashCode());
        System.out.println(Arrays.toString(arr));
    }

}
