package com.seatarr;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import java.util.ArrayList;

public class PreferenceTest {

    ArrayList<String> likes;
    ArrayList<String> dislikes;
    Preference pref;

    @Before
    public void doBefore() {
        likes = new ArrayList<>();
        dislikes = new ArrayList<>();
        likes.add("Joe");
        dislikes.add("Bob");
        pref = new Preference(likes, dislikes);
    }

    @Test
    public void testConstructor() {
        assertEquals(pref.getLikes().get(0), "Joe");
        assertEquals(pref.getDislikes().get(0), "Bob");
    }
    
}
