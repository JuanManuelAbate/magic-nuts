package com.juanmadev.magicnuts.controllers.responses;

import java.util.List;

/**
 * Created by juanmanuelabate on 1/7/17.
 */
public class PurchaseOrderResponse {

    private Long id;
    private String clientName;
    private String address;
    private String phoneNumber;
    private String timeRange;
    private Boolean withDrawInBranch;
    private String comment;
    private List<ProductResponse> products;
    private Double total;
    private String state;

    public PurchaseOrderResponse() {

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getTimeRange() {
        return timeRange;
    }

    public void setTimeRange(String timeRange) {
        this.timeRange = timeRange;
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

    public List<ProductResponse> getProducts() {
        return products;
    }

    public void setProducts(List<ProductResponse> products) {
        this.products = products;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}

