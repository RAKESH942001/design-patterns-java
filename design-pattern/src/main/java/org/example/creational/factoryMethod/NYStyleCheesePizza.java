package org.example.creational.factoryMethod;

public class NYStyleCheesePizza extends Pizza{

    @Override
    void prepare() {
        System.out.println("Preparing NY style CHEESE pizza.");
    }

    @Override
    void bake() {
        System.out.println("Baking NY style CHEESE pizza.");
    }

    @Override
    void cut() {
        System.out.println("Cutting the NY style CHEESE pizza into triangular pieces.");
    }
}
