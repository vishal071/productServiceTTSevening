package dev.vishal.vishalka.services;

public interface CategoryService {
    String getAllCategories();
    String getProductsInCategory(Long categoryId);
}
