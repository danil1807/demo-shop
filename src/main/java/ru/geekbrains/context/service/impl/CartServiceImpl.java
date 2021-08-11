package ru.geekbrains.context.service.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import ru.geekbrains.context.domain.Product;
import ru.geekbrains.context.service.CartService;
import ru.geekbrains.context.service.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_PROTOTYPE;

@Service
@Scope(SCOPE_PROTOTYPE)
public class CartServiceImpl implements CartService {

    private final List<Product> products;
    private final ProductService productService;

    public CartServiceImpl(ProductService productService) {
        this.products = new ArrayList<>();
        this.productService = productService;
    }

    @Override
    public boolean addProductToCart(long id) {
        Optional<Product> productOptional = productService.findById(id);
        if (productOptional.isPresent()){
            products.add(productOptional.get());
            return true;
        }
        return false;
    }

    @Override
    public boolean removeProductFromCart(long id) {
        return products.removeIf(product -> product.getId() == id);
    }
}
