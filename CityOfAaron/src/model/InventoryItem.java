/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Kayla Ng
 */
public class InventoryItem {
    private ItemType itemType;
    private int quantity;
    private Condition condition;
    private String name;

    public InventoryItem() {
        // Empty default constructor
    }
    
    public InventoryItem(String name, int quantity) {
        setName(name);
        setQuantity(quantity);
        //this.name = name;
        //this.quantity = quantity;
    }
    
    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "InventoryItem{" 
                + "itemType=" + itemType 
                + ", quantity=" + quantity 
                + ", condition=" + condition 
                + " }";
    }
    
    
}
