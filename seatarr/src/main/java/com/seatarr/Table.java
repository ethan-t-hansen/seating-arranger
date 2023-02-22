package com.seatarr;

import java.util.List;
import java.util.ArrayList;


public class Table {

    private boolean isFull;
    private List<Person> members;
    private int tableNumber;

    public Table(int tabNum) {
        tableNumber = tabNum;
        isFull = false;
        members = new ArrayList<>();
    }

    public boolean isFull() {
        return isFull;
    }

    
}
