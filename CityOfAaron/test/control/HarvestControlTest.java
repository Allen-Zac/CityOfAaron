/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ginger
 */
public class HarvestControlTest {
    
    public HarvestControlTest() {
    }
    /**
     * Test of plantCrops method, of class HarvestControl.
     */
    @Test
    public void testPlantCrops() {
        System.out.println("plantCrops");
        int landOwned = 0;
        int wheatOwned = 0;
        int acresToPlant = 0;
        HarvestControl instance = new HarvestControl();
        int expResult = 0;
        int result = instance.plantCrops(landOwned, wheatOwned, acresToPlant);
        assertEquals(expResult, result);
    }
    
    public void testValidPlantCrops() {
        HarvestControl instance = new HarvestControl();
        int result = instance.plantCrops(10, 10, 10);
        assertEquals(5, result, 0.0);
    }
    
    public void testInvalidPlantCropsLand() {
        HarvestControl instance = new HarvestControl();
        int result = instance.plantCrops(-1, 10, 10);
        assertEquals(-1, result, 0.0);
    }
    
    public void testInvalidPlantCropsWheat() {
        HarvestControl instance = new HarvestControl();
        int result = instance.plantCrops(10, -1, 10);
        assertEquals(-1, result, 0.0);
    }
    
    public void testInvalidPlantCropsAcres() {
        HarvestControl instance = new HarvestControl();
        int result = instance.plantCrops(10, 10, -1);
        assertEquals(-1, result, 0.0);
    }
    
    public void testInvalidPlantCropsAcres2() {
        HarvestControl instance = new HarvestControl();
        int result = instance.plantCrops(10, 10, 22);
        assertEquals(-1, result, 0.0);
    }
    
    public void testValidPlantCropsBound() {
        HarvestControl instance = new HarvestControl();
        int result = instance.plantCrops(1, 2, 2);
        assertEquals(2, result, 0.0);
    }

    /**
     * Test of harvestCrops method, of class HarvestControl.
     */
    @Test
    public void testHarvestCrops() {
        System.out.println("harvestCrops");
        int percentTithe = 7;
        int Random = 1;
        HarvestControl instance = new HarvestControl();
        int expResult = 1;
        int result = instance.harvestCrops(percentTithe, Random);
        assertEquals(expResult, result);
    }

    

   
}
