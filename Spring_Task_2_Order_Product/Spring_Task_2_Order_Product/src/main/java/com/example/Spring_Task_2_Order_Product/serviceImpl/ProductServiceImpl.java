package com.example.Spring_Task_2_Order_Product.serviceImpl;

import com.example.Spring_Task_2_Order_Product.model.Product;
import com.example.Spring_Task_2_Order_Product.repository.ProductRepo;
import com.example.Spring_Task_2_Order_Product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo productRepo;

    @Override
    public Product saveProduct(Product product) {
        return productRepo.save(product);
    }

    @Override
    public Product getProduct(Long id) {
        return productRepo.findById(id).orElseThrow();
    }

    @Override
    public void deleteProduct(Long id) {
        productRepo.deleteById(id);
    }

    @Override
    public Product updateProduct(Product product,Long id) {
        product.setId(id);
        return productRepo.save(product);
    }
}
