package control;

import cityofaaron.CityOfAaron;
import model.Player;
import model.Game;
import model.Map;
import model.Storehouse;
import exceptions.GameControlException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import view.SaveGameView;

/**
 *
 * @author Zac Allen
 */
public class GameControl {
    public static void createNewGame(Player thePlayer, Map theMap, Storehouse theStorehouse) 
        throws GameControlException {
        if (thePlayer == null) {
            throw new GameControlException("The Player cannot be empty.");
        }
        
        Game game = new Game();
        game.setThePlayer(thePlayer);
        
        game.setAcresOwned(1000);
        
        game.setCurrentPopulation(100);
        
        game.setCurrentYear(1);
        
        game.setTheMap(theMap);
        
        game.setTheStorehouse(theStorehouse);
        
        game.setWheatInStorage(2700);
        
        CityOfAaron.setCurrentGame(game);
    }
    
    
    public void writeObject(ObjectOutputStream objectStream)
        throws IOException {
            
        }
    
    public void readObject(ObjectInputStream objectStream)
        throws IOException, ClassNotFoundException {
        
        }
    
    public static void saveGame(Game game, String filePath) 
        throws IOException {
            if (game == null || filePath == null || filePath.length() < 1) {
                throw new IOException("No saved game found.");
            }
            
            try(ObjectOutputStream objectStream = new ObjectOutputStream(new FileOutputStream(filePath))) {
                objectStream.writeObject(game);
                
            } catch(IOException ex) {
                System.out.println("Error saving game." + ex.getMessage());
            }
        }
    
    public static Game loadGame(String filePath) 
        throws IOException, ClassNotFoundException {
            if (filePath == null || filePath.length() < 1) {
                throw new IOException("File name invalid.");
            }
            Game game = new Game();
            
            try(ObjectInputStream objectStream = new ObjectInputStream(new FileInputStream(filePath))) {
                game = (Game)objectStream.readObject();
                CityOfAaron.setCurrentGame(game);
                Player thePlayer = game.getThePlayer();
                CityOfAaron.currentGame.setThePlayer(thePlayer);
                
            } catch(IOException | ClassNotFoundException ex) {
                System.out.println("Game file not found.");
            }
            
            return game;
        }
        
    
}
