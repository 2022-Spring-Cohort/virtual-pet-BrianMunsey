package virtual_pet;

public class OrganicDog extends VirtualPet{

    private int cageNeeds = 3;

    public OrganicDog(String name, int hunger, int thirst, int boredom, int cageNeeds) {
        super(name, hunger, thirst, boredom);
        this.cageNeeds = cageNeeds;
    }

    public OrganicDog(String name) {
        super(name);
    }

    public int getCageNeeds() {
        return cageNeeds;
    }

    @Override
    public String returnStatus() {
        return "\n" + formatPetNameWithSpaces() + " | hunger = " + getHunger() + " | thirst = " + getThirst() + " | boredom = " + getBoredom() + " | cage needs = " + cageNeeds;
    }

    public void cleanStation() {
        cageNeeds -= 4;
    }

    public void cageNeeds() {
        cageNeeds -= 2;
    }

}
