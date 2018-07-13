package cityofaaron;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        
        private static PrintWriter outFile = null;
        private static BufferedReader inFile = null;

        public static PrintWriter getOutFile() {
            return outFile;
        }

        public static void setOutFile(PrintWriter outFile) {
            CityOfAaron.outFile = outFile;
        }

        public static BufferedReader getInFile() {
            return inFile;
        }

        public static void setInFile(BufferedReader inFile) {
            CityOfAaron.inFile = inFile;
        }
        
        private static PrintWriter logFile = null;
        
        

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
            try {
                CityOfAaron.inFile = new BufferedReader(new InputStreamReader(System.in));
                CityOfAaron.outFile = new PrintWriter(System.out, true);
                logFile = new PrintWriter("logFile.txt");
                
                //Start the program.
                View startProgramView = new StartProgramView();
                startProgramView.displayView();
            }
            catch (Throwable e) {
                System.out.println("Error Detected - ");
            }
            finally {
                try {
                    if (CityOfAaron.inFile != null)
                        CityOfAaron.inFile.close();
                    
                    if (CityOfAaron.outFile != null)
                        CityOfAaron.outFile.close();
                    
                    if (logFile != null)
                        logFile.close();
                    
                } catch (IOException ex) {
                    System.out.println("Error closing files");
                    return;
                }
            }
        }

        public static PrintWriter getLogFile() {
            return logFile;
        }

        public static void setLogFile(PrintWriter logFile) {
            CityOfAaron.logFile = logFile;
        }
        
}
 
