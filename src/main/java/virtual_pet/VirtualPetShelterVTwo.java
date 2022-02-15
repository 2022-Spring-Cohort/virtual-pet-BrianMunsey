package virtual_pet;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class VirtualPetShelterVTwo {

    private Map<String, VirtualPet> petShelter = new HashMap<>();

    public void admit(VirtualPet pet) {
        this.petShelter.put(pet.getName(), pet);
    }

    public VirtualPet findPet(String petName) {
        return this.petShelter.get(petName);
    }

    public Collection<VirtualPet> pets() {
        return this.petShelter.values();
    }

    public void adoptOut(String petName) {
        this.petShelter.remove(petName);
    }

    public void feedPets() {
        for (Entry<String, VirtualPet> fedPet : petShelter.entrySet()) {
            fedPet.getValue().feed();
        }
    }

    public void waterPets() {
        for (Entry<String, VirtualPet> wateredPet : petShelter.entrySet()) {
            wateredPet.getValue().water();
        }
    }

    public void runWithPets() {
        for (Entry<String, VirtualPet> runPet : petShelter.entrySet()) {
            runPet.getValue().run();
        }
    }

    public void oilPets() {
        for (Entry<String, VirtualPet> oilPet : petShelter.entrySet()) {
            if (oilPet.getValue() instanceof MechanicalCat) {
                ((MechanicalCat) oilPet.getValue()).oilPet();
            }
            if (oilPet.getValue() instanceof MechanicalDog) {
                ((MechanicalDog) oilPet.getValue()).oilPet();
            }
        }
    }

    public void maintainStuff() {
        for (Entry<String, VirtualPet> maintainPet : petShelter.entrySet()) {
            if(maintainPet.getValue() instanceof MechanicalCat) {
                ((MechanicalCat)maintainPet.getValue()).maintainPet();
            }
            if(maintainPet.getValue() instanceof MechanicalDog) {
                ((MechanicalDog)maintainPet.getValue()).maintainPet();
            }
        }
    }

    public void cageCleanPets() {
        for (Entry<String, VirtualPet> cageClean : petShelter.entrySet()) {
            if(cageClean.getValue() instanceof OrganicCat) {
                ((OrganicCat)cageClean.getValue()).cleanStation();
            }
            if(cageClean.getValue() instanceof OrganicDog) {
                ((OrganicDog)cageClean.getValue()).cleanStation();
            }
        }
    }

    public void wearAndTear() {
        for (Entry<String, VirtualPet> wearTear : petShelter.entrySet()) {
            if(wearTear.getValue() instanceof MechanicalDog) {
                ((MechanicalDog)wearTear.getValue()).wearAndTear();
            }
            if(wearTear.getValue() instanceof MechanicalCat) {
                ((MechanicalCat)wearTear.getValue()).wearAndTear();
            }
        }
    }

    public void cageNeedsMod() {
        for (Entry<String, VirtualPet> cageNeedsMod : petShelter.entrySet()) {
            if(cageNeedsMod.getValue() instanceof OrganicDog) {
                ((OrganicDog)cageNeedsMod.getValue()).cageNeeds();
            }
            if(cageNeedsMod.getValue() instanceof OrganicCat) {
                ((OrganicCat)cageNeedsMod.getValue()).cageNeeds();
            }
        }
    }




    public void tick() {
        for (Entry<String, VirtualPet> tickedPet : petShelter.entrySet()) {
            String key = tickedPet.getKey();
            petShelter.get(key).tick();
        }

    }

    public int getNumberOfPets() {
        return petShelter.size();
    }

    public boolean isThereADeadPet() {
        boolean doWeHaveADeadPet = false;
        for (Entry<String, VirtualPet> checkedPet : petShelter.entrySet()) {
            String key = checkedPet.getKey();
            if (petShelter.get(key).getIsThisPetDead()) {
                doWeHaveADeadPet = true;
            }
        }
        return doWeHaveADeadPet;
    }

    public String displayStatus() {
        String statusOfPets = "";
        for (VirtualPet eachPet : petShelter.values()) {
            statusOfPets += eachPet.returnStatus();
        }
        return statusOfPets;
    }



}