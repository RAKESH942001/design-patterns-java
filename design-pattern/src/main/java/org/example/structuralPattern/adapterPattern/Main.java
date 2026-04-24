package org.example.structuralPattern.adapterPattern;

import java.util.List;

public class Main {
    public static void main(String[] args) {
    CarDealerClient client=new CarDealerClient();

    List<Car> carsList=client.getCarList();
    for (Car c:carsList){
        System.out.println(c.getName()+"->"+ c.getPrice()+"->"+c.getBrand());
    }
    }
}
