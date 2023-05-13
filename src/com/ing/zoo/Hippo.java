package com.ing.zoo;

import java.util.Random;

public class Hippo extends Animal {
    public String trick;

    public Hippo(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        this.helloText = "splash";
        System.out.println(helloText);
    }
    @Override
    public void eatLeaves() {
        eatText = "munch munch lovely";
        System.out.println(eatText);
    }

    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if (rnd == 0) {
            trick = "performs a watertrick";
        } else {
            trick = "starts dancing";
        }
        System.out.println(trick);
    }

}
