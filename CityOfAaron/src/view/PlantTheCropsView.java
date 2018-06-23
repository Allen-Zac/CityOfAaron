/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Ginger
 */
public class PlantTheCropsView extends ViewBase{
    
    public PlantTheCropsView(){
        
    }
    
     @Override
    protected String getMessage(){
        return "Plant the Crops\n"
                + "---------\n"
                + "How many acres of land do you want to plant?\n"
                + "****Functionality coming soon****"
                + "R - Return to Manage the Crops";
    }
    
    
    /**
     * Get the set of inputs from the user.
     * @return 
     */
    @Override
    public String[] getInputs() {
        
        // Declare the array to have the number of elements you intend to get 
        // from the user.
        String[] inputs = new String[1];
        inputs[0] = getUserInput("Type your selection:");
        
        
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
        switch (inputs[0].trim().toUpperCase()) {
            case "R":
                manageCropsMenu();
                return false;
                
        }
        
        return true;
    }
    
    private void manageCropsMenu(){
        ManageTheCropsView view = new ManageTheCropsView();
        view.displayView();
        
    }
}
