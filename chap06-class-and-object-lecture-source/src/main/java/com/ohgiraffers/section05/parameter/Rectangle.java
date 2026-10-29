package com.ohgiraffers.section05.parameter;

public class Rectangle {

    private int height;
    private int width;

    public Rectangle() { // 기본생성자
        // 매개변수 있는 생성자를 만들면 해당 생성자를 지울 시
        // Rectangle rc = new Rectangle(); 을 생성 할 수 없다
    }

    public Rectangle(int height, int width) { // 매개변수 있는 생성자
        this.height = height;
        this.width = width;
    }

    public void calArea() {
        System.out.println("사각형의 넓이는 " + (this.width * this.height));
    }

    public void calRound() {
        System.out.println("사각형의 둘레는 " + (this.width + this.height) * 2);
    }
}
