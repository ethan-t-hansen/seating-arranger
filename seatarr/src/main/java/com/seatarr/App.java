package com.seatarr;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class App 
{
    public static void main( String[] args ) {

        DataParser reader = new DataParser();
        List<Table> tables = new ArrayList<>(10);
        try {  
            HashSet<Person> attendees = reader.readDataFromExcelFile("seatarr\\attendee_list.xlsx"); 
            Event gala = new Event(attendees, tables);
            for (Person p : attendees) {
                System.out.println(p.getName());
            }
        } catch (IOException e) {
            System.out.println("Error: File not found");
        }
        
    }



}
