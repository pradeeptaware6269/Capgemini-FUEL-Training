package com.example.Spring_Task_2_Order_Product.service;

import com.example.Spring_Task_2_Order_Product.model.Product;

public interface ProductService {

    Product saveProduct(Product product);

    Product getProduct(Long id);

    void deleteProduct(Long id);

    Product updateProduct(Product product,Long id);
}
