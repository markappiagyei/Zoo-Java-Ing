package com.ing.zoo;

import java.util.Random;

public class Snake extends Animal{
    public String trick;
    public Snake(String name) {
        super(name);

    }

    @Override
    public void sayHello() {
        this.helloText = "HISSSSSSSSSsssssss";
        System.out.println(helloText);
    }

    @Override
    public void eatMeat() {
        eatText = "NOMNONMNOM SSSSssssTT THANKSSSSSssss";
        System.out.println(eatText);
    }


    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if (rnd == 0) {
            trick = "slithering in the grass";
        } else {
            trick = "starts playing dead";
        }
        System.out.println(trick);
    }
}
