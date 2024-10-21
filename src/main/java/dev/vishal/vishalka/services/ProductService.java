package dev.vishal.vishalka.services;

import dev.vishal.vishalka.dtos.ProductDto;

public interface ProductService {
    String getAllProducts();
    String getSingleProduct(Long productId);
    String addNewProduct(ProductDto productDto);
    String updateProduct(Long productId);
    String deleteProduct(Long productId);
}
