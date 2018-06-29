package control;

import cityofaaron.CityOfAaron;
import model.Player;
import model.Game;
import model.Map;
import model.Storehouse;

/**
 *
 * @author Zac Allen
 */
public class GameControl {
    public static int createNewGame(Player thePlayer, Map theMap, Storehouse theStorehouse) {
        if (thePlayer == null) {
            return -1;
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
        
        return 1;
            
    }
}
