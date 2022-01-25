package virtual_pet;

import java.util.Scanner;
public class VirtualPetApplication {

    private VirtualPetTest mysteriousDog = new VirtualPetTest("Mysterious Dog",2, true, false);

    public static void main(String[] args) {

        VirtualPetApplication myMain = new VirtualPetApplication();
        myMain.dogTestMethod();

    }

    public void dogTestMethod() {
        mysteriousDog.game();
    }


}
