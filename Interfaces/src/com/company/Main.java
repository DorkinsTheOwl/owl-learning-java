package com.company;

public class Main {

    public static void main(String[] args) {
        // DeskPhone tomsPhone; - also valid
        ITelphone tomsPhone;
        tomsPhone = new DeskPhone(12345);
        tomsPhone.powerOn();
        tomsPhone.callPhone(12345);
        tomsPhone.answer();

        tomsPhone = new MobilePhone(23456);
        // tomsPhone.powerOn();
        tomsPhone.callPhone(23456);
        tomsPhone.answer();
    }
}
