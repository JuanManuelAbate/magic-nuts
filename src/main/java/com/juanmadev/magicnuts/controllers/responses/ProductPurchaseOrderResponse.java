package com.juanmadev.magicnuts.controllers.responses;

/**
 * Created by juanmanuelabate on 30/7/17.
 */
public class ProductPurchaseOrderResponse {

    private String description;
    private Double price;
    private Double quantity;
    private Double total;

    public ProductPurchaseOrderResponse() {}

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

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}
