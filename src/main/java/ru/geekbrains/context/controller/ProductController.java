package ru.geekbrains.context.controller;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import ru.geekbrains.context.domain.Product;
import ru.geekbrains.context.service.CartService;
import ru.geekbrains.context.service.ProductService;

import java.io.PrintWriter;
import java.util.Optional;

@Component
@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE,
        proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ProductController {

    private final ProductService productService;
    private final CartService cartService;


    public ProductController(ProductService productService, CartService cartService) {
        this.productService = productService;
        this.cartService = cartService;

        System.out.println("New Controller");
    }

    public void getProductById(long id){
        Optional <Product> product = productService.findById(id);
        String result = product.toString();
    }



    public void doPost() {

    }

}