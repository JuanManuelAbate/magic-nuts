package com.juanmadev.magicnuts.controllers.responses;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by juanmanuelabate on 1/7/17.
 */
public class PurchaseOrderResponse {

    private Long id;
    private String clientName;
    private String deliveryAddress;
    private String deliveryTime;
    private String phoneNumber;
    private Boolean withDrawInBranch;
    private String comment;
    private List<ProductPurchaseOrderResponse> products;
    private Double grandTotal;
    private String status;

    public PurchaseOrderResponse() {

        this.products = new ArrayList<ProductPurchaseOrderResponse>();
        this.grandTotal = new Double(0);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Boolean getWithDrawInBranch() {
        return withDrawInBranch;
    }

    public void setWithDrawInBranch(Boolean withDrawInBranch) {
        this.withDrawInBranch = withDrawInBranch;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public List<ProductPurchaseOrderResponse> getProducts() {
        return products;
    }

    public void setProducts(List<ProductPurchaseOrderResponse> products) {
        this.products = products;
    }

    public Double getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(Double grandTotal) {
        this.grandTotal = grandTotal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

