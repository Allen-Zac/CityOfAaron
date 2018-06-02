package control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Zac Allen
 */
public class LandControlTest {
    
    public LandControlTest() {
    }

    /**
     * Test of buyLand method, of class LandControl.
     * buyLand(wheatOwned, purchasePrice, amountToPurchase)
     */

    // Test buyLand() with passing values.
    @Test
    public void testPassingBuyLand() {
        LandControl instance = new LandControl();
        int result = instance.buyLand(50, 10, 5);
        assertEquals(50, result);
    }
    
    // Test buyLand() with failing values.
    @Test
    public void testFailingBuyLand() {
        LandControl instance = new LandControl();
        int result = instance.buyLand(50, 10, 6);
        assertEquals(-1, result);
    }
    
    // Test buyLand with lowest limits.
    @Test
    public void testLimitsBuyLand() {
        LandControl instance = new LandControl();
        int result = instance.buyLand(1, 1, 1);
        assertEquals(1, result);
    }

    /**
     * Test of sellLand method, of class LandControl.
     * sellLand(acresToSell, landOwned, sellPrice);
     */

    // Test sellLand() with passing parameters.
    @Test
    public void testPassingSellLand() {
        LandControl instance = new LandControl();
        int result = instance.sellLand(10, 10, 20);
        assertEquals(200, result);
    }
    
    // Test sellLand() with failing parameters.
    @Test
    public void testFailingSellLand() {
        LandControl instance = new LandControl();
        int result = instance.sellLand(10, 9, 20);
        assertEquals(-1, result);
    }
    
    // Test sellLand() at its lowest limit.
    @Test
    public void testLimitsSellLand() {
        LandControl instance = new LandControl();
        int result = instance.sellLand(1, 1, 1);
        assertEquals(1, result);
    }
    
}
