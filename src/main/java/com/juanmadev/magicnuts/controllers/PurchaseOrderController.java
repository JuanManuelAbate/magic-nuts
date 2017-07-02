package com.juanmadev.magicnuts.controllers;

import com.juanmadev.magicnuts.controllers.responses.PurchaseOrderResponse;
import com.juanmadev.magicnuts.services.PurchaseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by juanmanuelabate on 1/7/17.
 */
@RestController
public class PurchaseOrderController {

    @Autowired
    PurchaseOrderService purchaseOrderService;

    @Autowired
    PurchaseOrderMapper purchaseOrderMapper;

    @RequestMapping(value = "/purchase-orders,", method = RequestMethod.GET)
    public List<PurchaseOrderResponse> getAllPurchaseOrders() {

        return purchaseOrderMapper.purchaseOrderListToPurchaseOrderResponseList(purchaseOrderService.getAllPurchaseOrders);
    }

}
