package com.ing.zoo;

public class Lion extends Animal {

    public Lion(String naam) {
        super(naam);
    }

    public void sayHello() {
        helloText = "roooaoaaaaar";
        System.out.println(helloText);
    }

    public void eatMeat() {
        eatText = "nomnomnom thx mate";
        System.out.println(eatText);
    }
}
