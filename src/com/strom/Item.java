package com.strom;

import java.math.BigInteger;
import java.util.Random;

/**
 * Created by antony on 24/12/16.
 * base class for all types of items
 */
public class Item {

    // all items have
    public BigInteger sku = generateSKU();
    public String itemName;
    public double itemPrice;

    // initalisation
    {
    }

    // constructors
    Item(){
    }

    Item(String itemName){
        this();
        this.itemName = itemName;
    }
    // getters and setters
    public double getItemPrice(){
        return itemPrice;
    }

    public void setItemPrice(double itemPrice){
        this.itemPrice = itemPrice;
    }

    public String getItemName(){
        return itemName;
    }

    public void setItemName(String itemName){
        this.itemName = itemName;
    }

    //public int increaseStockLevel(Warehouse warehouseName,  String stockLocation){
        // the warehouse must already have been intialised
       // warehouseName.setStockLocation(stockLocation);
    //}

    // need to generate a random SKU
    private BigInteger generateSKU(){
        return   new BigInteger(32, new Random());
        }

    public void displayItemInfo(BigInteger sku){
        //return the state of all variables
        System.out.println("Item Details:");
        System.out.println("=============");
        System.out.println("SKU:" + sku);
        //System.out.println("Name:" + itemName);
    }

}
