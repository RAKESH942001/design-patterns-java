package org.example.structuralPattern.decoratorPattern;

public class ExtraMayoBurger extends BurgerDecorator{

    private Burger burger;

    public ExtraMayoBurger(Burger burger) {
        this.burger = burger;
    }

    public String getDescription() {
        return burger.getDescription() + " with extra mayo.";
    }

    public double getCost() {
        return burger.getCost() + 30.0;
    }
}
