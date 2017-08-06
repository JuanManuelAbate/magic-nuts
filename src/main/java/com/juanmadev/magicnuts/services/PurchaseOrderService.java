package com.juanmadev.magicnuts.services;

import com.juanmadev.magicnuts.controllers.requests.ProductPurchaseOrderRequest;
import com.juanmadev.magicnuts.controllers.requests.PurchaseOrderRequest;
import com.juanmadev.magicnuts.controllers.responses.ProductPurchaseOrderResponse;
import com.juanmadev.magicnuts.controllers.responses.PurchaseOrderResponse;
import com.juanmadev.magicnuts.entities.Product;
import com.juanmadev.magicnuts.entities.ProductPurchaseOrder;
import com.juanmadev.magicnuts.entities.PurchaseOrder;
import com.juanmadev.magicnuts.repositories.PurchaseOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by juanmanuelabate on 1/7/17.
 */
@Service
public class PurchaseOrderService {

    @Autowired
    PurchaseOrderRepository purchaseOrderRepository;

    public List<PurchaseOrderResponse> getAllPurchaseOrders() {

        List<PurchaseOrder> purchaseOrders = (ArrayList<PurchaseOrder>) purchaseOrderRepository.findAll();

        List<PurchaseOrderResponse> purchaseOrderResponses = new ArrayList<PurchaseOrderResponse>();

        for (PurchaseOrder purchaseOrder : purchaseOrders) {
            PurchaseOrderResponse purchaseOrderResponse = new PurchaseOrderResponse();
            purchaseOrderResponse.setId(purchaseOrder.getId());
            purchaseOrderResponse.setWithDrawInBranch(purchaseOrder.getWithDrawInBranch());
            purchaseOrderResponse.setPhoneNumber(purchaseOrder.getPhoneNumber());
            purchaseOrderResponse.setClientName(purchaseOrder.getClientName());
            purchaseOrderResponse.setComment(purchaseOrder.getComment());
            purchaseOrderResponse.setDeliveryAddress(purchaseOrder.getDeliveryAddress());
            purchaseOrderResponse.setDeliveryTime(purchaseOrder.getDeliveryTime());
            purchaseOrderResponse.setStatus(purchaseOrder.getStatus());

            for (ProductPurchaseOrder productPurchaseOrder : purchaseOrder.getProductPurchaseOrders()) {
                ProductPurchaseOrderResponse productPurchaseOrderResponse = new ProductPurchaseOrderResponse();
                productPurchaseOrderResponse.setDescription(productPurchaseOrder.getProduct().getDescription());
                productPurchaseOrderResponse.setQuantity(productPurchaseOrder.getQuantity());
                productPurchaseOrderResponse.setPrice(productPurchaseOrder.getProduct().getPrice());
                productPurchaseOrderResponse.setTotal(productPurchaseOrderResponse.getPrice() * productPurchaseOrderResponse.getQuantity());
                purchaseOrderResponse.setGrandTotal(purchaseOrderResponse.getGrandTotal() + productPurchaseOrderResponse.getTotal());
                purchaseOrderResponse.getProducts().add(productPurchaseOrderResponse);
            }

            purchaseOrderResponses.add(purchaseOrderResponse);
        }

        return purchaseOrderResponses;
    }

    public void createPurchaseOrder(PurchaseOrderRequest purchaseOrderRequest) {

        PurchaseOrder purchaseOrder = new PurchaseOrder();
        purchaseOrder.setClientName(purchaseOrderRequest.getClientName());
        purchaseOrder.setComment(purchaseOrderRequest.getComment());
        purchaseOrder.setDeliveryAddress(purchaseOrderRequest.getDeliveryAddress());
        purchaseOrder.setDeliveryTime(purchaseOrderRequest.getDeliveryTime());
        purchaseOrder.setPhoneNumber(purchaseOrderRequest.getPhoneNumber());
        purchaseOrder.setWithDrawInBranch(purchaseOrderRequest.getWithDrawInBranch());
        purchaseOrder.setStatus("P");

        for (ProductPurchaseOrderRequest productPurchaseOrderRequest : purchaseOrderRequest.getProducts()) {
            ProductPurchaseOrder productPurchaseOrder = new ProductPurchaseOrder();
            productPurchaseOrder.setQuantity(productPurchaseOrderRequest.getQuantity());
            productPurchaseOrder.setProduct(new Product(productPurchaseOrderRequest.getId()));
            productPurchaseOrder.setPurchaseOrder(purchaseOrder);
            purchaseOrder.getProductPurchaseOrders().add(productPurchaseOrder);
        }

        purchaseOrderRepository.save(purchaseOrder);
    }
}
