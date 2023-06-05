package com.adrianovsilva99.bazarbyte.controllers;

import com.adrianovsilva99.bazarbyte.dto.ProductDTO;
import com.adrianovsilva99.bazarbyte.entities.Product;
import com.adrianovsilva99.bazarbyte.repositories.ProductRepository;
import com.adrianovsilva99.bazarbyte.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping(value = "/{id}")
    public ProductDTO findById(@PathVariable Long id) {
        ProductDTO dto = service.findById(id);
        return dto;
    }
}