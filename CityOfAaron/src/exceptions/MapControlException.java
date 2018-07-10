
package exceptions;

/**
 *
 * @author Ethan Russon
 */

public class MapControlException extends Exception{
    public MapControlException() {
    }

    public MapControlException(String string) {
        super(string);
    }

    public MapControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public MapControlException(Throwable thrwbl) {
        super(thrwbl);
    }

    public MapControlException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
}
