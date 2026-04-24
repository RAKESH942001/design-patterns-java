package org.example.structuralPattern.adapterPattern;

import java.util.*;

public class CarDealerClient {

    public List<Car> getCarList(){

        List<Car> carList=new ArrayList<>();

        Car indianCar=new IndianCar("Punch","TATA",1000000);

       carList.add(new ForeginCarAdpater(new ForeginCar("Spectre","Rolls Royse",20000000)));

        carList.add(indianCar);
        return carList;

    }
}
