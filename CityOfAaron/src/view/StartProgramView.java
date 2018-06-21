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

   
public class StartProgramView extends ViewBase{
    
    
   
    
    /**
     * Constructor
     */
    public StartProgramView(){
        super();                
    }
    
    @Override
    protected String getMessage() {
        return "Welcome to our City called Aaron. You is da king bruh! You gotta buy the land, sell the land, plan dat wheat so your peeps don't die.\n " 
                + "Since you're the man in charge, you gotta make them pay thier taxes/tithes, or else they going straigh to hell.\n"
                + "If your people don't get enough grub, they gon' die and you got no mo slaves.\n"
                + "Them dang ol' rats gon' eat your wheat, so watch out, ya hear!";
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

    


