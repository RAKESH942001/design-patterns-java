package org.example.structuralPattern.decoratorPattern;

public class Driver {
    public static void main(String[] args) {
        Burger burger = new ZingerBurger();
// Output: "Zinger Burger , 180.0"

        burger = new ExtraMayoBurger(burger);
    }
}
