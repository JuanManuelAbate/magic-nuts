package com.juanmadev.magicnuts.controllers;

import com.juanmadev.magicnuts.controllers.requests.PurchaseOrderRequest;
import com.juanmadev.magicnuts.controllers.responses.PurchaseOrderResponse;
import com.juanmadev.magicnuts.entities.Product;
import com.juanmadev.magicnuts.entities.ProductPurchaseOrder;
import com.juanmadev.magicnuts.entities.PurchaseOrder;
import com.juanmadev.magicnuts.services.PurchaseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by juanmanuelabate on 1/7/17.
 */
@RestController
public class PurchaseOrderController {

    @Autowired
    PurchaseOrderService purchaseOrderService;

    @RequestMapping(value = "/purchase-orders", method = RequestMethod.GET)
    public List<PurchaseOrderResponse> getAllPurchaseOrders() {

        return purchaseOrderService.getAllPurchaseOrders();
    }

    //TODO Aca segun la teoria de REST habria que devolver el recurso atomico que se creo, por ahora se devuelve null por tema de funcionalidad luego ver si se mejora
    @RequestMapping(value = "/purchase-orders", method = RequestMethod.POST)
    public void createPurchaseOrder(@RequestBody PurchaseOrderRequest purchaseOrderRequest) {

        purchaseOrderService.createPurchaseOrder(purchaseOrderRequest);
    }

}
