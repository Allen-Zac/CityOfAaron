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
public class ManageTheCropsView extends ViewBase{
    
    public ManageTheCropsView(){
        
    }
    
     @Override
    protected String getMessage(){
        return "Move Location\n"
                + "---------\n"
                + "What would you like to do?\n"
                + "B - Buy Land\n"
                + "S - Sell Land\n"
                + "F - Feed the People\n"
                + "P - Plant Crops\n"
                + "T - Pay Tithes and Offerings\n"
                + "G - Return to the Game Menu\n";
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
            case "B":
                buyLand();
                break;
            case "S":
                sellLand();
                break;
            case "F":
                feedThePeople();
                break;
            case "P":
                plantCrops();
                break;
            case "T":
                payTithing();
                break;
            case "G":
                gameMenu();
                return false;
                
        }
        
        return true;
    }
    
    private void buyLand() {
        BuyLandView view = new BuyLandView();
        view.displayView();
    }
    
    private void sellLand() {
        sellLandView view = new sellLandView();
        view.displayView();
    }
    
    private void feedThePeople() {
        FeedThePeopleView view = new FeedThePeopleView();
        view.displayView();
    }
    
    private void plantCrops() {
        PlantTheCropsView view = new PlantTheCropsView();
        view.displayView();
    }
    
    private void payTithing() {
        PayTithingView view = new PayTithingView();
        view.displayView();
    }
    
    private void gameMenu(){
        GameMenuView view = new GameMenuView();
        view.displayView();
        
    }
}
