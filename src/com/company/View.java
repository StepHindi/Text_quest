package com.company;

public class View {
    void showLocation(Location loc) {
        System.out.print(loc.text + " Для выбора введите: ");
        for (Action el : loc.actions) {
            System.out.print(el.text + " ");
        }
        System.out.println();

    }
}
