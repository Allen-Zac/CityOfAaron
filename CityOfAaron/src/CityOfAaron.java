/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import model.Game;
import model.Player;
import model.Storehouse;
import model.Map;
import model.Point;
import model.Location;

/**
 *
 * @author cfull
 */
public class CityOfAaron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Test the Game class.
        Game theGame = new Game();
        theGame.setThePlayer(new Player());
        theGame.setTheStorehouse(new Storehouse());
        theGame.setTheMap(new Map());
        theGame.setCurrentPopulation(100);
        theGame.setAcresOwned(1000);
        theGame.setWheatInStorage(10000);
        theGame.setCurrentYear(0);
        
        System.out.println(theGame.toString());
        
        //Test the Map class.
        Map theMap = new Map();
        theMap.setCurrentLocation(new Point());
        
        //Test the Point class.
        Point thePoint = new Point();
        thePoint.setColumn(2);
        thePoint.setRow(4);
        
        //Test the Location class.
        Location theLocation = new Location();
        theLocation.setDescription("Description for map location.");
        theLocation.setGameTips(args);
        theLocation.setMapSymbol("$");
        theLocation.setName("Name of Location");
    }
}
