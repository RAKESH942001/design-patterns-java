package org.example.creational.abstractFactoryMethod;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Doungh createDought() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }
}
