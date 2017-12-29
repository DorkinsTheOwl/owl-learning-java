package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // <Integer> is the generic... we specify what type of data we are storing
        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
//        items.add("tom");
        items.add(4);
        items.add(5);

        printDoubled(items);
    }

    private static void printDoubled(ArrayList<Integer> n) {
        for (int i : n) {
            System.out.println(i * 2);
        }
    }
}
