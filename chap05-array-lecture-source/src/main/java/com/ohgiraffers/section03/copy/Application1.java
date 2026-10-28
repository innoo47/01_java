package com.ohgiraffers.section03.copy;

import java.util.Arrays;

public class Application1 {
    public static void main(String[] args) {
        /* 원본 배열 */
        int[] origin = {1, 2, 3, 4, 5};

        /* 얕은 복사 */
        int[] copy = origin;    // 주소가 같다

        System.out.println(origin.hashCode());
        System.out.println(copy.hashCode());

        System.out.println(Arrays.toString(origin));
        System.out.println(Arrays.toString(copy));

        copy[2] = 100;  // 얕은 복사는 둘 중 하나만 바뀌어도 다 바뀐다.
        System.out.println(Arrays.toString(origin));
        System.out.println(Arrays.toString(copy));

    }

    public static void test(int[] arr) {

        System.out.println("arr의 hashCode() : " + arr.hashCode());
    }
}
