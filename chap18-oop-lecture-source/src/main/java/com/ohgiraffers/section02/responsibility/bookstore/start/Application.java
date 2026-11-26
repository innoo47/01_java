package com.ohgiraffers.section02.responsibility.bookstore.start;

public class Application {

    public static void main(String[] args) {

        /* 도서와 고객을 만든다. 고객의 숫자는 할인율(%)이다. */
        Book javaBook = new Book("자바 설계 입문", 18000, 10);
        Book algorithmBook = new Book("알고리즘 첫걸음", 22000, 3);
        Book testBook = new Book("테스트 주도 연습", 25000, 5);
        Customer kim = new Customer("김하늘", 10);
        Customer lee = new Customer("이준호", 5);
        Customer park = new Customer("박서연", 0);

        /* 주문 네 개를 차례로 처리한다. 앞 주문이 줄인 재고를 뒤 주문이 그대로 쓴다. */
        OrderService orderService = new OrderService();

        System.out.println("[주문 1] 김하늘");
        Order order1 = new Order();
        order1.addLine(javaBook, 2);
        orderService.placeOrder(kim, order1);

        System.out.println("[주문 2] 이준호");
        Order order2 = new Order();
        order2.addLine(algorithmBook, 1);
        order2.addLine(testBook, 1);
        orderService.placeOrder(lee, order2);

        System.out.println("[주문 3] 박서연");
        Order order3 = new Order();
        order3.addLine(algorithmBook, 3);
        orderService.placeOrder(park, order3);

        System.out.println("[주문 4] 김하늘");
        Order order4 = new Order();
        order4.addLine(testBook, 3);
        orderService.placeOrder(kim, order4);
    }
}