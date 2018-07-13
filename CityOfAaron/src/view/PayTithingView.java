/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.HarvestControl;
import exceptions.HarvestControlException;

/**
 *
 * @author Ethan Russon
 */
public class PayTithingView extends ViewBase {
     /**
     * Constructor
     */
    public PayTithingView(){
        super();
    }
    
    @Override
    protected String getMessage() {
        return "The Lord has commanded that we pay 10% of our gains in Tithing.\n"
                + "This is not required, but remember that the Lord has promised\n"
                + "that those who are obedient will prosper in the land.";
    }

    /**
     * Get the set of inputs from the user.
     * @return 
     */
    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];
        
        inputs[0] = getUserInput("If you wish to pay tithing, you may choose\n"
                + "to pay between 8 and 12 percent of your earnings this year.\n"
                + "Please enter a whole number from 7 and 12.\n\n"
                + "If you have changed your mind, simply enter nothing\n"
                + "and you will be returned to the Game Menu.", true);
        
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
            ErrorView.display(this.getClass().getName(), "No Value Entered. Returning to Game Menu.");
            return false;
        }

        try {
            int percentage = Integer.parseInt(inputs[0]);
            calcTithingPaid(percentage);
        } 
        catch (NumberFormatException nfe) {
                        ErrorView.display(this.getClass().getName(), "Incorrect value. Tithing not paid, please come back and try again.\n"
                                + "Returning to the Game Menu...");
        } 
        
        return false;
    }

    private void calcTithingPaid(int percentage) {
        HarvestControl plant = new HarvestControl();
        try {
            plant.plantCrops(10, -1, 10);
        }
        catch(HarvestControlException ie) {
            this.console.println(ie.getMessage());
        }
    }
}