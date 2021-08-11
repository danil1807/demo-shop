package ru.geekbrains.context.domain;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    List<Product> cart = new ArrayList<>();

    public void add(Product product){
        cart.add(product);
    }

    public void remove(Product product){
        cart.remove(product);
    }

    public void emptyCart(){
        cart.clear();
    }

}
