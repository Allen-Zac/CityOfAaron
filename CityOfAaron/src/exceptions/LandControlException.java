package exceptions;

/**
 *
 * @author Zac Allen
 */
public class LandControlException extends Exception {

    public LandControlException() {
    }

    public LandControlException(String string) {
        super(string);
    }

    public LandControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public LandControlException(Throwable thrwbl) {
        super(thrwbl);
    }

    public LandControlException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
