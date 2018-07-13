package view;

import control.LandControl;
import exceptions.LandControlException;

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
            ErrorView.display(this.getClass().getName(), "No value entered. Returning to Game Menu.");
            return false;
        }
        
        sellLand();
        
        return false;
    }

    private void sellLand() {
        LandControl land = new LandControl();
        try {
            land.sellLand(20, 10, 200);
        }
        catch(LandControlException ie) {
            this.console.println(ie.getMessage());
        }
    }
}