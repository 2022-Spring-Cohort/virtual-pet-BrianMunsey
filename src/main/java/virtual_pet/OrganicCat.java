package virtual_pet;

public class OrganicCat extends VirtualPet{

    private int litterBoxNeeds = 3;

    public OrganicCat(String name, int hunger, int thirst, int boredom, int litterBoxNeeds) {
        super(name, hunger, thirst, boredom);
        this.litterBoxNeeds = litterBoxNeeds;
    }

    public OrganicCat(String name) {
        super(name);
    }

    public int getLitterBoxNeeds() {
        return litterBoxNeeds;
    }

    @Override
    public String returnStatus() {
        return "\n" + formatPetNameWithSpaces() + " | hunger = " + getHunger() + " | thirst = " + getThirst() + " | boredom = " + getBoredom() + " | litter box needs = " + litterBoxNeeds;
    }

    public void cleanStation() {
        litterBoxNeeds -= 4;
    }

    public void cageNeeds() {
        litterBoxNeeds -= 2;
    }
}
