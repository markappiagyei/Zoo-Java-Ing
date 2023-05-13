package com.ing.zoo;

import java.util.Random;

public class Lion extends Animal {
    public String trick;

    public Lion(String naam) {
        super(naam);
    }
    @Override
    public void sayHello() {
        helloText = "roooaoaaaaar";
        System.out.println(helloText);
    }

    @Override
    public void eatMeat() {
        eatText = "nomnomnom thx mate";
        System.out.println(eatText);
    }

    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if (rnd == 0) {
            trick = "super loud GROWWWWLLLLL";
        } else {
            trick = "jumps through burning ring";
        }
        System.out.println(trick);
    }
}


