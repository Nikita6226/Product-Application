package com.nikita.product_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import main.java.com.nikita.product_app.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
