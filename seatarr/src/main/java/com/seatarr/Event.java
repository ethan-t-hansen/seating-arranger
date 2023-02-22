package com.seatarr;

import java.util.List;
import java.util.HashSet;

public class Event {

    private HashSet<Person> attendees;
    private List<Table> tables;

    public Event(HashSet<Person> guestList, List<Table> seating) {
        attendees = guestList;
        tables = seating;
    }

    public HashSet<Person> getGuestList() {
        return attendees;
    }

    public List<Table> numTables() {
        return tables;
    }

    
}
