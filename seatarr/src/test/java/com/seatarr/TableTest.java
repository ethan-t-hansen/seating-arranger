package com.seatarr;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class TableTest 
{

    Table table;
    int tableNumber;
    int capacity;

    @Before
    public void doBefore() {
        tableNumber = 1;
        capacity = 5;
        table = new Table(tableNumber, capacity);
    }

    @Test
    public void testConstructor() {
        assertEquals(tableNumber, table.getTableNumber());
        assertEquals(capacity, table.getCapacity());
    }

    @Test
    public void testAddMember() {
        assertEquals(0, table.getMembers().size());
        table.addMember("joe");
        assertEquals(1, table.getMembers().size());
    }


}
