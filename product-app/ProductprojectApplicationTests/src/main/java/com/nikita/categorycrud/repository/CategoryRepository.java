package com.nikita.categorycrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nikita.categorycrud.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    // Spring Data JPA provides basic CRUD operations
}