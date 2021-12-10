package com.company;

public class Location {
    String text;
    Action[] actions;

    Location (String text, Action[] actions) {
        this.text = text;
        this.actions = actions;
    }

    String getText() {
        return text;
    }

    Action[] getActions() {
        return actions;
    }
}
