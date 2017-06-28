package com.juanmadev.magicnuts.controllers.requests;

/**
 * Created by juanmanuelabate on 21/6/17.
 */
public class ProductRequest {

    private String description;
    private Double price;
    private Double stock;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getStock() {
        return stock;
    }

    public void setStock(Double stock) {
        this.stock = stock;
    }
}
