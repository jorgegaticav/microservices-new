package com.jorgegatica.productservice.repository;

import com.jorgegatica.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
