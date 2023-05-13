package com.ing.zoo;

import java.util.Random;

public class Zebra extends Animal{
    public String trick;

    public Zebra(String name)
    {
        super(name);
    }
    @Override
    public void sayHello()
    {
        helloText = "zebra zebra";
        System.out.println(helloText);
    }
    @Override
    public void eatLeaves()
    {
        eatText = "munch munch zank yee bra";
        System.out.println(eatText);
    }
    @Override
    public void performTrick(){
        Random random = new Random();
        int rnd = random.nextInt(2);
        if (rnd == 0) {
            trick = "starts galloping";
        } else {
            trick = "runs in circles";
        }
        System.out.println(trick);
    }
}
