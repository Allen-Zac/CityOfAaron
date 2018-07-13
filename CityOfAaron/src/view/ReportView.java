/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import cityofaaron.CityOfAaron;
import control.StorehouseControl;
import model.Game;
import model.InventoryItem;
import model.Storehouse;

/**
 *
 * @author Ginger
 */
public class ReportView extends ViewBase{
    
    public ReportView(){
        
    }
    
    @Override
    protected String getMessage(){
        return  "Report Menu\n"
                + "---------\n"
                + "A - View animals in the storehouse.\n"
                + "T - View tools in the storehouse.\n"
                + "F - Print the tools to a file.\n"
                + "P - View provisions in the storehouse\n"
                + "G - View authors of this game.\n"
                + "M - Main Menu\n";
                
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
        switch (inputs[0].trim().toUpperCase()) {
            case "A":
                this.console.println("You have 800 goats.");
                break;
            case "T":
                displayTools();
                break;
            case "F":
                printTools();
                break;
            case "P":
                displayProvisions();
                break;
            case "G":
                this.console.println("The authors of the game are Zac, Kayla, and Ethan.");
                break;
            case "M":
                gameMenu();
                return false;
                
        }
        
        return true;
    }
    
    private void gameMenu(){
        GameMenuView view = new GameMenuView();
        view.displayView(); 
    }
    
    private void displayTools() {
        StorehouseControl storehouseControl = new StorehouseControl();
     
        storehouseControl.storehouseTools();
    }
    
    private void printTools() {
        this.console.println("Coming Soon.");
    }
    
    private void displayProvisions() {
        this.console.println("Wheat, Water, Seed, Fertilizer");
        
        Game game = CityOfAaron.getCurrentGame();
        game.getTheStorehouse().getProvisions();
    }
}
