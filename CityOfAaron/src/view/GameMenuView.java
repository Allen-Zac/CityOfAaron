package view;

import java.util.Scanner;

/**
 *
 * @author Zac Allen
 */
public class GameMenuView extends ViewBase {
    
    /**
     * Constructor
     */
    public GameMenuView(){
        super();
        
        viewAnnualReport();
        
        //Will eventually only run after the final year using some logic like
        //if (year == 10) {finalUserRating();}, but for now, it will just display
        //it.
        finalUserRating();
    }
    
    @Override
    protected String getMessage() {
        return "Game Menu\n"
                + "---------\n"
                + "V - View the Map\n"
                + "M - Move to a New Location\n"
                + "C - Manage the Crops\n"
                + "L - Live the Year\n"
                + "R - Reports Menu\n"
                + "S - Save Game\n"
                + "Q - Return to the Main Menu\n";
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
            case "V":
                viewTheMap();
                break;
            case "M":
                System.out.println("Coming Soon!");
                break;
            case "C":
                System.out.println("Coming Soon!");
                break;
            case "L":
                System.out.println("Coming Soon!");
                break;
            case "R":
                System.out.println("Coming Soon!");
                break;
            case "S":
                saveTheGame();
                break;
            case "Q":
                return false;
                
        }
        
        return true;
    }
    
    private void viewTheMap() {
        MapView map = new MapView();
        map.displayView();
    }
    
    private void viewAnnualReport() {
        AnnualReportView annualReport = new AnnualReportView();
        annualReport.displayView();
    }
    
    private void finalUserRating() {
        FinalUserRatingView userRating = new FinalUserRatingView();
        userRating.displayView();
    }
    
    private void saveTheGame() {
        SaveGameView saveGame = new SaveGameView();
        saveGame.displayView();
    }
}
