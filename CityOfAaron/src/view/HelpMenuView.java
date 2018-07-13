/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import cityofaaron.CityOfAaron;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 *
 * @author cfull
 */

    
public class HelpMenuView {
    
    private String message;
    protected final BufferedReader keyboard = CityOfAaron.getInFile();
    protected final PrintWriter console = CityOfAaron.getOutFile();
    
    /**
     * The message that will be displayed by this view.
     */
    
    /**
     * Constructor
     */
    public HelpMenuView(){
        
        message = "Help Menu\n"
                + "---------\n"
                + "G - What are the goals of the game?\n"
                + "W - Where is the city of Aaron?\n"
                + "M - How do I move to another location?\n"
                + "D - How do I display a list of animals, provisions, and tools in the city storehouse?\n"
                + "B - Back to the main menu.\n";
                
    }
    
    
    /**
     * Get the user's input. Keep prompting them until they enter a value.
     * @param prompt
     * @param allowEmpty - determine whether the user can enter no value (just a return key)
     * @return 
     */
    protected String getUserInput(String prompt, boolean allowEmpty){
        
        boolean inputReceived = false;
        String input = null;
        try {
            input = this.keyboard.readLine();
        
            while(inputReceived == false){
            
                this.console.println(prompt);

                // Make sure we avoid a null-pointer error.
                if (input == null){
                    input = "";
                }

                // Trim any trailing whitespace, including the carriage return.
                input = input.trim();

                if (input.equals("") == false || allowEmpty == true){
                    inputReceived = true;
                }
            break;
            }
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(), "Error reading input.");

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
    public boolean doAction(String[] inputs){
        switch (inputs[0].trim().toUpperCase()) {
            case "G":
                this.console.println("The goal of the game is to make sure your "
                        + "citizens stay alive by planting and harvesting crops, "
                        + "feeding the people, paying tithes, buying and selling"
                        + "land, and making adjustments for rat plagues.");
                break;
            case "W":
                this.console.println("The city of Aaron is located in the jungles"
                        + "of South America.");
                break;
            case "M":
                this.console.println("To change locations, select the numbers that"
                        + "correspond to the location  you want to move to.");
                break;
            case "D":
                this.console.println("To display a list of animals, provisions, "
                        + "and tools, select the option from the gameplay menu.");
                break;
            case "B":
                return false;
                
        }
        
        return true;
    }
    
    
    /**
     * Control this view's display/prompt/action loop until the user
     * chooses and action that causes this view to close.
     */
    public void displayView(){
        
        boolean keepGoing = true;
        
        while(keepGoing == true){
            
            this.console.println(message);
            String[] inputs = getInputs();
            keepGoing = doAction(inputs);
        }
    }
    
    
    // Define your action handlers here. These are the methods that your doAction()
    // method will call based on the user's input. We don't want to do a lot of 
    // complex game stuff in our doAction() method. It will get messy very quickly.
    
    
    private boolean someActionHandler(){
        // Define whatever code you need here to accomplish the action.
        // You can make this a void method if you want. Whatever you need 
        // here, you are free to do.
        //
        // Generally, though, this is where you will call into your Control
        // classes to do the work of the application.
        
        return true;
    }
}

