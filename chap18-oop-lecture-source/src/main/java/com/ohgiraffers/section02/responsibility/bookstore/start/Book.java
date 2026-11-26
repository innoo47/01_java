package com.ohgiraffers.section02.responsibility.bookstore.start;

public class Book {

    private String title;
    private int price;
    private int stock;

    public Book(String title, int price, int stock) {
        this.title = title;
        this.price = price;
        this.stock = stock;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public boolean canSell(int quantity) {
        if (stock <= 5 && quantity > 2) {
            return false;
        }
        return stock >= quantity;
    }

    public void decreaseStock(int quantity) {
        stock -= quantity;
    }
}