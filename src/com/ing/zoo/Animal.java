package com.ing.zoo;

public class Animal {
    protected String name;
    protected String helloText;
    public String eatText;

    public Animal(String name) {
        this.name = name;
    }

    public void sayHello() {
        helloText = "Hallo";
        System.out.println(helloText);
    }

    /**
     * Standaardimplementatie van maakGeluid, we weten nog even niet welk geluid;
     */
    public void maakGeluid() {
        System.out.println("Maakt nog even geen geluid");
    }
}
