package org.example.creational.builderPattern;

public class Driver {
    public static void main(String[] args) {

        Dog dog1=new DogBuilder().setName("Bruno").setGender("Male").setBreed("Lab").setPrice(20000).build();

        System.out.println(dog1);
    }
}
