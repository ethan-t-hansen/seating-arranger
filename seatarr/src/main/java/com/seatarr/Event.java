package com.seatarr;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class Event {

    private HashMap<String, Preference> attendees;
    private List<Table> tables;

    public Event(HashMap<String, Preference> attendees, List<Table> tables) {
        this.attendees = attendees;
        this.tables = tables;
    }

    public void arrangeSeating() {
        List<String> toSeat = new ArrayList<>(attendees.keySet());
        int i = 0;
        for (Table t : tables) {
            while (!t.isFull() && i < toSeat.size()) {
                for (int j = 0; j < t.getCapacity(); j++) {
                    t.addMember(toSeat.get(i + j));
                    i++;
                }
            }
        }
    }
    
    public void printSeating() {
        for (Table t: tables) {
            t.printMembers();
        }
    }

    public HashMap<String, Preference> getGuestList() {
        return attendees;
    }

    public List<Table> numTables() {
        return tables;
    }

    
}
