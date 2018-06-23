/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
/**
 *
 * @author cfull
 */

   
public class StartProgramView extends ViewBase {
    
    
   
    
    /**
     * Constructor
     */
    public StartProgramView(){
        super();                
    }
    
    @Override
    protected String getMessage() {
        return "\nWelcome to the City of Aaron! You are the ruler of this land, so it is\n"
                + "your job to buy land, sell land, plant wheat, and pay tithing.\n"
                + "If your people don't get enough to eat, they will die. You\n"
                + "will also have to deal with rats eating your wheat. Good luck!\n";
    }
    
    @Override
    public String[] getInputs(){
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
       
        startMainMenuView();
        
        //Return false so whoever calld us doesn't call us again.
        return false;
    }
    
    
    
    
    private boolean someActionHandler(){
       
        
        return true;
    }
    
    private void startMainMenuView() {
        pause(2000);
        View  mainMenu = new MainMenuView();
        mainMenu.displayView();
    }
}

    


