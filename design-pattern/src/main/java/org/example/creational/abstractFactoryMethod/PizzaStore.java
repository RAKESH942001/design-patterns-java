package org.example.creational.abstractFactoryMethod;



public  abstract  class PizzaStore {

    public Pizza orderPizza(String type){

        Pizza pizza=createPizza(type);

        pizza.prepare();
        pizza.bake();


        return pizza;
    }
    protected  abstract Pizza createPizza(String type);
}
