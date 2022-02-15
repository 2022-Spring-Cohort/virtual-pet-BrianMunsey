package virtual_pet;

public class MechanicalCat extends VirtualPet{

    private int oilNeeds = 5;
    private int maintenanceNeeds =5;

    public MechanicalCat(String name, int hunger, int thirst, int boredom, int oilNeeds, int maintenanceNeeds) {
        super(name, hunger, thirst, boredom);
        this.oilNeeds = oilNeeds;
        this.maintenanceNeeds = maintenanceNeeds;
    }

    public MechanicalCat(String name) {
        super(name);
    }

    public int getOilNeeds() {
        return oilNeeds;
    }

    public int getMaintenanceNeeds() {
        return maintenanceNeeds;
    }

    @Override
    public String returnStatus() {
        return "\n" + formatPetNameWithSpaces() + " | hunger = " + getHunger() + " | thirst = " + getThirst() + " | boredom = " + getBoredom() + " | oil needs = " + oilNeeds + " | maintenance needs = " + maintenanceNeeds;
    }

    public void oilPet() {
        oilNeeds -= 4;
        if (oilNeeds < 0) {
            oilNeeds = 0;
        }
    }

    public void maintainPet() {
        maintenanceNeeds -= 4;
    }

    public void wearAndTear() {
        oilNeeds += 2;
        maintenanceNeeds += 2;
    }
}
