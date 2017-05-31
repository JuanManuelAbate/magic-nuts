package com.juanmadev.magicnuts.controllers;

import com.juanmadev.magicnuts.entities.Product;
import com.juanmadev.magicnuts.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by juanmanuelabate on 25/5/17.
 */
@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public List<Product> getAllProducts() {

        return productService.getAllProducts();
    }

    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public void createProduct(@RequestBody Product product) {

        productService.createProduct(product);
    }

    @RequestMapping(value = "/products/{id}", method = RequestMethod.GET)
    public Product getProductById(@PathVariable("id") Integer id) {

        return productService.getProductById(id);
    }
}
