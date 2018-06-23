/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Ginger
 */
public class MoveLocationView extends ViewBase{
    
    public MoveLocationView(){
        
    }
    
     @Override
    protected String getMessage(){
        return "Move Location\n"
                + "---------\n"
                + "Choose where you want to go\n"
                + "T - Temple\n"
                + "C - Ruler's Court\n"
                + "V - The Village\n"
                + "F - Fields\n"
                + "S - Storehouse\n"
                + "G - Granary\n"
                + "R - River\n"
                + "U - Undeveloped Land\n"
                + "B - Lamanite Border\n\n";
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
            case "T":
                System.out.println("You are in the Temple.\n Here's a hint: ");
                break;
            case "C":
                System.out.println("You are in the Ruler's Court.\n Here's a hint: ");
                break;
            case "V":
                System.out.println("You are in the The Village.\n Here's a hint: ");
                break;
            case "F":
                System.out.println("You are in the Fields.\n Here's a hint: ");
                break;
            case "S":
                System.out.println("You are in the Storehouse.\n Here's a hint: ");
                break;
            case "G":
                System.out.println("You are in the Granary.\n Here's a hint: ");
                break;
            case "R":
                System.out.println("You are at the River.\n Here's a hint: ");
                break;
            case "U":
                System.out.println("You are in Undeveloped Land.\n Here's a hint: ");
                break;
            case "B":
                System.out.println("You are at the Lamanite Border.\n Here's a hint: ");
                break;
            case "M":
                return false;
                
        }
        
        return true;
    }
    
    private void startNewGame() {
        StartNewGameView view = new StartNewGameView();
        view.displayView();
    }
    
    private void helpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayView();
    }
    
    private void loadSavedGame() {
        System.out.println("** ***DO LATER thing2");
    }
}
