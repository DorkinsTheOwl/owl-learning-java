package com.owlcode;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Tom", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();

        double imperialMasterRace = calcFeetAndInchesToCentimeters(6, 2);
        if (imperialMasterRace < 0) {
            System.out.println("Invalid params");
        } else {
            System.out.println("6 feet and 2 inches to imperial converts to " + imperialMasterRace + " cm");
        }

        double imperialMasterRace2 = calcFeetAndInchesToCentimeters(68);
        if (imperialMasterRace2 < 0) {
            System.out.println("Invalid params");
        } else {
            System.out.println("30 inches to imperial converts to " + imperialMasterRace2 + " cm");
        }
    }

    // this is called overloading method and each method needs a signature
    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    // we can use the same name for method if the variables passed are in different amount
    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score.");
        return 0;
    }


    // test stuff

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
//        if (feet >= 0 || (inches >= 0 || inches <= 12)) {
//            double totalInches = feet * 12 + inches;
//            return calcFeetAndInchesToCentimeters(totalInches);
//
//        } else {
//            return -1;
//        }

        if (feet < 0 || ((inches < 0) || (inches > 12))) {
            return -1;
        }

        double totalInches = feet * 12 + inches;
        return calcFeetAndInchesToCentimeters(totalInches);
    }

    public static double calcFeetAndInchesToCentimeters (double inches) {
//        if (inches >= 0) {
//            return inches * 2.54;
//        } else {
//            return -1;
//        }

        if (inches < 0) {
            return -1;
        }

        return inches * 2.54;
    }
}
