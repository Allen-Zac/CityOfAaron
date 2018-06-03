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
 * @author Carson
 */
public class PopulationControlTest {
    
    public PopulationControlTest() {
    }

    /**
     * Test of numToFeed method, of class PopulationControl.
     */
    @Test
    public void testNumToFeed() {
        System.out.println("numToFeed");
        int wheatOwned = 0;
        int wheatFed = 0;
        PopulationControl instance = new PopulationControl();
        int expResult = 0;
        int result = instance.numToFeed(wheatOwned, wheatFed);
        assertEquals(expResult, result);  
    }
    
    @Test
    public void testCase1() {
        PopulationControl instance = new PopulationControl();
         int result = instance.numToFeed(600, 100);
         assertEquals(5, result);
    }
    
    @Test
    public void testCase2() {
        PopulationControl instance = new PopulationControl();
         int result = instance.numToFeed(-600, 100);
         assertEquals(-1, result);
    }
    
    @Test
    public void testCase3() {
        PopulationControl instance = new PopulationControl();
         int result = instance.numToFeed(600, -100);
         assertEquals(-1, result);
    }
    
    @Test
    public void testCase4() {
        PopulationControl instance = new PopulationControl();
         int result = instance.numToFeed(500, 600);
         assertEquals(-1, result);
    }
    
    @Test
    public void testCase5() {
        PopulationControl instance = new PopulationControl();
         int result = instance.numToFeed(1, 1);
         assertEquals(0, result);
    }
    
    
    /**
     * Test of numToFeed method, of class PopulationControl.
     */
    @Test
    public void testPopDeath() {
        System.out.println("popDeath");
        int numPop = 0;
        int wheatFed = 0;
        int wheatOwned = 0;
        PopulationControl instance = new PopulationControl();
        int expResult = 0;
        int result = instance.popDeath(numPop, wheatFed, wheatOwned);
        assertEquals(expResult, result);  
    }
    
    @Test
    public void testSuccessPopDeath() {
        PopulationControl instance = new PopulationControl();
         int result = instance.popDeath(600, 100, 500);
         assertEquals(595, result);
    }
    
    @Test
    public void testFailLessNumPop() {
        PopulationControl instance = new PopulationControl();
         int result = instance.popDeath(400, 100, -600);
         assertEquals(-1, result);
    }
    
    @Test
    public void testFailLessWheatFed() {
        PopulationControl instance = new PopulationControl();
         int result = instance.popDeath(400, -100, 600);
         assertEquals(-1, result);
    }
    
    @Test
    public void testFailLessWheatOwned() {
        PopulationControl instance = new PopulationControl();
         int result = instance.popDeath(400,100,-600);
         assertEquals(-1, result);
    }
    
    @Test
    public void testFailWheatFedGreaterWheatOwned() {
        PopulationControl instance = new PopulationControl();
         int result = instance.popDeath(100, 500, 400);
         assertEquals(-1, result);
    }
    
    @Test
    public void testLowerBoundary() {
        PopulationControl instance = new PopulationControl();
         int result = instance.popDeath(1, 1, 1);
         assertEquals(1, result);
    }
    
    
     /**
     * Test of popGrowth, of class PopulationControl.
     */
    @Test
    public void testPopGrowth() {
        System.out.println("popGrowth");
        int r = 0;
        int numPop = 0;
        PopulationControl instance = new PopulationControl();
        int expResult = -1;
        int result = instance.popGrowth(r, numPop);
        assertEquals(expResult, result);  
    }
     
     public void testSuccess() {
         PopulationControl instance = new PopulationControl();
           int result = instance.popGrowth(1, 4);
           assertEquals(-1, result);
     }
}
