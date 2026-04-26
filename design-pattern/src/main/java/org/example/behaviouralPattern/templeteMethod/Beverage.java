package org.example.behaviouralPattern.templeteMethod;

public abstract class Beverage {

    final void prepareBeverage() {
        boilWater();
        addIngredient();
        pourIntoCup();
        addCondiments();
    }

    void boilWater() {
        System.out.println("Boiling water...");
    }

    // Concrete — same for everyone
    void pourIntoCup() {
        System.out.println("Pouring into cup...");
    }

    // Abstract — child MUST override this
    abstract void addIngredient();

    // Hook — child CAN override, but doesn't have to
    void addCondiments() {
        // empty by default
    }

}
