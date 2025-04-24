package com.nikita.categorycrud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.nikita.categorycrud.model.Category;

public interface CategoryService {
    List getAllCategories();
    Page getAllCategories(Pageable pageable);
    Optional getCategoryById(Long id);
    Category createCategory(Category category);
    Category updateCategory(Long id, Category categoryDetails);
    void deleteCategory(Long id);
}
