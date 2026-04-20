package org.example.creational.adapterPattern;

public class ForeginCar {

        String name;
        String brand;
        double price;

        public ForeginCar(String name,String brand,double price) {
            this.name =name;
            this.brand=brand;
            this.price=price;
        }

        @Override
        public String getCarName() {
            return  name;
        }

        @Override
        public String getCarBrand() {
            return brand;
        }

        @Override
        public double getCarPrice() {
            return price;
        }
    }

