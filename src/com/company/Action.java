package com.company;

public class Action {
    String text;
    int choice;

    Action (String text, int id_move) {
        this.text = text;
        choice = id_move;
    }
    String getText() {
        return text;
    }

    int getDestLocationId() {
        return choice;
    }
}
