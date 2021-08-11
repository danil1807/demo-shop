package ru.geekbrains.context.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.geekbrains.context.service.CartService;
import ru.geekbrains.context.service.ProductService;

@Configuration

@ComponentScan({"ru.geekbrains.context.repository", "ru.geekbrains.context.service", "ru.geekbrains.context.controller"})
public class ApplicationConfiguration {

    private final ProductService productService;
    private final CartService cartService;

    public ApplicationConfiguration(ProductService productService, CartService cartService) {
        this.productService = productService;
        this.cartService = cartService;
    }



}
