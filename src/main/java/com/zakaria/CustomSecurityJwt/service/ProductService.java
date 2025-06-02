package com.zakaria.CustomSecurityJwt.service;

import com.zakaria.CustomSecurityJwt.model.Product;
import com.zakaria.CustomSecurityJwt.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepo;

    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    public Product addProduct(Product product) {
        return productRepo.save(product);
    }
}
