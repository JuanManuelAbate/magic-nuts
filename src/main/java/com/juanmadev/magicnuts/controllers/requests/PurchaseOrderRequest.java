package com.juanmadev.magicnuts.controllers.requests;

import java.util.List;

/**
 * Created by juanmanuelabate on 19/7/17.
 */
public class PurchaseOrderRequest {

    private String clientName;
    private List<ProductPurchaseOrderRequest> products;
    private String deliveryAddress;
    private String phoneNumber;
    private String deliveryTime;
    private Boolean withDrawInBranch;
    private String comment;

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public List<ProductPurchaseOrderRequest> getProducts() {
        return products;
    }

    public void setProducts(List<ProductPurchaseOrderRequest> products) {
        this.products = products;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
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
}
