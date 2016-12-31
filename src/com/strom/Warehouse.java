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
            System.out.println(getWarehouseLocation(i));
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
    public String getWarehouseLocationName(int itemIndex){
        // returns the name of the location
        return warehouseLocations.get(itemIndex);
    }

    public int getWarehouseLocationIndex(String warehouseLocation){
        // returns the index based on inputted warehouse location
        for(int i =0; i < 500; i++) {
            //System.out.println("Trying to match:" + getWarehouseLocationName(i));
            //System.out.println("With:           " + warehouseLocation);
            if (getWarehouseLocationName(i).equals(warehouseLocation)) {
                // matching location found
                System.out.println("Found matching location" + getWarehouseLocationName(i) );
                return i;
            }

        }
        // no matching location
        System.out.println("ERROR: no matching location found");
        return -1;
    }

    public void addWarehouseItem(Item item){
        warehouseItems.add(item);
    }

    public void removeWarehouseItem(int itemIndex){
        Item myEmptyItem = new Item("");
        warehouseItems.set(itemIndex, myEmptyItem); //put an empty thing in it
    }

  public void moveWarehouseItem(String itemName, int itemOccurrence, String newLocation) {
      // check that: a: searched item exists
      //             b: stocklocation is available

      if (getItemIndex(itemName, itemOccurrence) == -1){    //error code
          // no item found
          System.out.println("ERROR: no matching item found");
      }
      else{
          // item found
          System.out.println("moving item from slot:" + getItemIndex(itemName, itemOccurrence));

          // get slot id from newLocation
          if(getWarehouseLocationIndex(newLocation) == -1){  //error code
              System.out.println("ERROR: no matching location found for " + newLocation);
          }
          else{
              // set item to new location and insert empty object in its place
              warehouseItems.set(getWarehouseLocationIndex(newLocation), getWarehouseItem(getItemIndex(itemName, itemOccurrence)));

              //insert empty object in its place
              removeWarehouseItem(getItemIndex(itemName, itemOccurrence));
          }

      }

  }


    public int getItemIndex(String itemName, int targetItemInstance) {
        // this helper function simply returns the nth itemIndex for the search time
        int itemInstance = 0;
        int itemIndex = 0;
        System.out.print("Looking for " + targetItemInstance + "th item of " );
        System.out.println(itemName);

        for (int i = 0; i < warehouseItems.size(); i++) {
            // check if name matches and  increment itemInstance count
            if (warehouseItems.get(i).getItemName() == itemName) {
                itemInstance += 1;
                itemIndex = i;
               // System.out.println("Matched itemName...Current value of itemInstance:" + itemInstance);
               // System.out.println("Not matched...Current value of itemIndex:" + itemIndex);

                if(itemInstance == targetItemInstance){
                    return itemIndex;
                }
            }
        }
        System.out.println("ERROR: no matching item");
        return -1;
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



