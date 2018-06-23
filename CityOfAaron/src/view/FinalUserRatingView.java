/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Zac Allen
 */
public class FinalUserRatingView extends ViewBase {
        /**
     * Constructor
     */
    public FinalUserRatingView(){
        super();
    }
    
    @Override
    protected String getMessage() {
        return "\nFinal Rating:\n"
                + "---------\n"
                + "Based on how many people died each year, your final rating is "
                + "100. Thanks for playing!\n";
    }

    /**
     * Get the set of inputs from the user.
     * @return 
     */
    @Override
    public String[] getInputs() {
        return null;
    }
    
    
    /**
     * Perform the action indicated by the user's input.
     * @param inputs
     * @return true if the view should repeat itself, and false if the view
     * should exit and return to the previous view.
     */
    @Override
    public boolean doAction(String[] inputs){
        return false;
    }
}
