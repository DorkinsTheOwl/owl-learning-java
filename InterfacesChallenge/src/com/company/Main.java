package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Player tom = new Player("Tom", 10, 15);
        System.out.println(tom.toString());
        saveObject(tom);
        tom.setHitPoints(8);
        System.out.println(tom);
        tom.setWeapon("Stormbringer");
        saveObject(tom);
//        loadObject(tom);
        System.out.println(tom);

        ISavable wereworlf = new Monster("Wereworlf", 20, 40);
        System.out.println("Strength = " + ((Monster) wereworlf).getStrenght()); // we use getter like this because we declared it as interface
        System.out.println(wereworlf);
        saveObject(wereworlf);
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                        "1 to enter a string\n" +
                        "0 to quit");

        while (!quit) {
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISavable objectToSave) {
        for (int i=0; i<objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    public static void loadObject(ISavable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}
