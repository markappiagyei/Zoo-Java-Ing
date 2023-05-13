package com.ing.zoo;

import java.util.Random;

public class Gorilla extends Animal{
    public String trick;
    public Gorilla(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        this.helloText = "Oeeh oeeehh ahh ahahah";
        System.out.println(helloText);
    }

    @Override
    public void eatMeat() {
        eatText = "oehh oehhh AHAH *beats chest*";
        System.out.println(eatText);
    }


    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if (rnd == 0) {
            trick = "rolls in the mud";
        } else {
            trick = "beating his chest";
        }
        System.out.println(trick);

    }
}
