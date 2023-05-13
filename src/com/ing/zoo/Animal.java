package com.ing.zoo;

public class Animal {
    protected String name;
    protected String helloText;
    public String eatText;

    public Animal(String name) {
        this.name = name;
    }

    public void sayHello() {
        helloText = "Maakt nog even geen geluid";
        System.out.println(helloText);
    }

    public void eatLeaves(){
    }

    public void eatMeat( ){
    }

    public void performTrick(){
    }

    @Override
    public String toString() {
        return
               "animal= " + getClass().getSimpleName() +
                ", name= " + name;
    }
}
