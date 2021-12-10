package com.company;

public class Location {
    String text;
    Action[] actions;
    int id;

    Location (int cur_id, String text, Action[] actions) {
        this.text = text;
        this.actions = actions;
        id = cur_id;
    }

    String getText() {
        return text;
    }

    Action[] getActions() {
        return actions;
    }
}
