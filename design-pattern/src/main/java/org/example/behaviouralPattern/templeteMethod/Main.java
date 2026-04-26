package org.example.behaviouralPattern.templeteMethod;

public class Main {

    public static void main(String[] args) {
        Beverage tea = new Tea();
        System.out.println("--- Making Tea ---");
        tea.prepareBeverage();

        System.out.println();

        Beverage coffee = new Coffee();
        System.out.println("--- Making Coffee ---");
        coffee.prepareBeverage();

    }
}
