package org.example.creational.factoryMethod;

public  abstract class Pizza {

    String sauce;
    String name;


    void prepare(){
        System.out.println("Preparing -->"+name);
        System.out.println("Adding Sauce-->"+sauce);
    }

    void bake(){
        System.out.println("Baking " + name + " at 350°F for 25 mins");
    }

    void cut(){
        System.out.println("making  " + name + " into cut");
    }

    public String getName(){
        return name;
    }



}
