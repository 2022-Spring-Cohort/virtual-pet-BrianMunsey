package virtual_pet;

import java.util.Scanner;
import java.time.Clock;
import java.time.Duration;

public class VirtualPetTest {


    private String name;
    private int hunger;
    private boolean thirst;
    private boolean energy;

    public VirtualPetTest(String name, int hunger, boolean thirst, boolean energy) {
        this.name = name;
        this.hunger = hunger;
        this.thirst = thirst;
        this.energy = energy;
    }

    public String getName() {
        return name;
    }

    public int getHunger() {
        return hunger;
    }

    public boolean getThirst() {
        return thirst;
    }

    public boolean isEnergy() {
        return energy;
    }

    public void thirst() {
        if (thirst == false) {
            System.out.println("I'm good don't need any water");
        }
        else {
            System.out.println("I am thirsty could you get me some please human");
        }
    }

    public void water() {
        if (thirst == true) {
            thirst = false;
            System.out.println("Thanks Human I needed that");
            //time.tick(time, thirtyMinutes);
        }
        else if (thirst == false) {
            System.out.println("I'm good on water no thanks human");
        }
        else {
            System.out.println("I'm feeling thirsty please give me some water");
        }
    }

    public void feed() {
        if (hunger < 5) {
            for (hunger = 0; hunger <= 8; hunger++) {
                if (hunger == 8) {
                    System.out.println("Thanks human!");
                    energy =true;
                    //time.tick(time, thirtyMinutes);
                }
            }
        }
        else {
            System.out.println("No thanks human I'm not hungry yet.");
            energy = true;
        }
    }

    public void run() {
        if (energy == true && hunger >= 5) {
            for (hunger = hunger; hunger >= 2; hunger--)
            energy = false;
            System.out.println("That was fun did you see all those squirrels, I almost got one!!!");
            //time.tick(time, thirtyMinutes);
        }
        else {
            System.out.println("I'm tuckered out maybe some food to help replenish!");
        }
    }

    public void energy() {
        if (energy == true) {
            System.out.println("I got energy and I'm ready to go!");
        }
        else {
            System.out.println("I have no energy maybe some food to help!");
        }
    }



    Clock time = Clock.systemDefaultZone();
    Duration thirtyMinutes = Duration.ofMinutes(30);
    Clock runTime = time.tick(time, thirtyMinutes);



    public void game() {
        Scanner userInput;
        userInput = new Scanner(System.in);
        System.out.println(greeting());
        String action = "";

        while (action != "end") {
            action = userInput.nextLine();
            if (action.contains("feed")) {
                feed();
            }
            else if (action.contains("run")) {
                run();
            }
            else if (action.contains("get energy")) {
                energy();
            }
            else if (action.contains("get hunger")) {
                System.out.println(hunger);
            }
            else if (action.contains("thirst")) {
                thirst();
            }
            else if (action.contains("give water")) {
                water();
            }
            else if(action.contains("name")) {
                System.out.println(name);
            }
            else if (action.contains("end")) {
                action = "end";
            }
        }
    }

      public String greeting() {
        return "Ah! thank you human you have granted me a name and now my magical gifts have returned"
                + " \nI'm famished would you please feed me some food!";
    }
}

