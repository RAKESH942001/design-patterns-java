package org.example.creational.abstractFactoryMethod;

public class CheesePizza extends Pizza{

    public CheesePizza(PizzaIngredientFactory factory){
        this.pizzaIngredientFactory =factory;
    }


    @Override
    void prepare() {
        System.out.println("Preparing Cheese Pizza");
        doungh=pizzaIngredientFactory.createDought();
        sauce= pizzaIngredientFactory.createSauce();
        cheese= pizzaIngredientFactory.createCheese();

    }
}
