package com.ohgiraffers.section04.racecondition;

public class SharedCounter {

    /**
     * 여러 스레드가 함께 쓰는 카운터 (공유자원)
     * - 같은 count++를 세가지 방식으로 제공 : 동기화 없음 / synchronized 메소드 / synchronized 블록
     */

    private int count = 0;

    /* 동기화 없음 */
    public void increment() {
        count++;
    }

    /* 메서드 전체를 잠금 */
    public synchronized void incrementSafe() {
        count++;
    }

    /* 필요한 부분만 잠근다 */
    public void incrementBlock() {
        synchronized (this) {
            count++;
        }
    }

    public int get() {
        return count;
    }

    // 반복 측정 전에 0으로 되돌린다. 스레드가 모두 끝난 뒤에만 실행
    public void reset() {
        count = 0;
    }


}
