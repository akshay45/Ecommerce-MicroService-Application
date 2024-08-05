package com.assignment.group.productservice.controller;

import com.assignment.group.productservice.entity.Product;
import com.assignment.group.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductService productService;
    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
    @PostMapping
    public void addProduct(@RequestBody Product product) {
         productService.addProduct(product);
    }


}
