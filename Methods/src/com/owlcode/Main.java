package com.owlcode;

public class Main {

    // void means method will not return anything
    public static void main(String[] args) {

        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was " + highScore);

        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + highScore);

        byte highScorePos1 = calculateHighScorePosition(1500);
        byte highScorePos2 = calculateHighScorePosition(900);
        byte highScorePos3 = calculateHighScorePosition(400);
        byte highScorePos4 = calculateHighScorePosition(50);
        displayHighScorePosition("Tom", highScorePos1);
        displayHighScorePosition("Tim", highScorePos2);
        displayHighScorePosition("Toby", highScorePos3);
        displayHighScorePosition("Tony", highScorePos4);
    }

    // using int makes sure that returned data is int
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }

        return -1;
    }

    // test stuff

    // void method can be called procedure
    public static void displayHighScorePosition(String playerName, byte position) {
        System.out.println(playerName + " managed to get into position " + position + " on the high score table");
    }

    public static byte calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }
}
