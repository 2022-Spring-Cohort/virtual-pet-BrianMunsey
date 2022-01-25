package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {

        VirtualPetApplication myMain = new VirtualPetApplication();
        myMain.game();
    }

    public void game() {
        Scanner userInput;
        userInput = new Scanner(System.in);
        String action = "";
        System.out.println("Enter Dog name");
        String dogName = userInput.nextLine();
        VirtualPet mysteriousDog = new VirtualPet(dogName, 5,5,false,5);
        System.out.println(greeting());
        while (action != "end") {
            System.out.println("Type help for a list of commands");
            action = userInput.nextLine();
            mysteriousDog.tick();
            if(action.contains("help")) {
                help();
            }
            else if (action.contains("feed")) {
                mysteriousDog.feed();
            }
            else if (action.contains("run")) {
                mysteriousDog.run();
            }
            else if (action.contains("energy")) {
                mysteriousDog.getEnergy();
            }
            else if (action.contains("hunger")) {
                mysteriousDog.getHunger();
            }
            else if (action.contains("thirst level")) {
                mysteriousDog.getThirstLevel();
            }
            else if (action.contains("give water")) {
                mysteriousDog.water();
            }
            else if(action.contains("thirst")) {
                mysteriousDog.thirst();
            }
            else if(action.contains("name")) {
                mysteriousDog.getName();
            }
            else if (action.contains("end")) {
                action = "end";
            }
        }
    }

    public void help() {
        System.out.println("Commands are: feed, run, energy, hunger, thirst, thirst level");
        System.out.println("give water, name, end - to end program");
    }

    public String greeting() {
        return "Ah! Hello human welcome to your virtual pet";
    }

}
