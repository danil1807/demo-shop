package ru.geekbrains.context.domain;

import org.springframework.context.annotation.Bean;

public class Product {
    private String title;
    private double price;
    private int id;

    public Product(int id, String title, double price) {
        this.title = title;
        this.price = price;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", price=" + price +
                ", title=" + title +
                '}';
    }
}
