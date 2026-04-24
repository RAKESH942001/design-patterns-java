package org.example.structuralPattern.adapterPattern;

public class IndianCar implements Car{

    String name;
    String brand;
    double price;

    public IndianCar(String name,String brand,double price) {
        this.name =name;
        this.brand=brand;
        this.price=price;
    }

    @Override
    public String getName() {
            return  name;
    }

    @Override
    public String getBrand() {
    return brand;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
