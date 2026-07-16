package com.inventoryflow.service;

import com.inventoryflow.entity.Product;
import com.inventoryflow.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository repository;

    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    public Product save(Product product) {
        return repository.save(product);
    }

    public Product update(Long id, Product product) {

        Product existing = repository.findById(id).orElseThrow();

        existing.setProductName(product.getProductName());
        existing.setCategory(product.getCategory());
        existing.setQuantity(product.getQuantity());
        existing.setPrice(product.getPrice());

        return repository.save(existing);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}