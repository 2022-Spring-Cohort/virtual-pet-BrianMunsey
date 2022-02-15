package virtual_pet;

public abstract class VirtualPet {

    private String name;
    private int hunger = 2;
    private int thirst = 2;
    private int boredom = 2;
    private boolean isThisPetDead = false;


    public VirtualPet(String name, int hunger, int thirst, int boredom) {
        this.name = name;
        this.hunger = hunger;
        this.thirst = thirst;
        this.boredom = boredom;
    }

    public String getName() {
        return name;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getBoredom() {
        return boredom;
    }

    public boolean getIsThisPetDead() {
        return isThisPetDead;
    }

    public VirtualPet(String name) {
        this.name = name;
    }



    public void feed() {
        this.hunger -= 10;
        if (this.hunger < 0) {
            this.hunger = 0;
        }
    }

    public void water() {
        this.thirst -= 10;
        if (this.thirst < 0) {
            this.thirst = 0;
        }
    }

    public void run() {
        this.boredom -= 10;
        if (this.boredom < 0) {
            this.boredom = 0;
        }
    }

    public void tick() {
        this.hunger += 1;
        this.thirst += 1;
        this.boredom += 1;
        if (this.hunger > 10 || this.thirst > 10 || this.boredom > 10) {
            this.isThisPetDead = true;
        }
    }

    public String formatPetNameWithSpaces() {
        if (this.name.length() == 16) {
            return this.name;
        } else if (this.name.length() < 16) {
            while (this.name.length() < 16) {
                this.name += " ";
            }
        } else {
            this.name = this.name.substring(0, 16);
        }
        return this.name;
    }

    public String returnStatus() {
        return "\n" + formatPetNameWithSpaces() + " | hunger = " + getHunger() + " | thirst = " + getThirst() + " | boredom = " + getBoredom();
    }

    @Override
    public String toString() {
        return name + " " + hunger + " " + thirst + " " + boredom;
    }
}