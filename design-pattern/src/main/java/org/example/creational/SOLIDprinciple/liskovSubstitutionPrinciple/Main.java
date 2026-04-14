package org.example.creational.SOLIDprinciple.liskovSubstitutionPrinciple;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new InHouseProduct();


        List<Product> productList = new ArrayList<>();

        // Step 3: Add products to list
        productList.add(p1);
        productList.add(p2);
        productList.add(p3);

        for (Product product : productList) {
            System.out.println(product.getDiscount());
        }
    }
}
