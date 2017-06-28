package com.juanmadev.magicnuts.controllers.responses;

/**
 * Created by juanmanuelabate on 21/6/17.
 */
public class ProductResponse {

    private Long id;
    private String description;
    private Double price;
    private Double stock;

    public ProductResponse() {

    }

    public ProductResponse(Long id, String description, Double price, Double stock) {
        this.id = id;
        this.description = description;
        this.price = price;
        this.stock = stock;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
