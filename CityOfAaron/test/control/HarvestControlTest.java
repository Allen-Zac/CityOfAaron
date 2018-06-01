/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ginger
 */
public class HarvestControlTest {
    
    public HarvestControlTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
