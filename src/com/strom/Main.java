package com.strom;

public class Main {

    public static void main(String[] args) {
    Warehouse warehouse1 = new Warehouse();

    Item item1 = new Item("A Cheese sandwich");
    Item item2 = new Item("A Cheese sandwich");
    Item item3 = new Item("A Cheese sandwich");
    Item item4 = new Item("A Cheese sandwich");
    Item item5 = new Item("A Cheese sandwich");
    Item item6 = new Item("A Cheese sandwich");
    Item item7 = new Item("A Cheese sandwich");
    Item item8 = new Item("A Cheese sandwich");
    Item item9 = new Item("A Cheese sandwich");
    Item item10 = new Item("A Cheese sandwich");
    Item item11 = new Item("A Cheese sandwich");
    Item item12 = new Item("A hummus sandwich");
    Item item13 = new Item("An egg sandwich");
    Item item14 = new Item("A ham sandwich");
    Item item15 = new Item("An Ostrich sandwich");
    Item item16 = new Item("A cheese and tomato sandwich");



    item1.setItemPrice(23.5d);
    warehouse1.addWarehouseItem(item1);
    warehouse1.addWarehouseItem(item2);
    warehouse1.addWarehouseItem(item3);
    warehouse1.addWarehouseItem(item4);
    warehouse1.addWarehouseItem(item5);
    warehouse1.addWarehouseItem(item6);
    warehouse1.addWarehouseItem(item7);
    warehouse1.addWarehouseItem(item8);
    warehouse1.addWarehouseItem(item6);
    warehouse1.addWarehouseItem(item7);
    warehouse1.addWarehouseItem(item8);
    warehouse1.addWarehouseItem(item9);
    warehouse1.addWarehouseItem(item10);
    warehouse1.addWarehouseItem(item11);
    warehouse1.addWarehouseItem(item12);
    warehouse1.addWarehouseItem(item13);
    warehouse1.addWarehouseItem(item14);
    warehouse1.addWarehouseItem(item15);
    warehouse1.addWarehouseItem(item16);

//        System.out.println(item1.itemName);

    System.out.println(warehouse1.getWarehouseItemCount());

        //for(int i=0; i < warehouse1.getWarehouseItemCount(); i++) {
        //    System.out.println("i:" + i + " contains " + warehouse1.getWarehouseItem(i).getItemName());
        //}

        // remove an element
        //warehouse1.removeWarehouseItem(4);

        //for(int i=0; i < warehouse1.getWarehouseItemCount(); i++) {
        for(int i=0; i < 60; i++) {
            System.out.println("i:" + i);
            System.out.println("Warehouse location: " + warehouse1.getWarehouseLocation(i));
            System.out.println("contains " + warehouse1.getWarehouseItem(i).getItemName());
        }

        // find a cheese sandwich
        //System.out.println("looking for cheese:" + warehouse1.getStockCount("A Cheese sandwich"));

        // get the key values for the search item
        //System.out.println("item indexes");
        //System.out.println(warehouse1.getItemIndex("A Cheese sandwich", 1));
        //System.out.println(warehouse1.getItemIndex("A Cheese sandwich", 2));
        //System.out.println(warehouse1.getItemIndex("A Cheese sandwich", 3));
        //System.out.println(warehouse1.getItemIndex("A Cheese sandwich", 4));
        //System.out.println(warehouse1.getItemIndex("A Cheese sandwich", 5));
        //System.out.println("end of item indexes");

        // moving an item

        // check
        System.out.println("before moving things");
        System.out.println("item50:" + warehouse1.getWarehouseItem(50).getItemName());

        System.out.println("moving things");
        //System.out.println("locationindex" + warehouse1.getWarehouseLocationIndex("Location50"));
        //System.out.println("the item:" + warehouse1.getWarehouseItem(3).getItemName());

        warehouse1.moveWarehouseItem("A Cheese sandwich", 4, "Location50");
        //System.out.println(warehouse1.getItemIndex("A Cheese sandwich",4));

        //System.out.println("item50:" + warehouse1.getWarehouseItem(50).getItemName());

        //for(int i=0; i < warehouse1.getWarehouseItemCount(); i++) {
        for(int i=0; i < 60; i++) {
                System.out.println("i:" + i);
                System.out.println("Warehouse location: " + warehouse1.getWarehouseLocation(i));
                System.out.println("contains " + warehouse1.getWarehouseItem(i).getItemName());
            }

    }

}
