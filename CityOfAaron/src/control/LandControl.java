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
public class LandControl {
    public int buyLand(int wheatOwned, int purchasePrice, int amountToPurchase) {
        int totalPrice = purchasePrice * amountToPurchase;
        
        if (wheatOwned < totalPrice) {
            return -1;
        }
        
        return amountToPurchase;
    }
}
