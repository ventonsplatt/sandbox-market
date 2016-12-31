package com.strom;
import javax.swing.*;
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
    public int getWarehouseLocationIndex(String warehouseLocation){
        // returns the index based on inputted warehouse location
        for(int i =0; i < 500; i++) {
            if (getWarehouseLocation(i) == warehouseLocation) {
                // matching location found
                return i;
            } else {
                // no matching location
                return -1;
            }
        }
    return 0;
    }

    public void addWarehouseItem(Item item){
        warehouseItems.add(item);
    }

    public void removeWarehouseItem(int itemIndex){
        Item myEmptyItem = new Item("");
        warehouseItems.set(itemIndex, myEmptyItem); //put an empty thing in it
    }

  public void moveWarehouseItem(int itemIndex, String newLocation) {
      // check that: a: searched item exists
      //             b: stocklocation is available

      //if((warehouseItems.get(itemIndex).getItemName() == itemName) && )
      // Item myEmptyItem = new Item("");
      System.out.println("moving item from slot:" + itemIndex);

  }



        //warehouseItems.set(itemIndex, myEmptyItem); //put an empty thing in it
    //}

    public int getItemIndex(String itemName, int targetItemInstance) {
        // this helper function simply returns the nth itemIndex for the search time
        int itemInstance = 0;
        int itemIndex = 0;
        System.out.println("Looking for " + targetItemInstance + "th item");

        for (int i = 0; i <= warehouseItems.size(); i++) {
            // check if name matches and  increment itemInstance count
            if (warehouseItems.get(i).getItemName() == itemName) {
                itemInstance += 1;
                itemIndex = i;
               // System.out.println("Matched itemName...Current value of itemInstance:" + itemInstance);
               // System.out.println("Not matched...Current value of itemIndex:" + itemIndex);

                if(itemInstance == targetItemInstance){
                    return itemIndex;
                }
            } else {
                System.out.println("") ;
                //System.out.println("Not matched...Current value of i:" + i);
            }
        }
    return 0;
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

    private void handleNoFreeSlot(){
        System.out.println("ERROR: Cannot move item - move cancelled");
    }

}



