package com.ohgiraffers.section02.responsibility.bookstore.start;

public class OrderService {

    public void placeOrder(Customer customer, Order order) {

        for (OrderLine line : order.getLines()) {
            Book book = line.getBook();
            if (!book.canSell(line.getQuantity())) {
                System.out.println("주문 결과: 재고 부족");
                return;
            }

        }

        int amount = order.totalPrice();
        int discount = amount * customer.getDiscountRate() / 100;
        int afterDiscount = amount - discount;

        int shippingFee = 3000;
        if (afterDiscount >= 30000) {
            shippingFee = 0;
        }

        System.out.println("결제 금액: " + (afterDiscount + shippingFee));
        System.out.println("배송비: " + shippingFee);
        System.out.println("상품 금액: " + amount);

        for (OrderLine line : order.getLines()) {
            Book book = line.getBook();
            book.decreaseStock(line.getQuantity());
            System.out.println("남은 재고: " + book.getTitle() + " " + book.getStock());
        }
        System.out.println("주문 결과: 완료");
    }
}