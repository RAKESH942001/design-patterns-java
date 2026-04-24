package org.example.structuralPattern.adapterPattern;

public class ForeginCarAdpater implements Car{

    ForeginCar foreginCar;
    public ForeginCarAdpater(ForeginCar foreginCar) {
        this.foreginCar=foreginCar;
    }

    @Override
    public String getName() {
        return  foreginCar.getCarName();
    }

    @Override
    public String getBrand() {
        return foreginCar.getCarBrand();
    }

    @Override
    public double getPrice() {
        return foreginCar.getCarPrice();
    }
}
