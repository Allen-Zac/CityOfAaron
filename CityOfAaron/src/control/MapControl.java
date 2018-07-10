package control;

import exceptions.MapControlException;
import model.Map;
import model.Location;

/**
 *
 * @author Ginger
 */
public class MapControl {
    public static Map createMap(int numOfRows, int numOfColumns) 
        throws MapControlException {
        if (numOfRows < 0 || numOfColumns < 0) {
            return null; 
        }
        
        Location[][] locations = createLocations(numOfRows, numOfColumns);
        
        Map map = new Map();
        map.setLocations(locations);
        
        return map;
    }
    
    public static Location[][] createLocations(int rows, int columns) 
        throws MapControlException {
        if (rows < 0 || columns < 0) {
            return null; 
        }
        
        Location[][] coordinates = new Location[rows][columns];
        
        coordinates[0][0] = new Location("Temple", "The Temple.", "T");
        coordinates[0][1] = new Location ("Rulers Court", "Where the rulers rule.", "C");
        coordinates[0][2] = new Location ("The Village", "The village", "V");
        coordinates[0][3] = new Location ("Fields", "The fields.", "F");
        coordinates[0][4] = new Location ("River", "The flowing waters of Aaron.", "R");
        coordinates[1][0] = new Location ("Fields", "The fields", "F");
        coordinates[1][1] = new Location ("Fields", "The fields", "F");
        coordinates[1][2] = new Location ("Storehouse", "Where the wheat is stored.", "S");
        coordinates[1][3] = new Location ("Granary", "Where the grain is stored", "G");
        coordinates[1][4] = new Location ("River", "The flowing waters of Aaron.", "R");
        coordinates[2][0] = new Location ("Fields", "The fields.", "F");
        coordinates[2][1] = new Location ("Fields", "The fields.", "F");
        coordinates[2][2] = new Location ("River", "The flowing waters of Aaron.", "R");
        coordinates[2][3] = new Location ("River", "The flowing waters of Aaron.", "R");
        coordinates[2][4] = new Location ("Undeveloped Land", "Land that is yet to be developed.", "U");
        coordinates[3][0] = new Location ("River", "The flowing waters of Aaron.", "R");
        coordinates[3][1] = new Location ("River", "The flowing waters of Aaron.", "R");
        coordinates[3][2] = new Location ("Undeveloped Land", "Land that is yet to be developed.", "U");
        coordinates[3][3] = new Location ("Undeveloped Land", "Land that is yet to be developed.", "U");
        coordinates[3][4] = new Location ("Undeveloped Land", "Land that is yet to be developed.", "U");
        coordinates[4][0] = new Location ("Lamanite Border", "The border to the Lamanites land.", "B");
        coordinates[4][1] = new Location ("Lamanite Border", "The border to the Lamanites land.", "B");
        coordinates[4][2] = new Location ("Lamanite Border", "The border to the Lamanites land.", "B");
        coordinates[4][3] = new Location ("Lamanite Border", "The border to the Lamanites land.", "B");
        coordinates[4][4] = new Location ("Lamanite Border", "The border to the Lamanites land.", "B");
        
        return coordinates;
    } 
}
