package com.juanmadev.magicnuts.controllers;

import com.juanmadev.magicnuts.controllers.mappers.ProductMapper;
import com.juanmadev.magicnuts.controllers.requests.ProductRequest;
import com.juanmadev.magicnuts.controllers.responses.ProductResponse;
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

    @Autowired
    private ProductMapper productMapper;

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public List<ProductResponse> getAllProducts() {

        return productMapper.productListToProductResponseList(productService.getAllProducts());
    }

    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public ProductResponse createProduct(@RequestBody ProductRequest product) {

        Product newProduct = productService.createProduct(productMapper.productRequestToProduct(product));
        return productMapper.productToProductResponse(newProduct);
    }

    @RequestMapping(value = "/products/{id}", method = RequestMethod.GET)
    public ProductResponse getProductById(@PathVariable("id") Long id) {

        return productMapper.productToProductResponse(productService.getProductById(id));
    }

    @RequestMapping(value = "/products/{id}", method = RequestMethod.DELETE)
    public void deleteProduct(@PathVariable("id") Long id) {

        productService.deleteProduct(id);
    }

    @RequestMapping(value = "/products/{id}", method = RequestMethod.PUT)
    public ProductResponse updateProductById(@PathVariable("id") Long id, @RequestBody ProductRequest product) {

        Product updatedProduct = productService.updateProduct(id, productMapper.productRequestToProduct(product));
        return productMapper.productToProductResponse(updatedProduct);
    }

}
