package com.ing.zoo;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Zoo {
    private ArrayList<Animal> animals;
    public static final String[] COMMANDS = new String[4];

    public Zoo() {
        this.animals = new ArrayList<>();

        COMMANDS[0] = "hello";
        COMMANDS[1] = "give leaves";
        COMMANDS[2] = "give meat";
        COMMANDS[3] = "perform trick";
    }

    /**
     * A for loop that makes all animals say hello
     */
    public void everyoneSayHello() {
        for (Animal animal : animals) {
            animal.sayHello();
        }
    }

    /**
     * A for loop that goes through all animals with the given animalName
     * if it's not found it gives an error
     * @param animalName
     */
    public void animalSayHello(String animalName) {
        boolean found = false;
        for (Animal animal : animals) {
            if (animal.name.equalsIgnoreCase(animalName)) {
                animal.sayHello();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Dier met de naam " + animalName + " is niet gevonden.");
        }
    }

    /**
     * Adds an animal to the list of the zoo
     * @param animal
     * @return
     */
    public boolean addAnimal(Animal animal) {

        return this.animals.add(animal);
    }

    /**
     * Gives leaves to all animals that like it
     */
    public void giveLeaves(){
        for (Animal animal:animals) {
            animal.eatLeaves();

        }
    }

    /**
     * Gives meat to all animals that like it
     */
    public void giveMeat(){
        for (Animal animal:animals) {
            animal.eatMeat();
        }
    }

    /**
     * Make the animals that can perform a trick
     */
    public void performTrick(){
        for (Animal animal:animals) {
            animal.performTrick();
        }
    }

}
