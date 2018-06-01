/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

/**
 *
 * @author Ginger
 */
public class HarvestControl {
    
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
    
    
}
