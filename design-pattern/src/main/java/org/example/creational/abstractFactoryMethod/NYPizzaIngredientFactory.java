package org.example.creational.abstractFactoryMethod;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{


    @Override
    public Doungh createDought() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }
}
