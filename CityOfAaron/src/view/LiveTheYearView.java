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
public class LiveTheYearView extends ViewBase{
    
    public LiveTheYearView(){
        
    }
    
    @Override
    protected String getMessage(){
        return  "Live the Year\n"
                + "---------\n"
                + "Functionality Coming Soon\n"
                + "G - Return to Game Menu";
                
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
        
        // Repeat for each input you need, putting it into its proper slot in the array.
        
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
            case "G":
                gameMenu();
                return false;
                
        }
        
        return true;
    }
    
    private void gameMenu(){
        GameMenuView view = new GameMenuView();
        view.displayView();
        
    }
}
