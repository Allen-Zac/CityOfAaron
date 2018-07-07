package control;

import exceptions.LandControlException;

/**
 *
 * @author Zac Allen
 */
public class LandControl {
    public int buyLand(int wheatOwned, int purchasePrice, int amountToPurchase) 
        throws LandControlException {
        
        int totalPrice = purchasePrice * amountToPurchase;
        
        if (wheatOwned < totalPrice) {
            throw new LandControlException("Not enough wheat. Please enter a different amount.");
        }
        
        return totalPrice;
    }
    
    public int sellLand(int acresToSell, int landOwned, int sellPrice) 
        throws LandControlException {
        
        if (acresToSell > landOwned) {
            throw new LandControlException ("Not enough acres. Please enter a different amount.");
        }
        
        int wheatGained = acresToSell * sellPrice;
        
        return wheatGained;
    }
}
