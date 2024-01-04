package com.example.crafttrack;

//import com.example.version1.ReceiptItem;

import java.io.Serializable;
import java.util.ArrayList;

public class Craft implements Serializable {
//    public ArrayList<ReceiptItem> items = new ArrayList<ReceiptItem>();
    public int ID;
    public String cName;
    public String startDate;
    public String endDate;

//    public void addItem(ReceiptItem item) {
//        items.add(item);
//    }

//    public void removeItem(ReceiptItem item) {
//        items.remove(item);
//    }

    public Craft(int ID){
        this.ID = ID;
        this.cName = "New Craft";
        this.startDate = "";
        this.endDate = "";
    }

}
