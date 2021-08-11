package ru.geekbrains.context.service.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.geekbrains.context.domain.Product;
import ru.geekbrains.context.repository.ProductRepository;
import ru.geekbrains.context.service.ProductService;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getProducts() {
        return productRepository.findAllProducts();
    }


    @Override
    public Optional<Product> findById(long id) {
        return productRepository.findById(id);
    }
}
