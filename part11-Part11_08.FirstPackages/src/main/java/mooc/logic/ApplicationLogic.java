package mooc.logic;

import mooc.ui.UserInterface;

public class ApplicationLogic {
    private UserInterface uii;
    
    public ApplicationLogic(UserInterface ui) {
        uii = ui;
    }
    public void execute(int times) {
        for(int i = 0; i<times; i++) {
            System.out.println("Application logic is working");
            uii.update();
        }
    }
}
