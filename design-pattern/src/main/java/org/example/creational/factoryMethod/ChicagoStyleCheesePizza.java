package org.example.creational.factoryMethod;

public class ChicagoStyleCheesePizza extends  Pizza{

    @Override
    public void prepare() {
        System.out.println("Preparing ChicagoStyle  CHEESE pizza.");
    }

    @Override
    public void bake() {
        System.out.println("Baking ChicagoStyle CHEESE pizza.");

    }

    @Override
    public void cut() {
        System.out.println("Cutting the ChicagoStyle CHEESE pizza into triangular pieces.");

    }

}
