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
    public static Storehouse storehouseAnimals() {
        Storehouse stores = new Storehouse();
        
        InventoryItem[] animals = createAnimals();
        
        stores.setAnimals(animals);
        
        return stores;
    }
    
    public static InventoryItem[] createAnimals() {
        InventoryItem[] animals = new InventoryItem[5];
       
        animals[0] = new InventoryItem("Cow");
        animals[1] = new InventoryItem("Goat");
        animals[2] = new InventoryItem("Cat");
        animals[3] = new InventoryItem("Sheep");
        animals[4] = new InventoryItem("Dog");
        
        return animals;
    }
    
}
