package com.seatarr;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.*;
import java.util.stream.Collectors;
import java.util.HashSet;


public class test {

    public static void main(String[] args) {

        String str = "Aidan Lofting, Nanci Ketts, Johnny Bravo";
        
        List<String> items = Arrays.asList(str.split("\\s*,\\s*"));

        HashSet<String> hsetFromString = new HashSet<String>( items );

        for (String i : items) {
            System.out.println(i);
        }
        for (String i : hsetFromString) {
            System.out.println(i);
        }


    }
    
}
