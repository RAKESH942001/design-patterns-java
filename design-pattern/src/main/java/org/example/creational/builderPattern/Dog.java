package org.example.creational.builderPattern;

public class Dog {

    private String name;
    private  String gender;
    private  String breed;
    private  double price;

    public Dog(DogBuilder builder){
        this.name= builder.getName();
        this.gender= builder.getGender();
        this.breed=builder.getBreed();
        this.price=builder.getPrice();
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getBreed() {
        return breed;
    }

    public double getPrice() {
        return price;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "name: " + name + ", gender: " + gender +
                ", breed: " + breed + ", price: " + price;
    }


}
