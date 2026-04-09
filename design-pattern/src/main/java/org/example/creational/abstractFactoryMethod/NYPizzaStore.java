package org.example.creational.abstractFactoryMethod;


public class NYPizzaStore extends PizzaStore {


    @Override
    protected Pizza createPizza(String type) {

        Pizza pizza = null;
        PizzaIngredientFactory factory = new NYPizzaIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(factory);
        }
        return pizza;

    }
}
