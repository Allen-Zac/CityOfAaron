/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import model.Game;
import model.Player;
import model.Storehouse;
import model.Map;
/**
 *
 * @author cfull
 */
public class CityOfAaron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Game theGame = new Game();
        theGame.setThePlayer(new Player());
        theGame.setTheStorehouse(new Storehouse());
        theGame.setTheMap(new Map());
        theGame.setCurrentPopulation(100);
        theGame.setAcresOwned(1000);
        theGame.setWheatInStorage(10000);
        theGame.setCurrentYear(0);
        
        System.out.println(theGame.toString());
    }
    
}
