package cityofaaron;

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
import model.Animal;
import model.Author;
import view.StartProgramView;
import view.ImpeachmentView;
import view.View;

/**
 *
 * @author cfull
 */
public class CityOfAaron {
        //Keep a copy of the current Game object in the main class.
        public static Game currentGame = null;
        
        public static Game getCurrentGame() {
            return currentGame;
        }
        
        public static void setCurrentGame(Game game) {
            currentGame = game;
        }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Start the program.
        View startProgramView = new StartProgramView();
        startProgramView.displayView();
    }
}
 
