package com.owlcode;

public class Main {

    public static void main(String[] args) {

        // int (integer) - any number between -2_147_483_648 and 2_147_483_647
        // int has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotal = (myMinValue / 2);
        System.out.println("myTotal = " + myTotal);

        // byte - any number between -128 and 127, uses less space than integer
        // byte has a width of 8
        byte myByteValue = -128;
        byte myNewByteValue = (byte) (myByteValue / 2); // (byte) tells to treat this as byte, otherwise it will create int
        System.out.println("myNewByteValue = " + myNewByteValue);

        // short - any number between -32768 and 32767, uses twice the amount of space of byte and half the amount of an integer
        // short has a width of 16
        short myShortValue = 1231;
        short myNewShortValue = (short) (myShortValue / 2); // (short)tells to treat this as short, otherwise it will create int

        // long - any number between -9_223_372_036_854_775_808 and 9_223_372_036_854_775_807, uses twice the amount of space of int
        // long has a width of 64
        long myLongValue = 9_223_372_036_854_775_807L;

        // Some test variables
        byte byteValue = 100;
        short shortValue = 1000;
        int intValue = 1000000;

        long longTotal = 50000L + (10L * (byteValue + shortValue + intValue));
        short shortTotal = (short) (1000 + 10 * (byteValue + shortValue + intValue));
        System.out.println("longTotal = " + longTotal);
        System.out.println("shortTotal = " + shortTotal);
    }
}
