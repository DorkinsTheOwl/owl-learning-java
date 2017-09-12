package com.owlcode;

public class Main {

    public static void main(String[] args) {

        for (int i = 2; i < 9; i++){
            // (double) is not really needed
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, (double) i)));
        }

        System.out.println("***************************");

        for (int i = 8; i > 1; i--){
            // (double) is not really needed
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, (double) i)));
        }

        System.out.println("***************************");

        byte countOfPrime = 0;
        for (int i = 10; i < 77; i++) {
            if (isPrime(i)) {
                countOfPrime++;
                System.out.println("Number " + i + " is a prime number");
                if (countOfPrime == 3) {
                    System.out.println("Found at least " + countOfPrime + " prime numbers\nExiting for loop.");
                    break;
                }
            }
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * interestRate) / 100;
    }

    public static boolean isPrime (int n) {
        if (n == 1) {
            return false;
        }

//        for (int i = 2; i <= n/2; i++) {
        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
