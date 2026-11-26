package com.ohgiraffers.section02.responsibility.bookstore.start;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<OrderLine> lines = new ArrayList<>();

    public void addLine(Book book, int quantity) {
        lines.add(new OrderLine(book, quantity));
    }

    public List<OrderLine> getLines() {
        return lines;
    }

    public int totalPrice() {
        int amount = 0;
        for (OrderLine line : lines) {
            amount = amount + line.getBook().getPrice() * line.getQuantity();
        }
        return amount;
    }
}