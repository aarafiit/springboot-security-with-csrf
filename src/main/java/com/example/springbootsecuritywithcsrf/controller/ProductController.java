package com.example.springbootsecuritywithcsrf.controller;

import com.example.springbootsecuritywithcsrf.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {
    List<Product> productList = new ArrayList<>(List.of(
            new Product(1, "Laptop", 1200.00),
            new Product(2, "Smartphone", 800.00),
            new Product(3, "Tablet", 400.00),
            new Product(4, "Smartwatch", 200.00)
    ));

    @GetMapping("/products")
    public List<Product> getProducts() {
        return productList;
    }

    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product) {
        productList.add(product);
        return product;
    }

}