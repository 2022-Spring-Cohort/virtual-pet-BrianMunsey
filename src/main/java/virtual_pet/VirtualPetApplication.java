package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        VirtualPetShelterVTwo vPetShelter = new VirtualPetShelterVTwo();
        Scanner userInput = new Scanner(System.in);
        String playerChoice = "";
        String dogChoice;

        vPetShelter.admit(new OrganicCat("Pepper"));
        vPetShelter.admit(new OrganicDog("Twinkie"));
        vPetShelter.admit(new MechanicalCat("Misty"));
        vPetShelter.admit(new MechanicalDog("Mellow"));

        System.out.println(greeting());

        while (!vPetShelter.isThereADeadPet() && playerChoice != "end") {
            playerChoice = userInput.nextLine();
            if (vPetShelter.getNumberOfPets() < 1) {
                System.out.println("Seems like we have ran out of pets and with that we have ran out of business better luck next time!");
            }
            if (playerChoice.contains("feed pets")) {
                System.out.println("Thanks I was just about to take care of that!");
                vPetShelter.feedPets();
                vPetShelter.tick();
            }
            else if (playerChoice.contains("help")) {
                System.out.println(help());
            }
            else if (playerChoice.contains("water pets")) {
                System.out.println("Thanks I was just about to take care of that!");
                vPetShelter.waterPets();
                vPetShelter.tick();
            }
            else if (playerChoice.contains("run with pets")) {
                System.out.println("Oh boy now you have to adopt one!");
                vPetShelter.runWithPets();
                vPetShelter.tick();
                vPetShelter.wearAndTear();
                vPetShelter.cageNeedsMod();
            }
            else if (playerChoice.contains("maintain pets")) {
                System.out.println("Those new parts just came in!");
                vPetShelter.maintainStuff();
                vPetShelter.tick();
            }
            else if (playerChoice.contains("clean stations")) {
                System.out.println("I hope you wore gloves doing that!");
                vPetShelter.cageCleanPets();
                vPetShelter.tick();
            }
            else if (playerChoice.contains("oil pets")) {
                System.out.println("If only they could do that themselves!");
                vPetShelter.oilPets();
                vPetShelter.tick();
            }
            else if (playerChoice.contains("pet status")) {
                System.out.println(vPetShelter.displayStatus());
            }
            else if (playerChoice.contains("adopt pet")) {
                System.out.println("How exciting! Now whats the name of the animal you would like to take home?");
                dogChoice = userInput.nextLine();
                dogChoice = dogChoice.substring(0,1).toUpperCase() + dogChoice.substring(1);
                vPetShelter.adoptOut(dogChoice);
                System.out.println(dogChoice + " is all yours enjoy!");
            }
            else if (playerChoice.contains("admit pet")) {
                System.out.println("We welcome all mechanical and organic pets, is it mechanical or organic?");
                String typeOptions = userInput.nextLine();
                if (typeOptions.contains("mechanical")) {
                    System.out.println("Mechanical? Great, now is it a dog or a cat?");
                    String creatureType = userInput.nextLine();
                    if (creatureType.contains("cat")) {
                        System.out.println("Whats the name of this mechanical cat?");
                        String nameChoice = userInput.nextLine();
                        vPetShelter.admit(new MechanicalCat(nameChoice));
                        System.out.println("Welcome " + nameChoice + ", we will find you a new home in no time!");
                    }
                    else {
                        System.out.println("Whats the name of this mechanical dog?");
                        String nameChoice = userInput.nextLine();
                        vPetShelter.admit(new MechanicalDog(nameChoice));
                        System.out.println("Welcome " + nameChoice + ", we will find you a new home in no time!");
                    }
                }
                else {
                    System.out.println("Organic it is! now is it a dog or a cat?");
                    String creatureType = userInput.nextLine();
                    if (creatureType.contains("cat")) {
                        System.out.println("Whats the name of this organic cat?");
                        String nameChoice = userInput.nextLine();
                        vPetShelter.admit(new OrganicCat(nameChoice));
                        System.out.println("Welcome " + nameChoice + ", we will find you a new home in no time!");
                    }
                    else {
                        System.out.println("Whats the name of this organic dog?");
                        String nameChoice = userInput.nextLine();
                        vPetShelter.admit(new OrganicDog(nameChoice));
                        System.out.println("Welcome " + nameChoice + ", we will find you a new home in no time!");
                    }
                }
            }
            else if (playerChoice.contains("end")) {
                playerChoice = "end";
            }
        }
        if (vPetShelter.isThereADeadPet()) {
            System.out.println("Seems like a pet has died and we are out of business better luck next time!");
        }
        System.out.println("GoodBye!");
    }

    public static String greeting() {
        return "Welcome to our Virtual Pet Shelter, we have mechanical and organic animals whatever " +
                "you need to suit your needs \nType (help) for commands";
    }

    public static String help() {
        return "Commands are as follows: help, feed pets, water pets, run with pets, oil pets, maintain pets, clean stations \n"
                + "adopt pet, admit pet, pet status, end- to end game";
    }
}