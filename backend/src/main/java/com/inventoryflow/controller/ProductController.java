package com.inventoryflow.controller;

import com.inventoryflow.entity.Product;
import com.inventoryflow.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class ProductController {

    private final ProductService service;

    @GetMapping("/getAllProducts")
    public List<Product> getAllProducts() {
        return service.getAllProducts();
    }

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product) {
        return service.save(product);
    }

    @PutMapping("/updateProduct/{id}")
    public Product updateProduct(@PathVariable Long id,
                                 @RequestBody Product product) {

        return service.update(id, product);
    }

    @DeleteMapping("deleteProduct/{id}")
    public void deleteProduct(@PathVariable Long id) {
        service.delete(id);
    }
}