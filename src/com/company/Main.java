package com.company;

import java.util.Scanner;

public class Main implements UserChoiseListener{

    public static void main(String[] args) {
        int locId = 0;
        boolean corr_answer = false;
        Scanner sc = new Scanner(System.in);
        View screen = new View();
        Storage storage = new Storage();
        screen.showLocation(storage.getLocation(locId));
        while (true) {
            while (true) {
                String answer = sc.nextLine();
                for (Action el : storage.getLocation(locId).actions) {
                    if (el.text.equals(answer)) {
                        locId = el.choice;
                        corr_answer = true;
                        break;
                    }
                }
                if (!corr_answer) {
                    System.out.println("wrong answer!");
                } else {
                    break;
                }
            }
            screen.showLocation(storage.getLocation(locId));
            corr_answer = false;
        }
    }

    @Override
    public void userChoice() {

    }
}
