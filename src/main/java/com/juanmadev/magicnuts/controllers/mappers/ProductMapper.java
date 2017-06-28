package com.juanmadev.magicnuts.controllers.mappers;

import com.juanmadev.magicnuts.controllers.requests.ProductRequest;
import com.juanmadev.magicnuts.controllers.responses.ProductResponse;
import com.juanmadev.magicnuts.entities.Product;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * Created by juanmanuelabate on 22/6/17.
 */
@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductResponse productToProductResponse(Product product);

    Product productRequestToProduct(ProductRequest productRequest);

    List<ProductResponse> productListToProductResponseList(List<Product> products);

}
