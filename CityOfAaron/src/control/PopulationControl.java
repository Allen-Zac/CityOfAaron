/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import java.util.Random;
/**
 *
 * @author Ginger
 */
public class PopulationControl {
    
    private static int getRandomInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
    public int numToFeed(int wheatOwned, int wheatFed) {
        
        if (wheatOwned < 0 || wheatFed < 0 || wheatFed > wheatOwned) {
            return -1;
        }
        int peopleFed = wheatFed / 20;
        return peopleFed;
    }
    
    public int popDeath(int numPop, int wheatFed, int wheatOwned) {
        int numToFeed = wheatFed / 20;
        int popDeath = numPop - numToFeed;
        
        if (numPop < 0 || wheatFed < 0 || wheatOwned < 0 || 
                wheatFed > wheatOwned) {
                return -1;
        }
        
        return popDeath;
    }
    
    public int popGrowth(int r, int numPop) {
       if (r < 0 || numPop < 0 || r < 1 || r > 5) {
           return -1;
       }
       int percentGrowth = getRandomInRange(3, 3) / 100;
       int popGrowth = percentGrowth * numPop;
       return popGrowth;
    }
    
}

