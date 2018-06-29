package view;

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
        return  "    0 | 1 | 2 | 3 | 4\n"
                + "--------------------\n"
                + "0 | T | C | V | F | R \n"
                + "--------------------\n"
                + "1 | F | F | S | G | R \n"
                + "--------------------\n"
                + "2 | F | F | R | R | U \n"
                + "--------------------\n"
                + "3 | R | R | U | U | U \n"
                + "--------------------\n"
                + "4 | B | B | B | B | B \n\n";
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
