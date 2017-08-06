package com.juanmadev.magicnuts.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by juanmanuelabate on 1/7/17.
 */
@Entity
public class PurchaseOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String clientName;
    private String deliveryAddress;
    private String phoneNumber;
    private String deliveryTime;
    private Boolean withDrawInBranch;
    private String comment;
    private String status;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "purchaseOrder")
    private List<ProductPurchaseOrder> productPurchaseOrders = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<ProductPurchaseOrder> getProductPurchaseOrders() {
        return productPurchaseOrders;
    }

    public void setProductPurchaseOrders(List<ProductPurchaseOrder> productPurchaseOrders) {
        this.productPurchaseOrders = productPurchaseOrders;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
