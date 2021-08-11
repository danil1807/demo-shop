package ru.geekbrains.context.repository;

import org.springframework.stereotype.Repository;
import ru.geekbrains.context.domain.Product;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository {


    List<Product> findAllProducts();

    Optional<Product> findById(long id);

}
