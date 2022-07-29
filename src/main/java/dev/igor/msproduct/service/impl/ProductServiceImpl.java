package dev.igor.msproduct.service.impl;

import dev.igor.msproduct.model.Product;
import dev.igor.msproduct.repository.ProductRepository;
import dev.igor.msproduct.service.ProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product insert(Product product) {
        return productRepository.save(product);
    }
}
