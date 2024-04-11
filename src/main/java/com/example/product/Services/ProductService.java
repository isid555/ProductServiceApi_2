package com.example.product.Services;

import com.example.product.Model.Product;
//import org.scaler.product.Model.Product;

import java.util.List;

public interface ProductService {
List<Product> getAllProducts();
Product getSingleProduct(Long id);
}
