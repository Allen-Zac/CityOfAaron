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
public class PopulationControl {
    public int numToFeed(int wheatOwned, int wheatFed) {
        
        if (wheatOwned < 0 || wheatFed < 0 || wheatFed > wheatOwned) {
            return -1;
        }
        wheatOwned = wheatOwned - wheatFed;
        int peopleFed = wheatFed / 10;
        return peopleFed;
    }
}
