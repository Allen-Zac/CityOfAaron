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
        
        InventoryItem[] tools = new InventoryItem[5];
       
        tools[0] = new InventoryItem("Shovel", 12);
        tools[1] = new InventoryItem("Hoe", 14);
        tools[2] = new InventoryItem("Rake", 18);
        tools[3] = new InventoryItem("Hammer", 20);
        tools[4] = new InventoryItem("Axe", 10);
        
        stores.setTools(tools);
        
        System.out.println("\n=======================\n"
                + "Tools in the Storehouse\n"
                + "=======================\n"
                + "Name : Quantity\n"
                + "-----------------------");
        
        for (InventoryItem inventoryItem : tools) {
            System.out.println(String.format("%s%d", inventoryItem.getName() + " : ", inventoryItem.getQuantity()));
            }
        
        System.out.println("\n");
        
        return stores;
    }
    
    public static InventoryItem[] createTools() {
        InventoryItem[] tools = new InventoryItem[5];
       
        tools[0] = new InventoryItem("Shovel", 12);
        tools[1] = new InventoryItem("Hoe", 14);
        tools[2] = new InventoryItem("Rake", 18);
        tools[3] = new InventoryItem("Hammer", 20);
        tools[4] = new InventoryItem("Axe", 10);
        
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
       
        animals[0] = new InventoryItem("Cow", 1);
        animals[1] = new InventoryItem("Goat", 800);
        animals[2] = new InventoryItem("Cat", 20000);
        animals[3] = new InventoryItem("Sheep", 9);
        animals[4] = new InventoryItem("Dog", 10);
        
        return animals;
    }
    
    public static Storehouse storehouseProvisions() {
        Storehouse stores = new Storehouse();
        
        InventoryItem[] provisions = createProvisions();
        
        stores.setProvisions(provisions);
        
        return stores;
    }
    
    public static InventoryItem[] createProvisions() {
        InventoryItem[] provisions = new InventoryItem[4];
        
        provisions[0] = new InventoryItem("Wheat", 1);
        provisions[1] = new InventoryItem("Water", 2);
        provisions[2] = new InventoryItem("Seed", 3);
        provisions[3] = new InventoryItem("Fertilizer", 4);
        
        return provisions;
    }
    
}
