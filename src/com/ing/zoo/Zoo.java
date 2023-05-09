package com.ing.zoo;

import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {
    private ArrayList<Animal> animals;

    public Zoo() {
        this.animals = new ArrayList<>();
    }

    public Animal getAnimalByName(String animalName){
        Animal namedAnimal = null;
        for (Animal animal:animals) {
            if (animal.name.equals(animalName)){
                namedAnimal = animal;
            }
        }
        return namedAnimal;
    }

    public void everyoneSayHello() {
        for (Animal animal : animals) {
            System.out.println(animal.helloText);
        }
    }

    public void animalSayHello(String animalName) {
        Animal greetingAnimal = null;
        for (Animal animal : animals) {
            if (animal.name.equals(animalName)){
                greetingAnimal = animal;
            }
            assert greetingAnimal != null;
            System.out.println(greetingAnimal.helloText);
        }
    }

    public boolean addAnimal(Animal animal) {

        return this.animals.add(animal);
    }

    public static void main(String[] args) {
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        // declare the animals
        Lion henk = new Lion("henk");
        Hippo elsa = new Hippo("elsa");
        Pig dora = new Pig("dora");
        Tiger wally = new Tiger("wally");
        Zebra marty = new Zebra("marty");

        // makes a zoo for animals
        Zoo artis = new Zoo();

        artis.addAnimal(henk);
        artis.addAnimal(elsa);
        artis.addAnimal(dora);
        artis.addAnimal(wally);
        artis.addAnimal(marty);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        String input = scanner.nextLine();

        String twoWords = "Hello World";
        int spaceIndex = twoWords.indexOf(' ');
        String secondWord = twoWords.substring(spaceIndex+1);
        System.out.println(secondWord);
        
        input.
//        artis.animalSayHello(input);
        System.out.println(input.);

        System.out.println();

//        if (input.equals(commands[0] + artis.animals))) {
//            artis.animalSayHello();
//        } else if (input.equals("hello")) {
//            artis.everyoneSayHello();
//
//        } else {
//            System.out.println("Unknown command: " + input);
//        }
    }
}
