/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import cityofaaron.CityOfAaron;
import java.util.Scanner;
import model.Player;
import model.Game;
/**
 *
 * @author cfull
 */


public class StartNewGameView extends ViewBase{
    
    /**
     * Constructor
     */
    public StartNewGameView(){
                
    }
    
    @Override
    protected String getMessage() {
        return "Starting a new game\n";
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
        
        inputs[0] = getUserInput("Please enter your name, or press 'Enter' to return to the Main Menu:", true);
        
        // Repeat for each input you need, putting it into its proper slot in the array.
        
        return inputs;
    }
    @Override
    public boolean doAction(String[] inputs){
        if (inputs[0] == null || inputs[0].equals("")){
            System.out.println("No player name entered. Returning to Main Menu.");
            return false;
        }
        String playerName = inputs[0];
        createAndStartGame(playerName);
        return false;
    }
    
    private void createAndStartGame(String playerName){
        
        Player player = new Player();
        player.setName(playerName);
        
        Game game = new Game();
        game.setThePlayer(player);
        
        CityOfAaron.setCurrentGame(game);
        
        System.out.println();
        System.out.println("Welcome to the game, " + CityOfAaron.getCurrentGame().getThePlayer().getName() 
                        + ".");
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayView();
        
    }
}

