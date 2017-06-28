package com.juanmadev.magicnuts.repositories;

import com.juanmadev.magicnuts.entities.Product;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by juanmanuelabate on 27/5/17.
 */
public interface ProductRepository extends CrudRepository<Product, Long> {

}
