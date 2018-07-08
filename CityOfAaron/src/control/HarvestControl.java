/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import java.util.Random;
import exceptions.HarvestControlException;
/**
 *
 * @author Ginger
 */
public class HarvestControl {
    
    private static int getRandomInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
    public int plantCrops(int landOwned, int wheatOwned, int acresToPlant) 
        throws HarvestControlException {
        
        if (wheatOwned < 0 || landOwned < 0 || acresToPlant < 0) {
            throw new HarvestControlException("Please enter a number from 7 to 12");
        }
        if (acresToPlant > (2 * wheatOwned) || acresToPlant > landOwned) {
            throw new HarvestControlException("Please don't enter more than you have in store.");
        }
    
        int acresPlanted = wheatOwned - (acresToPlant / 2); 
        
        return acresPlanted;
    }
    
    public int harvestCrops(int percentTithe, int Random) 
        throws HarvestControlException {
        
        if (percentTithe < 0 || percentTithe > 100) {
            throw new HarvestControlException("Please enter a value between 1 and 100");
        }
        
        if (percentTithe < 8) {
            int cropsHarvested = getRandomInRange(1, 1);
            return cropsHarvested;
            
        }
        
        if (percentTithe >= 8 && percentTithe <= 12) {
            int cropsHarvested = getRandomInRange(2, 2);
            return cropsHarvested;
            
        }
        if (percentTithe > 12) {
            int cropsHarvested = getRandomInRange(2, 2);
            return cropsHarvested;
            
        }
        throw new HarvestControlException("Please enter a value between 1 and 100");
    }
}
