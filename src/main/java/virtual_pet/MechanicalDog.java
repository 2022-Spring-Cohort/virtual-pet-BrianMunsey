package virtual_pet;

public class MechanicalDog extends VirtualPet{

    private int oilNeeds = 5;
    private int maintenanceNeeds =5;


    public MechanicalDog(String name, int hunger, int thirst, int boredom, int oilNeeds, int maintenanceNeeds) {
        super(name, hunger, thirst, boredom);
        this.oilNeeds = oilNeeds;
        this.maintenanceNeeds = maintenanceNeeds;
    }

    public MechanicalDog(String name) {
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
        if (maintenanceNeeds < 0) {
            oilNeeds = 0;
        }
    }

    public void wearAndTear() {
        oilNeeds += 2;
        maintenanceNeeds += 2;
    }
}
