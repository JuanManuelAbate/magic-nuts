package com.juanmadev.magicnuts.services;

import com.juanmadev.magicnuts.entities.Product;
import com.juanmadev.magicnuts.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by juanmanuelabate on 25/5/17.
 */
@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {

        return (List<Product>) productRepository.findAll();
    }

    public Product createProduct(Product product) {

        return productRepository.save(product);
    }

    public Product getProductById(Long id) {

        return productRepository.findOne(id);
    }

    public void deleteProduct(Long id) {

        productRepository.delete(id);
    }

    public Product updateProduct(Long id, Product product) {

        product.setId(id);
        return productRepository.save(product);
    }
}
