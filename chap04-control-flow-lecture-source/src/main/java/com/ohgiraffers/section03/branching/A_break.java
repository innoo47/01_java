package com.ohgiraffers.section03.branching;

public class A_break {
    public void testSimpleBreakStatement() {
        int sum = 0;
        int i = 1;

        while (true) {
            sum += i++;
            /* 중단 조건 */
            if (i > 1000) break;
        }
        System.out.println("sum = " + sum);
    }

    public void testSimpleBreakStatement2() {
        for (int dan = 2; dan <= 9; dan++) {
//            if (dan == 4) break;
            System.out.println("===== " + dan + "단 =====");
            for (int su = 1; su <= 9; su++) {
                if (dan > 6) break; // 가장 가까운 반복문 탈출
                System.out.println(dan + " * " + su + " = " + (dan * su));
            }
            System.out.println();
        }
    }

    public void testJumpBreak() {
        // 초기식도 없고, 조건식도 없고, 증감식도 없다

        label:
        for (; ; ) {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                if (i == 3) break label;
                // 라벨을 사용하여 가까운 반복문을 탈출하는 것이 아닌 label이 붙은 반복문을 탈출
            }
        }
    }


}
