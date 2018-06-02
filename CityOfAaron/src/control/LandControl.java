/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

/**
 *
 * @author Zac Allen
 */
public class LandControl {
    public int buyLand(int wheatOwned, int purchasePrice, int amountToPurchase){
        int totalPrice = purchasePrice * amountToPurchase;
        
        if (wheatOwned < totalPrice) {
            return -1;
        }
        
        return totalPrice;
    }
    
    public int sellLand(int acresToSell, int landOwned, int sellPrice){
        if (acresToSell > landOwned) {
            return -1;
        }
        
        int wheatGained = acresToSell * sellPrice;
        
        return wheatGained;
    }
}
