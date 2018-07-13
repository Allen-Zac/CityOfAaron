package view;

import cityofaaron.CityOfAaron;
import control.GameControl;
import exceptions.GameControlException;
import java.io.IOException;
import model.Game;
/**
 *
 * @author Zac Allen
 */
public class LoadSavedGameView extends ViewBase {
     /**
     * Constructor
     */
    public LoadSavedGameView() {
        super();
    }
    
    @Override
    protected String getMessage() {
        return "What is the name of the file you would like to load?";
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
        
        inputs[0] = getUserInput("Enter file name:");
        
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
        String filePath = inputs[0];
        try {
            GameControl.loadGame(filePath);
        } catch(IOException | ClassNotFoundException ex) {
            ErrorView.display(this.getClass().getName(), "Sorry, game was not loaded.");
            return false;
        }
        GameMenuView load = new GameMenuView();
        load.displayView();
        
        return true;
    }
}
