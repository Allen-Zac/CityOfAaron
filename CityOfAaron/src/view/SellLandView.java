/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Ethan Russon
 */
public class SellLandView extends ViewBase {
     /**
     * Constructor
     */
    public SellLandView(){
        super();
    }
    
    @Override
    protected String getMessage() {
        return "Sometimes sacrifice is necessary to provide for you people.";
    }

    /**
     * Get the set of inputs from the user.
     * @return 
     */
    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];
        
        inputs[0] = getUserInput("Land sells for 20 bushels of wheat per acre.\n"
                + "How many acres would you like to sell? Enter the number below.", true);
        
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
        
        sellLand();
        
        return false;
    }

    private void sellLand() {
        System.out.println("Entered acreage will be checked to see if the player has sufficient acres to sell.\n");
    }
}