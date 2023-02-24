package com.seatarr;
import java.util.ArrayList;

public class Preference {

    private ArrayList<String> likes;
    private ArrayList<String> dislikes;

    public Preference(ArrayList<String> likes, ArrayList<String> dislikes) {
        this.likes = likes;
        this.dislikes = dislikes;
    }

    public ArrayList<String> getLikes() {
        return likes;
    }

    public ArrayList<String> getDislikes() {
        return dislikes;
    }
    
}
