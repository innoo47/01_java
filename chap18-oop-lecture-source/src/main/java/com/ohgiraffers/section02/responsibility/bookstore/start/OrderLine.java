package com.ohgiraffers.section02.responsibility.bookstore.start;

public class OrderLine {

    private Book book;
    private int quantity;

    public OrderLine(Book book, int quantity) {
        this.book = book;
        this.quantity = quantity;
    }

    public Book getBook() {
        return book;
    }

    public int getQuantity() {
        return quantity;
    }
}