/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author Ginger
 */
public class HarvestControlException extends Exception{
    public HarvestControlException() {
    }

    public HarvestControlException(String string) {
        super(string);
    }

    public HarvestControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public HarvestControlException(Throwable thrwbl) {
        super(thrwbl);
    }

    public HarvestControlException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
}
