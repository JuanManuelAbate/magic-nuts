package com.juanmadev.magicnuts.controllers.requests;

/**
 * Created by juanmanuelabate on 19/7/17.
 */
public class ProductPurchaseOrderRequest {

    private Long id;
    private Double quantity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }
}
