/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author CarsonFullmer
 */
public class MainMenuView extends ViewBase {
    

    
   
    public MainMenuView(){
        
    }
    
    @Override
    protected String getMessage(){
        return "Main Menu\n"
                + "---------\n"
                + "N - Start a New Game\n"
                + "L - Load a Saved Game\n"
                + "H - Help Menu\n"
                + "Q - Quit\n";
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
            case "N":
                startNewGame();
                break;
            case "L":
                loadSavedGame();
                break;
            case "H":
                helpMenu();
                break;
            case "Q":
                System.out.println("Thanks for playing!");
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


