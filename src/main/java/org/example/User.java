package org.example;

public class User {

    int id;
    String name;

    public String getFavColour() {
        return favColour;
    }

    String favColour;

    public void setData (int id1, String nm, String fc) {
        id = id1;
        name = nm;
        favColour = fc;
    }

    public User (int id, String name, String favColour){
        this.id = id;
        this.name = name;
        this.favColour = favColour;
    }

}
