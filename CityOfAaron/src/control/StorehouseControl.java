package control;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
    
    public static void printTools(String filePath) 
    throws IOException {
        InventoryItem[] tools = new InventoryItem[5];
       
        tools[0] = new InventoryItem("Shovel", 12);
        tools[1] = new InventoryItem("Hoe", 14);
        tools[2] = new InventoryItem("Rake", 18);
        tools[3] = new InventoryItem("Hammer", 20);
        tools[4] = new InventoryItem("Axe", 10);
        
        try (PrintWriter report = new PrintWriter(new FileWriter(filePath))) {
            report.println("*****************");
            report.println("STOREHOUSE TOOLS");
            report.println("*****************");
            report.println();
            
            String formatString = "%-10s %-5d";
            
            report.println("Tool Name  Amnt.");
            report.println("---------- -----");
            
            for (InventoryItem inventoryItem : tools) {
                report.println(String.format(formatString, inventoryItem.getName(), inventoryItem.getQuantity()));
            }
            
            report.println();
            
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
    
    public static Storehouse storehouseAnimals() {
        Storehouse stores = new Storehouse();
        
        InventoryItem[] animals = new InventoryItem[5];
       
        animals[0] = new InventoryItem("Cow", 1);
        animals[1] = new InventoryItem("Goat", 800);
        animals[2] = new InventoryItem("Cat", 20000);
        animals[3] = new InventoryItem("Sheep", 9);
        animals[4] = new InventoryItem("Dog", 10);
        
        stores.setTools(animals);
        
        System.out.println("\n=======================\n"
                + "Animals in the Storehouse\n"
                + "=======================\n"
                + "Name : Quantity\n"
                + "-----------------------");
        
        for (InventoryItem inventoryItem : animals) {
            System.out.println(String.format("%s%d", inventoryItem.getName() + " : ", inventoryItem.getQuantity()));
            }
        
        System.out.println("\n");
        
        return stores;
    }
    
    public static void printAnimals(String filePath) 
    throws IOException {
        InventoryItem[] animals = new InventoryItem[5];
       
        animals[0] = new InventoryItem("Cow", 1);
        animals[1] = new InventoryItem("Goat", 800);
        animals[2] = new InventoryItem("Cat", 20000);
        animals[3] = new InventoryItem("Sheep", 9);
        animals[4] = new InventoryItem("Dog", 10);
        
        try (PrintWriter report = new PrintWriter(new FileWriter(filePath))) {
            report.println("*****************");
            report.println("ANIMALS IN STOREHOUSE");
            report.println("*****************");
            report.println();
            
            String formatString = "%-10s %-5d";
            
            report.println("Animal Name  Amnt.");
            report.println("---------- -----");
            
            for (InventoryItem inventoryItem : animals) {
                report.println(String.format(formatString, inventoryItem.getName(), inventoryItem.getQuantity()));
            }
            
            report.println();
            
        } catch (IOException exception) {
            exception.printStackTrace();
        }
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
