package com.strom;

/**
 * Created by antony on 26/12/16.
 * Maintains a list of what the quantity and status of items are
 */
public class ItemStock {

    private int stockLevel;
    private String stockLocation;

// constructor
    public ItemStock(){}

// getters and setters
    public int getStockLevel(){
        return stockLevel;
    }

    public void increaseStockLevel(int stockLevel){
        this.stockLevel = stockLevel;
    }

    public String getStockLocation() {
        return stockLocation;
    }
    public void setStockLocation(String stockLocation){
        this.stockLocation = stockLocation;
    }
}
