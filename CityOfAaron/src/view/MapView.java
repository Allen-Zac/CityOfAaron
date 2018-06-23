package view;

import java.util.Scanner;

/**
 *
 * @author Zac Allen
 */
public class MapView extends ViewBase {
    
    /**
     * Constructor
     */
    public MapView(){
        super();        
    }
    
    @Override
    protected String getMessage() {
        return " T | C | V | F | R \n"
                + "-------------------\n"
                + " F | F | S | G | R \n"
                + "-------------------\n"
                + " F | F | R | R | U \n"
                + "-------------------\n"
                + " R | R | U | U | U \n"
                + "-------------------\n"
                + " B | B | B | B | B \n\n"
                + "Key:\n\n"
                + "T - Temple\n"
                + "C - Ruler's Court\n"
                + "V - The Village\n"
                + "F - Fields\n"
                + "S - Storehouse\n"
                + "G - Granary\n"
                + "R - River\n"
                + "U - Undeveloped Land\n"
                + "B - Lamanite Border\n\n"
                + "In future weeks, we will populate this map by using a\n"
                + "multi-dimensional array.\n\n";
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
