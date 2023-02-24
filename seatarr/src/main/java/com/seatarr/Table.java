package com.seatarr;

import java.util.List;
import java.util.ArrayList;


public class Table {

    private boolean isFull;
    private int capacity;
    private List<String> members;
    private int tableNumber;

    public Table(int tableNumber, int capacity) {
        this.tableNumber = tableNumber;
        isFull = false;
        this.capacity = capacity;
        members = new ArrayList<>();
    }

    public void addMember(String m) {
        if (!isFull) {   
            members.add(m);
        }
        if (members.size() >= capacity) {
            isFull = true;
        }
    }

    public void printMembers() {
        System.out.println("Table " + tableNumber + ": ");
        for (String m : members) {
            System.out.println(m);
        }
        System.out.println();
    }

    public boolean isFull() {
        return isFull;
    }

    public List<String> getMembers() {
        return members;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    
}
