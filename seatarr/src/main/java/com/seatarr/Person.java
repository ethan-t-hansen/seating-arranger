// package com.seatarr;
// import java.util.Set;
// import java.util.HashSet;
// import java.util.ArrayList;
// import java.util.List;
// import java.util.Arrays;

// public class Person {

//     private String fullName;
//     private String status;
//     private boolean isSeated;
//     private Table table;
//     private HashSet<String> likes;
//     private HashSet<String> dislikes;

//     public Person() {
//         likes = new HashSet<>();
//         dislikes = new HashSet<>();
//         isSeated = false;
//     }

//     public void setName(String newName) {
//         this.fullName = newName;
//     }

//     public void setLikes(String likes) {
//         this.likes = stringToSet(likes);
//     }

//     public void setDislikes(String dislikes) {
//         this.dislikes = stringToSet(dislikes);
//     }

//     public ArrayList<String> stringToArrayList(String list) {
        
//         List<String> asList = Arrays.asList(list.split("\\s*,\\s*"));

//         ArrayList<String> arrlist = new ArrayList<String>(asList);

//         return arrlist;
//     }

//     public boolean isSeated() {
//         return this.isSeated;
//     }

//     public String getName() {
//         return fullName;
//     } 

//     public HashSet<String> getLikes() {
//         return likes;
//     }

//     public HashSet<String> getDislikes() {
//         return likes;
//     }
    
// }
