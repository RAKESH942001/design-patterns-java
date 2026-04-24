package org.example.solidPattern.dependencyInversion;

import java.util.List;

public class ProductCatelog {

    ProductRepository productRepository;

    public ProductCatelog(ProductRepository productRepository) {
        this.productRepository=productRepository;
    }


    public void listAllproducts() {

        List<String> allProductsName =productRepository.getAllProductName();
    }
}
