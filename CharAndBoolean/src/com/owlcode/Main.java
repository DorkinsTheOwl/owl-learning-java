package com.owlcode;

public class Main {

    public static void main(String[] args) {

        // char stores one letter, number, special character
        // width of 16 (2 bytes)
        char myChar = '\u00A9';
        System.out.println("Unicode output was: " + myChar);

        boolean myBoolean = false;
        boolean isMale = true;

        char myChar2 = '\u00AE';
        System.out.println("Unicode output was: " + myChar2);

        char myChar3 = 'a';
        System.out.println(myChar3);
    }
}
