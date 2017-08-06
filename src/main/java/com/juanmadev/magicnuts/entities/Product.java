package com.juanmadev.magicnuts.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by juanmanuelabate on 25/5/17.
 */
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private Double price;
    private Double stock;

    @OneToMany(mappedBy = "product")
    private Set<ProductPurchaseOrder> productPurchaseOrders = new HashSet<ProductPurchaseOrder>();

    public Product() {

    }

    public Product(Long id) {
        this.id = id;
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

    public Set<ProductPurchaseOrder> getProductPurchaseOrders() {
        return productPurchaseOrders;
    }

    public void setProductPurchaseOrders(Set<ProductPurchaseOrder> productPurchaseOrders) {
        this.productPurchaseOrders = productPurchaseOrders;
    }
}
