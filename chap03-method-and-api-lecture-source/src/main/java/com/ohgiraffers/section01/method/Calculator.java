package com.ohgiraffers.section01.method;
// 두 수를 입력받아 더하고, 빼고, 최대값, 최소값을 반환하는 클래스
public class Calculator {

    /**
     * 두 수를 입력받아 합을 리턴
     * @param first     숫자1
     * @param second    숫자2
     * @return  숫자1과 숫자2의 합
     */
    public int plusTwoNumbers(int first, int second) {
        return first + second;
    }

    public int subTwoNumbers(int first, int second) {
        return first - second;
    }

    public static int minNumberOf(int first, int second) {
        return (first > second) ? second : first;
    }

    public static int maxNumberOf(int first, int second) {
        return (first > second) ? first : second;
    }

}
