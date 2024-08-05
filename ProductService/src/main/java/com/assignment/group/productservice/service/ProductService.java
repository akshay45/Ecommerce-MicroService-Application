package com.assignment.group.productservice.service;

import com.assignment.group.productservice.entity.Product;
import com.assignment.group.productservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(Long id) {
        return productRepository.getById(id);
    }
    public void addProduct(Product product) {
        productRepository.save(product);
    }
}
