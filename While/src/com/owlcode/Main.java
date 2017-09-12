package com.owlcode;

public class Main {

    public static void main(String[] args) {
        int count = 0;

        while (count != 5) {
            System.out.println("Count value is " + count);
            count++;
        }

        System.out.println("****************");

        count = 0;
        while (true) {
            if (count == 5) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

        System.out.println("****************");

        count = 0;
        do {
            System.out.println("Count value was " + count);
            count++;

            if (count > 100) {
                break;
            }
        } while (count != 6);

        System.out.println("****************");

        // test stuff

        int number = 5;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while (number <= finishNumber) {
            if (!isEvenNumber(number)) {
                number++;
                continue; // ignores code below and does while loop again
            }

            System.out.println("Even number " + number);
            evenNumbersFound++;

            if (evenNumbersFound == 5) {
                System.out.println("Found " + evenNumbersFound + " even numbers.");
                break;
            }

            number++;
        }
    }

    public static boolean isEvenNumber (int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
