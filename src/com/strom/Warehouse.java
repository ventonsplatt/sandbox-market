package com.strom;
import java.util.*;
/**
 * Created by antony on 26/12/16.
 * this is a set of items and the status of the items
 */
public class Warehouse {
    // all warehouses have
    private List<Item> warehouseItems = new ArrayList<Item>(); // this is an array to hold all the things in the warehouse
    private List<String> warehouseLocations = new ArrayList<String>(); // this is an array to hold all the locations in the warehouse


    // initialisation
    {
        // there are 500 locations in the warehouse
        for (int i =0; i < 500; i++){
            warehouseLocations.add("Location" + Integer.toString(i));
        }
    }

    public int getWarehouseItemCount() {
        return warehouseItems.size();
    }

    public Item getWarehouseItem(int itemIndex){
        // returns the item held at a particular index location
        return warehouseItems.get(itemIndex);
    }

    public String getWarehouseLocation(int itemIndex){
        // returns the item location name
        return warehouseLocations.get(itemIndex);
    }

    public void addWarehouseItem(Item item){
        warehouseItems.add(item);
    }

    public void removeWarehouseItem(int itemIndex){
        Item myEmptyItem = new Item("");
        warehouseItems.set(itemIndex, myEmptyItem); //put an empty thing in it
    }

    public int getStockCount(String itemName) {
        // iterates through the items held in the warehouse and returns a count of the objects matching by name
        int itemCount = 0;
        for (int i = 0; i < warehouseItems.size(); i++) {
            // check if name matches and  increment itemCount
            if (warehouseItems.get(i).getItemName() == itemName) {
                itemCount += 1;
            }
        }
        return itemCount;
    }

}



