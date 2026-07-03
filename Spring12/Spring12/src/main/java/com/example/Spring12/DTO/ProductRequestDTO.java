package com.example.Spring12.DTO;

import com.example.Spring12.model.Product;

public class ProductRequestDTO {


    private String pname;
    private int quantity;
    private double price;
    private String password;

    public ProductRequestDTO(Product product) {

        this.pname = product.getPname();
        this.quantity = product.getQuantity();
        this.price = product.getPrice();
        this.password = product.getPassword();
    }


    public ProductRequestDTO()
    {}
    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
