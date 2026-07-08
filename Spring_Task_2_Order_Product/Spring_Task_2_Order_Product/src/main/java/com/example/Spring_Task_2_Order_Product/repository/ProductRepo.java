package com.example.Spring_Task_2_Order_Product.repository;

import com.example.Spring_Task_2_Order_Product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepo extends JpaRepository<Product,Long>{
    //Optional<Product> findByProduc
}
