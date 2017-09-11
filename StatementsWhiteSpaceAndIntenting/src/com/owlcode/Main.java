package com.owlcode;

public class Main {

    public static void main(String[] args) {
        int myVariable = 50; // statement is this entire line
        myVariable++; // this is another statement
        myVariable--; // this is another statement
        System.out.println("This is a test"); // this is complete java statement

        System.out.println("This is " +
                "another " +
                "statement"); // these 3 rows is still one statement, semicolon completes a statement

        int anotherVariable = 50; anotherVariable++; // these are 2 statements, but it's best not to put multiple statements in one line
    }
}
