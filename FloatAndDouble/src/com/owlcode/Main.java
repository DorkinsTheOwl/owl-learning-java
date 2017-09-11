package com.owlcode;

public class Main {

    public static void main(String[] args) {

        // width of int is 32 (4 bytes)
        int myIntValue = 5 / 2 ;

        // add f after number or (float) before to properly define float
        // float has 7 decimal digits of precision
        // width of float is 32 (4 bytes)
        float myFloatValue = 5f / 3f;

        // add d after number to properly define double
        // double has 16 decimal digits of precision
        // width of double is 64 (8 bytes)
        double myDoubleValue = 5d / 3d;

        // if we don't specify float or double it will assume number is double

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        // some test activities

        double pounds = 180d;
        double kgConst = 0.45359237d;
        double kgFromPounds = pounds * kgConst;
        System.out.println(pounds + " pounds are " + kgFromPounds + " kilograms");

        double pi = 3.1415927d;
        double pi3 = 3.141_592_7d;
    }
}
