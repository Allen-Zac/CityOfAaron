/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import exceptions.LandControlException;
import control.LandControl;

/**
 *
 * @author Ethan Russon
 */
public class BuyLandView extends ViewBase {
     /**
     * Constructor
     */
    public BuyLandView(){
        super();
    }
    
    @Override
    protected String getMessage() {
        return "If you have sufficient people to work the land, purchasing more land\n"
                + "is the best way to raise your chances of providing sufficient food to your people.";
    }

    /**
     * Get the set of inputs from the user.
     * @return 
     */
    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];
        
        inputs[0] = getUserInput("Land costs 20 bushels per acre.\n"
                + "How many acres would you like to purchase? Enter the number below.", true);
        
        return inputs;
    }
    
    
    /**
     * Perform the action indicated by the user's input.
     * @param inputs
     * @return true if the view should repeat itself, and false if the view
     * should exit and return to the previous view.
     */
    @Override
    public boolean doAction(String[] inputs){
        if (inputs[0] == null || inputs[0].equals("")) {
            System.out.println("No value entered. Returning to the Game Menu...");
            return false;
        }

        buyLand();
        
        return false;
    }

    private void buyLand() {
        LandControl land = new LandControl();
        try {
            land.buyLand(300, 100, 5);
        }
        catch(LandControlException ie) {
            System.out.println(ie.getMessage());
        }
    }
}