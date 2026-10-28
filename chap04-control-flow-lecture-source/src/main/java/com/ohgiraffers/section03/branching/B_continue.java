package com.ohgiraffers.section03.branching;

public class B_continue {

    public void testSimpleContinueStatement1() {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) continue;
            System.out.println(i);
        }
    }

    public void testSimpleContinueStatement2() {
        /* 4의 배수이면서 5의 배수인 값 출력 */
        for (int i = 1; i <= 100; i++) {
            if (i % 4 == 0 || i % 5 != 0) continue;
            System.out.println(i);
        }
    }

    /**
     * 중첩 반복문 내 continue사용에 대한 흐름
     * continue는 모든 반복문을 뛰어 넘는 것이 아니라 가장 인접한 반봅문의 실행만 건너 뛴다
     */
    public void testSimpleContinueStatement3() {
        for (int dan = 2; dan <= 9; dan++) {
            System.out.println("===== " + dan + "단 =====");
            for (int su = 1; su <= 9; su++) {
                if (su % 2 == 0) continue;  // 1,3,5,7,9만 출력
                System.out.println(dan + " * " + su + " = " + (dan * su));
            }
            System.out.println();
        }
    }

    public void testJumpContinue() {

        label:
        for (int dan = 2; dan <= 9; dan++) {
            System.out.println("===== " + dan + "단 =====");
            for (int su = 1; su <= 9; su++) {
                if (su % 2 == 0) continue label;
                System.out.println(dan + " * " + su + " = " + (dan * su));
            }
            System.out.println();
        }
    }
}
