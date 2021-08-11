package ru.geekbrains.context.service;

public interface CartService {

    boolean addProductToCart(long id);

    boolean removeProductFromCart(long id);
}
