package com.adrianovsilva99.bazarbyte.repositories;

import com.adrianovsilva99.bazarbyte.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}