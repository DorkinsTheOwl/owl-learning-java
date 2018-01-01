package com.company;

import java.util.HashMap;
import java.util.Map;

public class Location {
    private final int locaitonID;
    private final String description;
    private final Map<String, Integer> exits;

    public Location(int locaitonID, String description, Map<String, Integer> exits) {
        this.locaitonID = locaitonID;
        this.description = description;
        if (exits != null) {
            this.exits = new HashMap<>(exits);
        } else {
            this.exits = new HashMap<>();
        }
        this.exits.put("Q", 0);
    }

//    public void addExit(String direction, int location) {
//        exits.put(direction, location);
//    }

    public int getLocaitonID() {
        return locaitonID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<String, Integer>(exits);
    }
}
