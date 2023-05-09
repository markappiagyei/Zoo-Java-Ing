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

    public void eatLeaves()
    {
        eatText = "munch munch zank yee bra";
        System.out.println(eatText);
    }
}
