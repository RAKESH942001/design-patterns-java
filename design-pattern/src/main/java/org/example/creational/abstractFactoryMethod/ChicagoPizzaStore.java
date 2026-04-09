package org.example.creational.abstractFactoryMethod;

public class ChicagoPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {

        Pizza pizza =null;

        PizzaIngredientFactory factory=new ChicagoPizzaIngredientFactory();

        if(type.equals("cheese")){
            pizza = new CheesePizza(factory);
        }

        return pizza;

    }
}
