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


        public String getCarName() {
            return  name;
        }


        public String getCarBrand() {
            return brand;
        }


        public double getCarPrice() {
            return price;
        }
    }

