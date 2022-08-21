package com.example.mycw7;

import java.io.Serializable;

public class items implements Serializable {

    private String itemName;
    private int itemImage;
    private double itemPrice;
    private String proDescription;

    public String getProDescription() {
        return proDescription;
    }

    public void setProDescription(String proDescription) {
        this.proDescription = proDescription;
    }

    public items (String itemName, int itemImage, double itemPrice, String proDescription){

        this.itemName= itemName;
        this.itemImage=itemImage;
        this.itemPrice=itemPrice;
        this.proDescription=proDescription;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemImage() {
        return itemImage;
    }

    public void setItemImage(int itemImage) {
        this.itemImage = itemImage;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }
}
