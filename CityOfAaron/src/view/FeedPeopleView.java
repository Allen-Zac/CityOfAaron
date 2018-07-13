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
public class FeedPeopleView extends ViewBase {
     /**
     * Constructor
     */
    public FeedPeopleView(){
        super();
    }
    
    @Override
    protected String getMessage() {
        return "Your people need 10 bushels per person to survive the year.";
    }

    /**
     * Get the set of inputs from the user.
     * @return 
     */
    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];
        
        inputs[0] = getUserInput("How many bushels of wheat will you leave for your people?\n"
                + "Enter the number below:", true);
        
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
            ErrorView.display(this.getClass().getName(), "No Value Entered. Returning to Game Menu...");
            return false;
        }
        
        sellLand();
        
        return false;
    }

    private void sellLand() {
        this.console.println("Entered value will be checked to see if the player has sufficient wheat.\n");
    }
}