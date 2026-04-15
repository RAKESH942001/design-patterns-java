package org.example.creational.dependencyInversion;

public class ProductFactory {
    public static ProductRepository create() {
        return new SQLProductRepository();
    }
}
