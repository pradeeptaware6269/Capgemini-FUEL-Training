package com.example.Spring6.DTO;

import com.example.Spring6.model.Product;

public class ProductResponceDTO {

    private String pname;
    private int quantity;
    private double price;
    private String password;


    public ProductResponceDTO(Product product) {

        this.pname = product.getPname();
        this.quantity = product.getQuantity();
        this.price = product.getPrice();
        this.password=product.getPassword();

    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }
}
