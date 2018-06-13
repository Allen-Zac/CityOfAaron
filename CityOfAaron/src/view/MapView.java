package view;

import java.util.Scanner;

/**
 *
 * @author Zac Allen
 */
public class MapView {
    /**
     * The message that will be displayed by this view.
     */
    protected String message;
    
    /**
     * Constructor
     */
    public MapView(){
        
        message = " T | C | V | F | R \n"
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
     * Get the user's input. Keep prompting them until they enter a value.
     * @param prompt
     * @param allowEmpty - determine whether the user can enter no value (just a return key)
     * @return 
     */
    protected String getUserInput(String prompt, boolean allowEmpty){
        
        Scanner keyboard = new Scanner(System.in);
        String input = "";
        boolean inputReceived = false;
        
        while(inputReceived == false){
            
            System.out.println(prompt);
            input = keyboard.nextLine();
            
            // Make sure we avoid a null-pointer error.
            if (input == null){
                input = "";
            }
            
            // Trim any trailing whitespace, including the carriage return.
            input = input.trim();
            
            if (input.equals("") == false || allowEmpty == true){
                inputReceived = true;
            }
        }
        
        return input;
    }
    
    
    /**
     * An overloaded version of getUserInput that sets allowEmpty to false so we don't have 
     * to type it ourselves.
     * @param prompt
     * @return 
     */
    protected String getUserInput(String prompt){
        return getUserInput(prompt, false);
    }
    
    /**
     * Get the set of inputs from the user.
     * @return 
     */
    public String[] getInputs() {
        
       //No other inputs
        
        return null;
    }
    
    
    /**
     * Perform the action indicated by the user's input.
     * @param inputs
     * @return true if the view should repeat itself, and false if the view
     * should exit and return to the previous view.
     */
    public boolean doAction(String[] inputs){
       
        
        
        //Return false so whoever calld us doesn't call us again.
        return false;
    }
    
    
    /**
     * Control this views display/prompt/action loop until the user
     * chooses and action that causes this view to close.
     */
    public void displayView(){
        
        boolean keepGoing = true;
        
        while(keepGoing == true){
            
            System.out.println(message);
            String[] inputs = getInputs();
            keepGoing = doAction(inputs);
        }
    }

}
