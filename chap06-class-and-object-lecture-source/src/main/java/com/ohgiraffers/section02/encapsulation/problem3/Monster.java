package com.ohgiraffers.section02.encapsulation.problem3;

public class Monster {

    /**
     * 접근제한자
     * 클래스 혹은 클래스의 멤버(필드, 메소드)에 참조연산자로 접근할 수 있는 범위를 제한하기 위한 키워드
     * public, protected, default, private
     * 단, 클래스 선언시에는 public, default만 사용가능
     */

    /* 해당 필드들은 클래스 내부에서만 접근 가능하도록 한다 */
    private String name;
    private int hp;

    /* 간접 접근 가능한 메소드를 정의하여 외부에서는 메소드를 통해 간접 접근하게 된다 */
    public void setInfo(String name) {
        this.name = name;
    }

    public String getInfo() {
        return this.name;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = Math.max(hp, 0);  // 체력이 0 아래로 내려가지 않게
    }

}
