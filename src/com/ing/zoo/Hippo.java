package com.ing.zoo;

public class Hippo extends Animal {

    public Hippo(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        this.helloText = "splash";
        System.out.println(helloText);
    }

    public void eatLeaves() {
        eatText = "munch munch lovely";
        System.out.println(eatText);
    }
}
