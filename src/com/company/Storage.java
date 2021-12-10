package com.company;

public class Storage {

    Location[] locs = new Location[10];
    Location getLocation(int id) {
        return locs[id];
    }
}
