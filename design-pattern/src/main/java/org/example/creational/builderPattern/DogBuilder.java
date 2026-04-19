package org.example.creational.builderPattern;

public class DogBuilder {

    private String name;
    private  String gender;
    private  String breed;
    private  double price;


    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getBreed() {
        return breed;
    }

    public String getGender() {
        return gender;
    }

    public DogBuilder setName(String name){
            this.name=name;
        return this;
    }

    public DogBuilder setBreed(String breed) {
        this.breed = breed;
        return this;
    }

    public DogBuilder setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public DogBuilder setPrice(double price) {
        this.price = price;
        return this;
    }

    public Dog build(){
        return new Dog(this);
    }
}
