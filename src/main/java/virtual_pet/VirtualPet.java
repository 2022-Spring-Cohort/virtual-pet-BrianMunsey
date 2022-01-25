package virtual_pet;

public class VirtualPet {


    private String name;
    private int hunger;
    private int thirstLevel;
    private boolean thirst;
    private int energy;

    public VirtualPet(String name, int hunger, int thirstLevel, boolean thirst, int energy) {
        this.name = name;
        this.hunger = hunger;
        this.thirstLevel = thirstLevel;
        this.thirst = thirst;
        this.energy = energy;
    }


    public void getName() {
        System.out.println(name);
    }

    public void getHunger() {
        System.out.println("My hunger is: " + hunger);
    }

    public void getEnergy() {
        System.out.println(energy);
    }
    public void getThirstLevel() {
        System.out.println("My thirst level is: " + thirstLevel);
    }

    public void thirst() {
        if (thirstLevel > 5 ) {
            System.out.println("I am thirsty could you get me some please human");
        }
        else {
            System.out.println("I'm good don't need any water");
        }
    }

    public void water() {
        if(thirstLevel > 5){
            thirstLevel = Math.max(1, thirstLevel -9);
            System.out.println("Thanks Human I needed that");
        }
        else {
            System.out.println("I'm good on water no thanks human");
        }

    }

    public void feed() {
        if (hunger > 5) {
            System.out.println("Thanks human that was delicious");
            hunger = 1;
            energy = energy + 8;
        }
        else {
            System.out.println("No thanks human I'm not hungry yet.");
        }
    }

    public void run() {
        if (energy > 2  && hunger < 6) {
            hunger = Math.min(10, hunger + 2);
            energy = Math.max(0, energy - 7);
            System.out.println("That was fun did you see all those squirrels, I almost got one!!!");
        }
        else {
            System.out.println("I'm tuckered out maybe some food to help replenish!");
        }
    }
    public void tick(){
        hunger = Math.min(10, hunger + 1);
        energy = Math.min(10, energy + 1);
        thirstLevel = Math.min(10, thirstLevel + 1);
    }
}

