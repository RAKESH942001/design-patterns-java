package org.example.solidPattern.dependencyInversion;

public class ProductFactory {
    public static ProductRepository create() {
        return new SQLProductRepository();
    }
}
