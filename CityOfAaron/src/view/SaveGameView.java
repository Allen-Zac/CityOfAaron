package view;

/**
 *
 * @author Zac Allen
 */
public class SaveGameView extends ViewBase {
     /**
     * Constructor
     */
    public SaveGameView() {
        super();
    }
    
    @Override
    protected String getMessage() {
        return "What is the name of the file where the game should be saved?";
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
        System.out.println("\nThe file has succesfully been saved to "
                + inputs[0] + ".\n");
        
        return false;
    }
}
