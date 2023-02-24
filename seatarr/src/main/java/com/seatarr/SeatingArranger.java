package com.seatarr;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class SeatingArranger 
{
    public static void main( String[] args ) {

        DataParser reader = new DataParser();
        try {  
            int numTables = 10;
            int tableCapacity = 5;
            HashMap<String, Preference> attendees = reader.readDataFromExcelFile("seatarr\\attendee_list.xlsx");
            ArrayList<Table> tables = new ArrayList<>();
            for (int i = 0; i < numTables; i++) {
                tables.add(new Table(i, tableCapacity));
            }
            Event event = new Event(attendees, tables);
            event.arrangeSeating();
            event.printSeating();
        } catch (IOException e) {
            System.out.println("Error: File not found");
        }
        
    }

}
