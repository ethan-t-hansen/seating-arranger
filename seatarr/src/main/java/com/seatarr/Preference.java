package com.seatarr;
import java.util.ArrayList;

public class Preference {

    private ArrayList<String> likes;
    private ArrayList<String> dislikes;

    public Preference(ArrayList<String> likes, ArrayList<String> dislikes) {
        this.likes = likes;
        this.dislikes = dislikes;
    }

    public void setLikes(ArrayList<String> newLikes) {
        this.likes = newLikes;
    }

    public void setDislikes(ArrayList<String> newDislikes) {
        this.dislikes = newDislikes;
    }

    public ArrayList<String> getLikes() {
        return likes;
    }

    public ArrayList<String> getDislikes() {
        return dislikes;
    }
    
}
