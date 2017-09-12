package com.owlcode;

public class Main {

    public static void main(String[] args) {
        int switchValue = 4;

        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Value was not 1 or 2");
                break;
        }

        // test stuff
        char switchValue2 = 'D';

        switch (switchValue2) {
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
                break;
            case 'C': case 'D': case 'E':
                System.out.println("Found " + switchValue2);
                break;
            default:
                System.out.println("Did not find A, B, C, D or E");
                break;
        }

        String month = "MaY";

        switch(month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "may":
                System.out.println("May");
                break;
            default:
                System.out.println("Not sure");
        }
    }
}
