package view;

import control.MapControl;
import exceptions.MapControlException;

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
        return  "\n--------The Map--------\n";
    }
    
    /**
     * Get the set of inputs from the user.
     * @return 
     */
    @Override
    public String[] getInputs() {
        
        displayMap();
        
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
    
    private void displayMap() {
        MapControl map = new MapControl();
        try {
            map.createLocations(5, 5);
        }
        catch(MapControlException x) {
            ErrorView.display(this.getClass().getName(), "Invalid rows and columns.");
        }
    }
}
