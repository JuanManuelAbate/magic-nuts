package com.juanmadev.magicnuts.repositories;

import com.juanmadev.magicnuts.entities.PurchaseOrder;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by juanmanuelabate on 15/7/17.
 */
public interface PurchaseOrderRepository extends CrudRepository<PurchaseOrder, Long> {

}
