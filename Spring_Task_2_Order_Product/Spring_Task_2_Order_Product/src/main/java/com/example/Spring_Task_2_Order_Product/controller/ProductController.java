package com.example.Spring_Task_2_Order_Product.controller;

import com.example.Spring_Task_2_Order_Product.model.Product;
import com.example.Spring_Task_2_Order_Product.serviceImpl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductServiceImpl productService;

    @PostMapping
    public Product create(@RequestBody Product product)
    {
        return productService.saveProduct(product);
    }

    @GetMapping("/{id}")
    public Product getadata(@PathVariable Long id)
    {
        return productService.getProduct(id);
    }

    @DeleteMapping("/{id}")
    public void getdelete(@PathVariable Long id)
    {
        productService.deleteProduct(id);
    }

    @PutMapping("/{id}")
    public Product getupdate(@RequestBody Product product,@PathVariable Long id)
    {
        return productService.updateProduct(product,id);
    }
}
