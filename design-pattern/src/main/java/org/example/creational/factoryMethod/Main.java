package org.example.creational.factoryMethod;

public class Main {

    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza pizza1 = nyPizzaStore.orderPizza("cheese");
    }

}