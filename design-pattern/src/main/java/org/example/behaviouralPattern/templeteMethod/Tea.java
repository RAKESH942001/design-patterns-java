package org.example.behaviouralPattern.templeteMethod;

public class Tea extends Beverage{
    @Override
    void addIngredient() {
        System.out.println("Adding tea leaves...");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding lemon...");
    }

}
