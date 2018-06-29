package control;

import model.Storehouse;
import model.InventoryItem;

/**
 *
 * @author Zac Allen
 */
public class StorehouseControl {
    public static Storehouse storehouseTools() {
        Storehouse stores = new Storehouse();
        
        InventoryItem[] tools = createTools();
        
        stores.setTools(tools);
        
        return stores;
    }
    
    public static InventoryItem[] createTools() {
        InventoryItem[] tools = new InventoryItem[5];
       
        tools[0] = new InventoryItem("Shovel");
        tools[1] = new InventoryItem("Hoe");
        tools[2] = new InventoryItem("Rake");
        tools[3] = new InventoryItem("Hammer");
        tools[4] = new InventoryItem("Axe");
        
        return tools;
    }
}
