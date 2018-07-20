package view;

import cityofaaron.CityOfAaron;
import model.Game;

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
                this.console.println("Coming Soon!");
                break;
            case "C":
                viewCrops();
                break;
            case "L":
                this.console.println("Coming Soon!");
                break;
            case "R":
                reportsMenu();
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
    
    private void viewTithing() {
        PayTithingView tithing = new PayTithingView();
        tithing.displayView();
    }
    
    private void viewCrops() {
        ManageTheCropsView crops = new ManageTheCropsView();
        crops.displayView();
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
    
    private void reportsMenu() {
        ReportView reports = new ReportView();
        reports.displayView();
    }
}
