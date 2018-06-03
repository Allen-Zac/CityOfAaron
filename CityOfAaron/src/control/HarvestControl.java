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
public class HarvestControl {
    
    private static int getRandomInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
    public int plantCrops(int landOwned, int wheatOwned, int acresToPlant) {
        if (wheatOwned < 0 || landOwned < 0 || acresToPlant < 0) {
            return -1;
        }
        if (acresToPlant > (2 * wheatOwned) || acresToPlant > landOwned) {
            return -1;
        }
        
        int acresPlanted = wheatOwned - (acresToPlant / 2); 
        
        return acresPlanted;
    }
    
    public int harvestCrops(int percentTithe, int Random) {
        
        if (percentTithe < 0 || percentTithe > 100) {
            return -1;
        }
        
        if (percentTithe < 8) {
            int cropsHarvested = getRandomInRange(1, 1);
            return cropsHarvested;
            
        }
        
        if (percentTithe >= 8 && percentTithe <= 12) {
            int cropsHarvested = getRandomInRange(2, 4);
            return cropsHarvested;
            
        }
        if (percentTithe > 12) {
            int cropsHarvested = getRandomInRange(2, 5);
            return cropsHarvested;
            
        }
        return -1;
    }
}
