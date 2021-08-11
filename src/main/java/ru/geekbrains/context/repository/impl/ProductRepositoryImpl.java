package ru.geekbrains.context.repository.impl;

import org.springframework.stereotype.Repository;
import ru.geekbrains.context.domain.Product;
import ru.geekbrains.context.repository.ProductRepository;

import javax.annotation.PostConstruct;
import java.util.*;

@Repository
class ProductRepositoryImpl implements ProductRepository {

    private List<Product> products;

    @PostConstruct
    public void init() {
        products = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Random rand = new Random();
            double price = rand.nextDouble();
            Product product = new Product(i, "Product-" + i, price);
            products.add(product);
        }
    }


    @Override
    public List<Product> findAllProducts() {
        return products;
    }

    @Override
    public Optional<Product> findById(long id) {
        for (Product product:products) {
            if (product.getId() == id){
                return Optional.of(product);
            }
        }
        return Optional.empty();
    }
}