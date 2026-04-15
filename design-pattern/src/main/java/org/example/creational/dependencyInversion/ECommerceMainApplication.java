package org.example.creational.dependencyInversion;

public class ECommerceMainApplication {

    public static void main(String[] args) {

        ProductRepository productRepository=ProductFactory.create();

        ProductCatelog productCatelog=new ProductCatelog(productRepository);

        productCatelog.listAllproducts();

    }
}
