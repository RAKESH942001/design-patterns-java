package org.example.creational.abstractFactoryMethod;

public abstract class Pizza {

    Doungh doungh;
    Sauce sauce;
    Cheese cheese;

    PizzaIngredientFactory pizzaIngredientFactory;

    abstract void prepare();

    void bake(){
        System.out.println("Baking ...");
    }

}
