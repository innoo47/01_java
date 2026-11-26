package com.ohgiraffers.section01.ocp.bookstore.solution;

/* 주문 하나의 금액을 계산하고 결과를 출력하는 클래스다. */
public class OrderService {

    /*
     * 주문 하나를 처리한다.
     * 상품 금액, 할인 금액, 할인 뒤 금액, 배송비 순서로 계산해서 출력한다.
     * 배송비는 할인 뒤 금액이 30000원 이상이면 0원이고, 아니면 3000원이다.
     * */
    public void placeOrder(Customer customer, Book book, int quantity) {

        int amount = book.getPrice() * quantity;
        DiscountPolicy discountPolicy = customer.getDiscountPolicy();
        int discount = discountPolicy.discount(amount);
        int afterDiscount = amount - discount;

        int shippingFee = 3000;
        if (afterDiscount >= 30000) {
            shippingFee = 0;
        }

        System.out.println("결제 금액: " + (afterDiscount + shippingFee));
        System.out.println("배송비: " + shippingFee);
        System.out.println("할인 금액: " + discount);
        System.out.println("주문 결과: 완료");
    }


}