package com.ing.zoo;

import java.util.Objects;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        // declare the animals
        Lion henk = new Lion("henk");
        Hippo elsa = new Hippo("elsa");
        Pig dora = new Pig("dora");
        Tiger wally = new Tiger("wally");
        Zebra marty = new Zebra("marty");
        Gorilla gorilla = new Gorilla("Harambe");
        Snake snake = new Snake("");

        // makes a zoo for animals
        Zoo artis = new Zoo();
        // adds the animals to the zoo
        artis.addAnimal(henk);
        artis.addAnimal(elsa);
        artis.addAnimal(dora);
        artis.addAnimal(wally);
        artis.addAnimal(marty);
        artis.addAnimal(gorilla);
        artis.addAnimal(snake);

        //scanner for the user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Voer uw command in: (typ 'leave' om het programma te stoppen)");
        String input = scanner.nextLine();

        // while the user hasn't typed the leave command ask for command
        while (!Objects.equals(input, "leave")) {
            // find index of the space
            int spaceIndex = input.indexOf(' ');
            // get the animal name from the string sequence after the space
            String animalName = input.substring(spaceIndex + 1);
            // if the user input has hello a specific animal will respond hello
            // else make all animals say hello
            if (input.contains(Zoo.COMMANDS[0])) {
                if (input.length() > Zoo.COMMANDS[0].length()) {
                    artis.animalSayHello(animalName);
                } else {
                    artis.everyoneSayHello();
                }
                // makes all animal that can eat leaves
            } else if (input.equals(Zoo.COMMANDS[1])) {
                artis.giveLeaves();
                // makes all animal that can eat meat
            } else if (input.equals(Zoo.COMMANDS[2])) {
                artis.giveMeat();
                // makes all animal that can eat meat perform a trick
            } else if (input.equals(Zoo.COMMANDS[3])) {
                artis.performTrick();
            } else {
                // helps the user after incorrect input
                System.out.println("Onbekende command! probeer nog eens!");
                System.out.printf("Geldige commands zijn: %s, %s, %s, %s.\n", Zoo.COMMANDS[0], Zoo.COMMANDS[1],
                        Zoo.COMMANDS[2], Zoo.COMMANDS[3]);
            }
            System.out.println("Voer uw command in: (typ 'leave' om het programma te stoppen)");
            input = scanner.nextLine();
        }

    }
}
