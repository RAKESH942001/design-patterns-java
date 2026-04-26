package org.example.behaviouralPattern.templeteMethod;

public class Coffee extends Beverage{

    @Override
    void addIngredient() {
        System.out.println("Adding coffee powder...");
    }

    // OPTIONAL override — because parent hook was empty
    @Override
    void addCondiments() {
        System.out.println("Adding milk...");
    }
}
